package ces.augusto108.administrative_sys.controllers;

import ces.augusto108.administrative_sys.entities.Operator;
import ces.augusto108.administrative_sys.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/operators")
public class OperatorController {
    @Autowired
    private OperatorService operatorService;

    @RequestMapping(value = "/list/all", method = RequestMethod.GET)
    public ResponseEntity<List<Operator>> findAll() {
        return ResponseEntity.ok(operatorService.findAll());
    }

    @RequestMapping(value = "/list/id", method = RequestMethod.GET)
    public ResponseEntity<Operator> findById(@RequestParam Integer id) {
        return ResponseEntity.ok(operatorService.findById(id));
    }

    @RequestMapping(value = "/list/email", method = RequestMethod.GET)
    public ResponseEntity<Operator> findByEmail(@RequestParam String email) {
        return ResponseEntity.ok(operatorService.findByEmail(email));
    }
}
