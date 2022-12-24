package ces.augusto108.finaid_payment_sys.services;

import ces.augusto108.finaid_payment_sys.entities.FinancialAidPayment;
import ces.augusto108.finaid_payment_sys.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class FinancialAidPaymentService {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${academic_sys.host}")
    private String host;

    public FinancialAidPayment getPayment(Integer studentId) {
        Map<String, String> variables = new HashMap<>();
        variables.put("id", String.valueOf(studentId));

        Student s = restTemplate.getForObject(host + "/students/list/{id}", Student.class, variables);

        return new FinancialAidPayment(
                s.getCpf(),
                s.getRegistration(),
                s.getName(),
                s.getCourses().size(),
                s.getFinancialAids());
    }
}
