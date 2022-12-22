package ces.augusto108.academic_sys.model.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

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
    @Column(name = "student_cpf")
    private String cpf;

    @NotBlank
    @Column(name = "student_registration")
    private Long registration;

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
