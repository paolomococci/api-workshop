package local.example.trolley.api.repository;

import local.example.trolley.api.model.Payment;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface PaymentRepo
        extends CrudRepository<Payment, UUID> {
}
