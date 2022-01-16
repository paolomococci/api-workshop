package local.example.nimble.api.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import io.smallrye.mutiny.Uni;

import local.example.nimble.api.model.Employee;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EmployeeRepository
        implements PanacheRepository<Employee> {

    public Uni<Employee> findByName(String name) {
        return find("name", name).firstResult();
    }

    public Uni<Employee> findBySurname(String surname) {
        return find("surname", surname).firstResult();
    }

    public Uni<Employee> findByUsername(String username) {
        return find("username", username).firstResult();
    }
}
