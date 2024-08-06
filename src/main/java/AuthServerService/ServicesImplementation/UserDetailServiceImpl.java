package AuthServerService.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import AuthServerService.Entities.UserEntity;
import AuthServerService.Repositories.IUserRepository;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity user = userRepository.findByIdentificationNumber(username);
        if (user == null) {
            throw new UsernameNotFoundException("Usuario no encontrado: " + username);
        }
        return user;
    }

}
