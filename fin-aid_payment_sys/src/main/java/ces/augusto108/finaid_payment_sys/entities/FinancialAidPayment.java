package ces.augusto108.finaid_payment_sys.entities;

import java.io.Serializable;
import java.util.Objects;

public class FinancialAidPayment implements Serializable {
    private static final long serialVersionUID = -5083454764501622210L;

    private Integer id;
    private Integer studentId;
    private Double amount;

    public FinancialAidPayment() {
    }

    public FinancialAidPayment(Integer id, Integer studentId) {
        this.id = id;
        this.studentId = studentId;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public Double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancialAidPayment that = (FinancialAidPayment) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
