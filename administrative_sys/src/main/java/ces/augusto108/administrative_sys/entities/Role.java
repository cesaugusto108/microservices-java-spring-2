package ces.augusto108.administrative_sys.entities;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_role")
public class Role implements Serializable {
    private static final long serialVersionUID = -3889109624634671708L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY
    )
    @Column(name = "tb_role_id")
    private Integer id;

    @NotBlank
    @Column(name = "role_description", unique = true)
    private String description;

    public Role() {
    }

    public Role(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return id.equals(role.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return description + " (" + id + ")";
    }
}
