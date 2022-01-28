package local.example.nimble.api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import javax.persistence.*;

import java.util.List;

@Entity
@Cacheable
@Table(name = "EXPERTISE")
@NamedQueries(
        {
                @NamedQuery(
                        name = "Expertise.getEmployee",
                        query = """
                                SELECT e.id, e.name, e.surname, e.username, e.birthday, e.recruited
                                FROM employee e
                                INNER JOIN employee_expertise ep ON e.id = ep.employee_id
                                INNER JOIN expertise p ON ep.expertise_id = ?1
                                LIMIT 1
                                """
                ),
                @NamedQuery(
                        name = "Expertise.getByName",
                        query = "SELECT p FROM expertise p WHERE p.name=?1"
                ),
                @NamedQuery(
                        name = "Expertise.getWhenTextDescriptionIsLike",
                        query = "SELECT * FROM expertise WHERE description::TEXT LIKE ?1"
                ),
                @NamedQuery(
                        name = "Expertise.getConjunctions",
                        query = """
                                SELECT p.name, e.name, e.surname
                                FROM employee e
                                INNER JOIN employee_expertise ep ON e.id = ep.employee_id
                                INNER JOIN expertise p ON ep.expertise_id = p.id
                                """
                )
        }
)
public class Expertise
        extends PanacheEntity {

    @Column(name = "NAME", unique = true)
    public String name;

    @Column(name = "DESCRIPTION")
    public String description;

    @JsonIgnore
    @Column(name = "EMPLOYEES")
    @ManyToMany(mappedBy = "expertise")
    public List<Employee> employees;

    public List<Employee> getEmployees() {
        return null;
    }

    public void setEmployees() {
       // TODO
    }

    public void addEmployees() {
        // TODO
    }

    public void delEmployees() {
        // TODO
    }

    public static Uni<Expertise> read(Long id) {
        return find("id", id).firstResult();
    }

    public static Uni<List<Expertise>> itemise() {
        return listAll(Sort.by("name"));
    }

    public static Uni<Expertise> findByName(String name) {
        return find("#Expertise.getByName", name).firstResult();
    }

    public static Uni<List<String>> conjunctions() {
        return null;
    }
}
