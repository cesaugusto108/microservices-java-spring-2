package ces.augusto108.authentication_sys.entities;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {
    private static final long serialVersionUID = -3889109624634671708L;

    private Integer id;

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
