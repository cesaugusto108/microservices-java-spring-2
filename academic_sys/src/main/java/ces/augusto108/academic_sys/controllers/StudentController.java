package ces.augusto108.academic_sys.controllers;

import ces.augusto108.academic_sys.entities.Student;
import ces.augusto108.academic_sys.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list/all", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> findAll() {
        return ResponseEntity.ok(studentService.findAll());
    }

    @RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
    public ResponseEntity<Student> findById(@PathVariable Integer id) {
        return ResponseEntity.ok(studentService.findById(id));
    }
}
