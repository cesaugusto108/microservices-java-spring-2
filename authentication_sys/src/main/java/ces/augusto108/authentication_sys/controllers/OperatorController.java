package ces.augusto108.authentication_sys.controllers;

import ces.augusto108.authentication_sys.entities.Operator;
import ces.augusto108.authentication_sys.services.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/op")
public class OperatorController {
    @Autowired
    private OperatorService operatorService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<Operator> findByEmail(@RequestParam String email) {
        Operator o = operatorService.findByEmail(email);

        if (o != null) {
            return ResponseEntity.ok(o);
        } else return ResponseEntity.notFound().build();
    }
}
