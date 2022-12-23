package ces.augusto108.academic_sys.services;

import ces.augusto108.academic_sys.entities.Course;
import ces.augusto108.academic_sys.repositories.CourseRepository;
import ces.augusto108.academic_sys.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    public Course findById(Integer id) {
        return courseRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Id not found. Id: " + id + " - Type: " + Course.class.getName())
        );
    }
}
