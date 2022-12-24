package ces.augusto108.finaid_payment_sys.services;

import ces.augusto108.finaid_payment_sys.entities.FinancialAidPayment;
import org.springframework.stereotype.Service;

@Service
public class FinancialAidPaymentService {
    public FinancialAidPayment getPayment(Integer studentId) {
        return new FinancialAidPayment(1, studentId);
    }
}
