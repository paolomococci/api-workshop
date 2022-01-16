package local.example.nimble.api.repository;

import io.quarkus.hibernate.reactive.panache.PanacheRepository;

import local.example.nimble.api.model.Expertise;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ExpertiseRepository
        implements PanacheRepository<Expertise> {
}
