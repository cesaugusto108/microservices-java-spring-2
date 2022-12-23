package ces.augusto108.academic_sys.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_student")
public class Student implements Serializable {
    private static final long serialVersionUID = 8308465496240598296L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tb_student_id")
    private Integer id;

    @NotBlank
    @Column(name = "student_name")
    private String name;

    @NotBlank
    @Column(name = "student_age")
    private Integer age;

    @NotBlank
    @Column(name = "student_cpf", unique = true)
    private String cpf;

    @NotBlank
    @Column(name = "student_registration", unique = true)
    private Long registration;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private Set<Course> courses = new HashSet<>();


    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_student_aid",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "aid_id")
    )
    private Set<FinancialAid> financialAids = new HashSet<>();

    public Student() {
    }

    public Student(Integer id, String name, Integer age, String cpf, Long registration) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cpf = cpf;
        this.registration = registration;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getCpf() {
        return cpf;
    }

    public Long getRegistration() {
        return registration;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public Set<FinancialAid> getFinancialAids() {
        return financialAids;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRegistration(Long registration) {
        this.registration = registration;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public void setFinancialAids(Set<FinancialAid> financialAids) {
        this.financialAids = financialAids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (" + registration + ")";
    }
}
