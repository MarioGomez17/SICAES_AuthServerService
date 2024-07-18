package AuthServerService.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface ISessionService {

    public UserDetailsService userDetails();
}