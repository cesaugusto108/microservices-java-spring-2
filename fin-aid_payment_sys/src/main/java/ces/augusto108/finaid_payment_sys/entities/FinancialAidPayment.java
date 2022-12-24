package ces.augusto108.finaid_payment_sys.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class FinancialAidPayment implements Serializable {
    private static final long serialVersionUID = -5083454764501622210L;

    private String studentCpf;
    private Long studentRegistration;
    private String studentName;

    private Integer numberOfCourses;
    private Set<FinancialAid> financialAids = new HashSet<>();

    private Double total;


    public FinancialAidPayment() {
    }

    public FinancialAidPayment(
            String studentCpf,
            Long studentRegistration,
            String studentName,
            Integer numberOfCourses,
            Set<FinancialAid> financialAids) {
        this.studentCpf = studentCpf;
        this.studentRegistration = studentRegistration;
        this.studentName = studentName;
        this.numberOfCourses = numberOfCourses;
        this.financialAids = financialAids;
    }

    public String getStudentCpf() {
        return studentCpf;
    }

    public Long getStudentRegistration() {
        return studentRegistration;
    }

    public String getStudentName() {
        return studentName;
    }

    public Integer getNumberOfCourses() {
        return numberOfCourses;
    }

    public Set<FinancialAid> getFinancialAids() {
        return financialAids;
    }

    public Double getTotal() {
        double total = 0.0;
        double x = 0.0;
        for (FinancialAid financialAid : financialAids) {
            if (financialAid.getType().equals("BOOKS")) x = financialAid.getAmount() * numberOfCourses;
            else x = financialAid.getAmount();

            total += x;
        }

        return total;
    }
}
