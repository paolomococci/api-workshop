package local.example.nimble.api.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import io.quarkus.panache.common.Sort;
import io.smallrye.mutiny.Uni;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Cacheable
@Table(name = "EMPLOYEE")
@NamedQueries(
        {
                @NamedQuery(
                        name = "Employee.getExpertise",
                        query = """
                                SELECT DISTINCT p.id, p.name, p.description
                                FROM employee e
                                INNER JOIN employee_expertise ep ON ?1 = ep.employee_id
                                INNER JOIN expertise p ON ep.expertise_id = p.id
                                """
                ),
                @NamedQuery(
                        name = "Employee.getByName",
                        query = "SELECT e FROM employee e WHERE e.name=?1"
                ),
                @NamedQuery(
                        name = "Employee.getBySurname",
                        query = "SELECT e FROM employee e WHERE e.surname=?1"
                ),
                @NamedQuery(
                        name = "Employee.getByUsername",
                        query = "SELECT e FROM employee e WHERE e.username=?1"
                ),
                @NamedQuery(
                        name = "Employee.getByLevel",
                        query = "SELECT e FROM employee e WHERE e.level=?1"
                ),
                @NamedQuery(
                        name = "Employee.getConjunctions",
                        query = """
                                SELECT e.name, e.surname, e.username, p.name, p.description
                                FROM employee e
                                INNER JOIN employee_expertise ep ON e.id = ep.employee_id
                                INNER JOIN expertise p ON ep.expertise_id = p.id
                                """
                )
        }
)
public class Employee
        extends PanacheEntity {

    @Column(name = "NAME")
    public String name;

    @Column(name = "SURNAME")
    public String surname;

    @Column(name = "USERNAME", unique = true)
    public String username;

    @Column(name = "BIRTHDAY")
    public LocalDate birthday;

    @Column(name = "RECRUITED")
    public LocalDate recruited;

    @JsonIgnore
    @Column(name = "EXPERTISE")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "EMPLOYEE_EXPERTISE",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "EXPERTISE_ID")
    )
    public List<Expertise> expertise;

    public List<Expertise> getExpertise() {
        return null;
    }

    public void setExpertise() {
        // TODO
    }

    public void addExpertise() {
        // TODO
    }

    public void delExpertise() {
        // TODO
    }

    @Column(name = "LEVEL")
    @Enumerated(EnumType.STRING)
    public Level level;

    public static Uni<Employee> read(Long id) {
        return find("id", id).firstResult();
    }

    public static Uni<List<Employee>> itemise() {
        return listAll(Sort.by("surname"));
    }

    public static Uni<List<Employee>> findByName(String name) {
        return list("#Employee.getByName", name);
    }

    public static Uni<List<Employee>> findBySurname(String surname) {
        return list("#Employee.getBySurname", surname);
    }

    public static Uni<Employee> findByUsername(String username) {
        return find("#Employee.getByUsername", username).firstResult();
    }

    public static Uni<List<Employee>> findByLevel(Level level) {
        return list("#Employee.getByLevel", level);
    }

    public static Uni<List<Employee>> findMaster() {
        return list("level", Level.MASTER);
    }
}
