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

    @JsonManagedReference
    @JsonBackReference
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
        return list("name", name);
    }

    public static Uni<List<Employee>> findBySurname(String surname) {
        return list("surname", surname);
    }

    public static Uni<Employee> findByUsername(String username) {
        return find("username", username).firstResult();
    }

    public static Uni<List<Employee>> findMaster() {
        return list("level", Level.MASTER);
    }

    public static Uni<List<Employee>> findByExpertise(Expertise expertise) {
        return list("expertise", expertise);
    }
}
