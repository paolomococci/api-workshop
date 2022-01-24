package local.example.nimble.api.model;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;

import io.smallrye.mutiny.Uni;

import javax.persistence.*;

import java.util.List;

@Entity
@Cacheable
@Table(name = "EXPERTISE")
public class Expertise
        extends PanacheEntity {

    @Column(name = "NAME", unique = true)
    public String name;

    @Column(name = "DESCRIPTION")
    public String description;

    @Column(name = "EMPLOYEES")
    @ManyToMany(mappedBy = "expertise")
    public List<Employee> employees;

    public static Uni<Expertise> read(Long id) {
        return find("id", id).firstResult();
    }

    public static Uni<Expertise> findByName(String name) {
        return find("name", name).firstResult();
    }
}
