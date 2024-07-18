package AuthServerService.ServicesImplementation;

import org.springframework.stereotype.Service;

import AuthServerService.Repositories.IUserRepository;
import AuthServerService.Services.ISessionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Service
public class SessionServiceImplementation implements ISessionService {

    @Autowired
    private IUserRepository UserRepository;

    @Override
    public UserDetailsService userDetails() {
        return new UserDetailsService() {
            @Override
            public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
                return UserRepository.findByIdentificationNumber(username);
            }
        };
    }
}
