package local.example.nimble.api.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Employee
        extends PanacheEntity {

    private String name;
    private String surname;
    private LocalDate birthday;
    private LocalDate recruited;
}
