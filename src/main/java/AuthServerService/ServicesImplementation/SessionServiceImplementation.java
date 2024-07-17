package AuthServerService.ServicesImplementation;

import org.springframework.stereotype.Service;

import AuthServerService.Entities.UserEntity;
import AuthServerService.Repositories.IUserRepository;
import AuthServerService.Services.ISessionService;
import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class SessionServiceImplementation implements ISessionService {

    @Autowired
    private IUserRepository UserRepository;

    @Override
    @Transactional
    public List<UserEntity> LogIn(String EmailUser, String PasswordUser) throws Exception {
        return UserRepository.findAll();
    }

    @Override
    @Transactional
    public UserEntity LogOut() throws Exception {
        return null;
    }

    

}
