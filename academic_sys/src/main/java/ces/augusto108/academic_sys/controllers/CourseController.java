package ces.augusto108.academic_sys.controllers;

import ces.augusto108.academic_sys.entities.Course;
import ces.augusto108.academic_sys.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/list/all", method = RequestMethod.GET)
    public ResponseEntity<List<Course>> findAll() {
        return ResponseEntity.ok(courseService.findAll());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<Course> findById(@RequestParam Integer id) {
        return ResponseEntity.ok(courseService.findById(id));
    }
}
