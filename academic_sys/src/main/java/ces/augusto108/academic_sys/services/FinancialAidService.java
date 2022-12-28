package ces.augusto108.academic_sys.services;

import ces.augusto108.academic_sys.entities.FinancialAid;
import ces.augusto108.academic_sys.repositories.FinancialAidRepository;
import ces.augusto108.academic_sys.services.exceptions.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialAidService {
    @Autowired
    private FinancialAidRepository financialAidRepository;

    public List<FinancialAid> findAll() {
        return financialAidRepository.findAll();
    }

    public FinancialAid findById(Integer id) {
        return financialAidRepository.findById(id)
                .orElseThrow(
                        () -> new NotFoundException(
                                "Id not found. Id: " + id + " - Type: " + FinancialAid.class.getName()
                        )
                );
    }
}
