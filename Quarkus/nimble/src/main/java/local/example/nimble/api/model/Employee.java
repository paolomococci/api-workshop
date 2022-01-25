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
                        name = "Employee.getByExpertise",
                        query = ""
                ),
                @NamedQuery(
                        name = "Employee.getByName",
                        query = "SELECT e FROM EMPLOYEE e WHERE e.name=?1"
                ),
                @NamedQuery(
                        name = "Employee.getBySurname",
                        query = "SELECT e FROM EMPLOYEE e WHERE e.surname=?1"
                ),
                @NamedQuery(
                        name = "Employee.getByUsername",
                        query = "SELECT e FROM EMPLOYEE e WHERE e.username=?1"
                ),
                @NamedQuery(
                        name = "Employee.getByLevel",
                        query = "SELECT e FROM EMPLOYEE e WHERE e.level=?1"
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
        return find("Employee.getByUsername", username).firstResult();
    }

    public static Uni<List<Employee>> findByLevel(Level level) {
        return list("#Employee.getByLevel", level);
    }

    public static Uni<List<Employee>> findMaster() {
        return list("level", Level.MASTER);
    }
}
