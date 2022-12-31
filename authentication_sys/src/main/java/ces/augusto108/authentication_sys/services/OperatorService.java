package ces.augusto108.authentication_sys.services;

import ces.augusto108.authentication_sys.entities.Operator;
import ces.augusto108.authentication_sys.feignclients.OperatorFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class OperatorService implements UserDetailsService {
    private final static Logger LOGGER = LoggerFactory.getLogger(OperatorService.class);

    @Autowired
    private OperatorFeignClient operatorFeignClient;

    public Operator findByEmail(String email) {
        Operator o = operatorFeignClient.findByEmail(email).getBody();

        if (o == null) {
            LOGGER.error("Login details not found: " + email);

            throw new IllegalArgumentException("Email address not found.");
        }

        LOGGER.info("Login credentials found: " + email);

        return o;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Operator o = operatorFeignClient.findByEmail(username).getBody();

        if (o == null) {
            LOGGER.error("Login details not found: " + username);

            throw new UsernameNotFoundException("Email address not found.");
        }

        LOGGER.info("Login credentials found: " + username);

        return o;
    }
}
