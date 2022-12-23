package ces.augusto108.academic_sys.controllers;

import ces.augusto108.academic_sys.entities.Student;
import ces.augusto108.academic_sys.services.StudentService;
import ces.augusto108.academic_sys.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<Student> findById(@RequestParam Integer id) {
        return ResponseEntity.ok(studentService.findById(id));
    }
}
