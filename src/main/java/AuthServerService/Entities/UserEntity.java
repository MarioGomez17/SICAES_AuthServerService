package AuthServerService.Entities;

import java.sql.Date;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_User")
    private Long id;

    @Column(name = "FirstName_User")
    @Nonnull
    private String firstName;

    @Column(name = "SecondName_User")
    @Nullable
    private String secondName;

    @Column(name = "FirstLastName_User")
    @Nonnull
    private String firstLastName;

    @Column(name = "SecondLastName_User")
    @Nullable
    private String secondLastNamer;

    @ManyToOne
    @JoinColumn(name = "IdentificationType_User")
    private IdentificationTypeEntity identificationType;

    @Column(name = "IdentificationNumber_User")
    @Nonnull
    private String identificationNumber;

    @Column(name = "Password_User")
    @Nonnull
    private String password;

    @Column(name = "BirthDate_User")
    @Nonnull
    private Date birthDate;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "User_Roles", joinColumns = @JoinColumn(name = "Id_User"), inverseJoinColumns = @JoinColumn(name = "Id_Role"))
    private Set<RoleEntity> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (RoleEntity role : this.roles) {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }
        return authorities;
    }

    @Override
    public String getUsername() {
        return this.identificationNumber;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
