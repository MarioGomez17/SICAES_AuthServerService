package AuthServerService.ServicesImplementation;

import org.springframework.stereotype.Service;

import AuthServerService.Entities.UserEntity;
import AuthServerService.Repositories.IUserRepository;
import AuthServerService.Services.ISessionService;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SessionServiceImplementation implements ISessionService {

    @Autowired
    private IUserRepository UserRepository;

    @Override
    @Transactional
    public UserEntity LogIn(Long IdentificationNumber_User, String Password_User) throws Exception {
        return UserRepository.findByIdentificationNumber_UserAndPassword_User(IdentificationNumber_User, Password_User);
    }

    @Override
    @Transactional
    public boolean LogOut() throws Exception {
        return true;
    }

}
