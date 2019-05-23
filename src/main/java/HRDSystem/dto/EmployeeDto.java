package HRDSystem.dto;

import HRDSystem.entity.EmployeeEntity.UserRole;
import HRDSystem.entity.OfficeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

  private Long id;

  private String email;

  private UserRole role;

  private OfficeEntity officeEntity;

}
