package ces.augusto108.authentication_sys.controllers;

import ces.augusto108.authentication_sys.entities.Operator;
import ces.augusto108.authentication_sys.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/op")
public class OperatorController {
    @Autowired
    private OperatorService operatorService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<Operator> findByEmail(@RequestParam String email) {
        Operator o = null;
        try {
            o = operatorService.findByEmail(email);

            return ResponseEntity.ok(o);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
