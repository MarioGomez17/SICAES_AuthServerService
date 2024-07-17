package AuthServerService.Services;

import AuthServerService.Entities.UserEntity;

public interface ISessionService {

    public UserEntity LogIn(String IdentificationNumber, String Password_User) throws Exception;

    public boolean LogOut() throws Exception;
}