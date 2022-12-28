package ces.augusto108.administrative_sys.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "tb_operator")
public class Operator implements Serializable {
    private static final long serialVersionUID = 8338222707332974650L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tb_student_id")
    private Integer id;

    @NotBlank
    @Column(name = "operator_name")
    private String name;

    @NotBlank
    @Column(name = "operator_email", unique = true)
    private String email;

    @NotBlank
    @Column(name = "operator_password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "tb_operator_role",
            joinColumns = @JoinColumn(name = "operator_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private final Set<Role> roles = new HashSet<>();

    public Operator() {
    }

    public Operator(Integer id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return id.equals(operator.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (" + email + ")";
    }
}
