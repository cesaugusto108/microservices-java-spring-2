package ces.augusto108.academic_sys.repositories;

import ces.augusto108.academic_sys.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
