package ces.augusto108.finaid_payment_sys.services;

import ces.augusto108.finaid_payment_sys.entities.FinancialAidPayment;
import ces.augusto108.finaid_payment_sys.entities.Student;
import ces.augusto108.finaid_payment_sys.feignclients.StudentFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialAidPaymentService {
    @Autowired
    private StudentFeignClient studentFeignClient;

    public FinancialAidPayment getPayment(Integer studentId) {
        Student s = studentFeignClient.findById(studentId).getBody();

        if (s != null) {
            return new FinancialAidPayment(
                    s.getCpf(),
                    s.getRegistration(),
                    s.getName(),
                    s.getCourses().size(),
                    s.getFinancialAids()
            );
        } else return null;
    }
}
