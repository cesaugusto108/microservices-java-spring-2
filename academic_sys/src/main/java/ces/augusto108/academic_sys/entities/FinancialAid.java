package ces.augusto108.academic_sys.entities;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_financial_aid")
public class FinancialAid implements Serializable {
    private static final long serialVersionUID = 867307980781295419L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tb_aid_id")
    private Integer id;

    @NotBlank
    @Column(name = "aid_type")
    private String type;

    @NotBlank
    @Min(0L)
    @Column(name = "aid_amount")
    private Double amount;

    public FinancialAid() {
    }

    public FinancialAid(Integer id, String type, Double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FinancialAid that = (FinancialAid) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return type + " ($" + amount + ")";
    }
}
