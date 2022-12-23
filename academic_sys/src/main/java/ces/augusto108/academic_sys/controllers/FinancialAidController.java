package ces.augusto108.academic_sys.controllers;

import ces.augusto108.academic_sys.entities.FinancialAid;
import ces.augusto108.academic_sys.services.FinancialAidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/financial")
public class FinancialAidController {
    @Autowired
    private FinancialAidService financialAidService;

    @RequestMapping(value = "/list/all", method = RequestMethod.GET)
    public ResponseEntity<List<FinancialAid>> findAll() {
        return ResponseEntity.ok(financialAidService.findAll());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<FinancialAid> findById(@RequestParam Integer id) {
        return ResponseEntity.ok(financialAidService.findById(id));
    }
}
