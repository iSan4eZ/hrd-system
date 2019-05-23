package HRDSystem.controler;

import HRDSystem.dto.CredentialsDto;
import HRDSystem.dto.EmployeeDto;
import HRDSystem.entity.EmployeeEntity;
import HRDSystem.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

  private final EmployeeService employeeService;

  @GetMapping
  public List<EmployeeDto> getAll(Sort sort) {
    return employeeService.getAll(sort);
  }

  @PostMapping("/login")
  public EmployeeDto login(@RequestBody CredentialsDto credentialsDto) {
    return employeeService.login(credentialsDto);
  }

  @PostMapping("/register")
  public void register(@RequestBody EmployeeEntity userEntity) {
    employeeService.register(userEntity);
  }

  @PostMapping("/delete/{id}")
  public void removeById(@PathVariable Long id) {
    employeeService.removeById(id);
  }

}
