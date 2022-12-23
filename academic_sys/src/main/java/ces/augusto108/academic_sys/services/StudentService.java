package ces.augusto108.academic_sys.services;

import ces.augusto108.academic_sys.entities.Student;
import ces.augusto108.academic_sys.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public Student findById(Integer id) {
        return studentRepository.findById(id).orElseThrow();
    }
}
