package AuthServerService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AuthServerService.Entities.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    public UserEntity findByIdentificationNumber_UserAndPassword_User(Long IdentificationNumber_User, String Password_User) throws Exception;
}
