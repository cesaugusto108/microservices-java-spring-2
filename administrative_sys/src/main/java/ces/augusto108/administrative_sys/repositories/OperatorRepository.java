package ces.augusto108.administrative_sys.repositories;

import ces.augusto108.administrative_sys.entities.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface OperatorRepository extends JpaRepository<Operator, Integer> {
    Optional<Operator> findByEmail(String email);
}
