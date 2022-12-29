package ces.augusto108.authentication_sys.services;

import ces.augusto108.authentication_sys.entities.Operator;
import ces.augusto108.authentication_sys.feignclients.OperatorFeignClient;
import feign.FeignException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OperatorService {
    private final static Logger LOGGER = LoggerFactory.getLogger(OperatorService.class);

    @Autowired
    private OperatorFeignClient operatorFeignClient;

    public Operator findByEmail(String email) {
        try {
            Operator o = operatorFeignClient.findByEmail(email).getBody();

            LOGGER.info("Login credentials found: " + email);

            return o;
        } catch (FeignException e) {
            LOGGER.info("Login details not found: " + email);

            return null;
        }
    }
}
