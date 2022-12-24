package ces.augusto108.finaid_payment_sys.controllers;

import ces.augusto108.finaid_payment_sys.entities.FinancialAidPayment;
import ces.augusto108.finaid_payment_sys.services.FinancialAidPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/payments")
public class FinancialAidPaymentController {
    @Autowired
    private FinancialAidPaymentService financialAidPaymentService;

    @RequestMapping(value = "/payment", method = RequestMethod.GET)
    public ResponseEntity<FinancialAidPayment> getPayment(@RequestParam Integer id) {
        return ResponseEntity.ok(financialAidPaymentService.getPayment(id));
    }
}
