package AuthServerService.Services;

import AuthServerService.Entities.UserEntity;

public interface ISessionService {

    public UserEntity LogIn(Long IdentificationNumber_User, String Password_User) throws Exception;

    public boolean LogOut() throws Exception;
}