package ces.augusto108.finaid_payment_sys.entities;

import java.io.Serializable;
import java.util.Objects;

public class FinancialAid implements Serializable {
    private static final long serialVersionUID = -1139317554238030865L;

    private Integer id;
    private String type;
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
