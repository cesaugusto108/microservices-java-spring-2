package ces.augusto108.finaid_payment_sys.feignclients;

import ces.augusto108.finaid_payment_sys.entities.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "academic-sys", path = "/students")
public interface StudentFeignClient {
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ResponseEntity<Student> findById(@RequestParam Integer id);
}
