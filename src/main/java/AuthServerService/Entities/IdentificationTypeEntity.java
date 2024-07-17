package AuthServerService.Entities;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "IdentificationType")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class IdentificationTypeEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_IdentificationType")
    private Long Id_IdentificationType;

    @Column(name = "Name_IdentificationType")
    @Nonnull
    private String Name_IdentificationType;

    @Column(name = "Symbol_IdentificationType")
    @Nonnull
    private String Symbol_IdentificationType;
    
}