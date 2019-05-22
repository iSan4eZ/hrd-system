package HRDSystem.repository;

import HRDSystem.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfficeRepository extends JpaRepository<EmployeeEntity, Long> {

}
