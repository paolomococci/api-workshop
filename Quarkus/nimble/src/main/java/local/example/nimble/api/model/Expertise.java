package local.example.nimble.api.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "EXPERTISE")
public class Expertise
        extends PanacheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EMPLOYEE")
    @ManyToMany(mappedBy = "expertise")
    private List<Employee> employees;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
