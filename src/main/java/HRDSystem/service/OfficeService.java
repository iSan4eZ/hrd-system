package HRDSystem.service;

import HRDSystem.entity.OfficeEntity;
import HRDSystem.repository.OfficeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OfficeService {

  private final OfficeRepository officeRepository;

  public void create(OfficeEntity officeEntity) {
    officeRepository.save(officeEntity);
  }

  @Transactional
  public void removeById(Long id) {
    officeRepository.deleteById(id);
  }

  public List<OfficeEntity> getAll(Sort sort) {
    return officeRepository.findAll(sort);
  }
}
