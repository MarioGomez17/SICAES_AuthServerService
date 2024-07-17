package AuthServerService.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import AuthServerService.Entities.IdentificationTypeEntity;

@Repository
public interface IIdentificationTypeRepository extends JpaRepository<IdentificationTypeEntity, Long> {

}