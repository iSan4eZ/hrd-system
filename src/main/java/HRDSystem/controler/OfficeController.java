package HRDSystem.controler;

import HRDSystem.service.OfficeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/office")
public class OfficeController {

  private final OfficeService officeService;

}
