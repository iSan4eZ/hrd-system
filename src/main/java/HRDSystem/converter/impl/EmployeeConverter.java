package HRDSystem.converter.impl;

import HRDSystem.converter.AbstractConverter;
import HRDSystem.converter.Converter;
import HRDSystem.dto.EmployeeDto;
import HRDSystem.entity.EmployeeEntity;
import org.modelmapper.ModelMapper;

@Converter
public class EmployeeConverter extends AbstractConverter<EmployeeEntity, EmployeeDto> {

  public EmployeeConverter(ModelMapper mapper) {
    super(EmployeeEntity.class, EmployeeDto.class, mapper);
  }

}
