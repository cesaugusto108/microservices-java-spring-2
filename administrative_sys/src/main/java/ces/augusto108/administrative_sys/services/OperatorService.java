package ces.augusto108.administrative_sys.services;

import ces.augusto108.administrative_sys.entities.Operator;
import ces.augusto108.administrative_sys.repositories.OperatorRepository;
import ces.augusto108.administrative_sys.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperatorService {
    @Autowired
    private OperatorRepository operatorRepository;

    public List<Operator> findAll() {
        return operatorRepository.findAll();
    }

    public Operator findById(Integer id) {
        return operatorRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Id not found. Id: " + id + " - Type: " + Operator.class.getName())
        );
    }

    public Operator findByEmail(String email) {
        return operatorRepository.findByEmail(email).orElseThrow(
                () -> new NotFoundException(
                        "Email address not found. Email: " + email + " - Type: " + Operator.class.getName()
                )
        );
    }

}
