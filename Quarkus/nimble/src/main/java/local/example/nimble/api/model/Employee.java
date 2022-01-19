package local.example.nimble.api.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
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
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "USERNAME", unique = true)
    private String username;

    @Column(name = "BIRTHDAY")
    private LocalDate birthday;

    @Column(name = "RECRUITED")
    private LocalDate recruited;

    @Column(name = "EXPERTISE")
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "EMPLOYEE_EXPERTISE",
            joinColumns = @JoinColumn(name = "EMPLOYEE_ID"),
            inverseJoinColumns = @JoinColumn(name = "EXPERTISE_ID")
    )
    List<Expertise> expertise;

    @Column(name = "LEVEL")
    @Enumerated(EnumType.STRING)
    private Level level;

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
