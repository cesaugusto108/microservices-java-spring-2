package ces.augusto108.academic_sys.repositories;

import ces.augusto108.academic_sys.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
