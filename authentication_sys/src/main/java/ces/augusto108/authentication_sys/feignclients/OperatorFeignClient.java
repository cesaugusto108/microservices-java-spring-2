package ces.augusto108.authentication_sys.feignclients;

import ces.augusto108.authentication_sys.entities.Operator;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "administrative-sys", path = "/operators")
public interface OperatorFeignClient {
    @RequestMapping(value = "/list/email", method = RequestMethod.GET)
    ResponseEntity<Operator> findByEmail(@RequestParam String email);
}
