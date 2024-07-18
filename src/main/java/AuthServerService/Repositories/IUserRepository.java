package AuthServerService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AuthServerService.Entities.UserEntity;

@Repository
public interface IUserRepository extends JpaRepository<UserEntity, Long> {

    public UserEntity findByIdentificationNumber(String Username);
}
