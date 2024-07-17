package AuthServerService.Services;

import java.util.List;

import AuthServerService.Entities.UserEntity;

public interface ISessionService {

    public List<UserEntity> LogIn(String EmailUser, String PasswordUser) throws Exception;

    public UserEntity LogOut() throws Exception;
}