package ces.augusto108.academic_sys.controllers;

import ces.augusto108.academic_sys.entities.Student;
import ces.augusto108.academic_sys.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
@RefreshScope
public class StudentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Value("${test.config}")
    private String testConfig;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list/all", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<Student> findById(@RequestParam Integer id) {
        return ResponseEntity.ok(studentService.findById(id));
    }

    @RequestMapping(value = "/configs", method = RequestMethod.GET)
    public ResponseEntity<Void> getTestConfigs() {
        LOGGER.info("Config: " + testConfig);

        return ResponseEntity.noContent().build();
    }
}
