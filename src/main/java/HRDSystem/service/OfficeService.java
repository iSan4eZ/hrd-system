package HRDSystem.service;

import HRDSystem.repository.OfficeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OfficeService {

  private final OfficeRepository officeRepository;

}
