package HRDSystem.service;

import HRDSystem.converter.impl.EmployeeConverter;
import HRDSystem.dto.CredentialsDto;
import HRDSystem.dto.EmployeeDto;
import HRDSystem.entity.EmployeeEntity;
import HRDSystem.repository.EmployeeRepository;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

  private final EmployeeConverter employeeConverter;
  private final EmployeeRepository employeeRepository;

  public List<EmployeeDto> getAll(Sort sort) {
    return employeeRepository.findAll(sort).stream()
        .map(employeeConverter::toDto)
        .collect(Collectors.toList());
  }

  public EmployeeDto login(CredentialsDto credentialsDto) {
    return employeeRepository.findByEmail(credentialsDto.getEmail())
        .filter(user -> user.getPassword().equals(credentialsDto.getPassword()))
        .map(employeeConverter::toDto)
        .orElse(null);
  }

  public void register(EmployeeEntity employeeEntity) {
    employeeRepository.save(employeeEntity);
  }

  @Transactional
  public void removeById(Long id) {
    employeeRepository.deleteById(id);
  }
}
