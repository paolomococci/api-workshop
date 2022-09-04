package local.example.trolley.api.repository;

import local.example.trolley.api.model.OrderItem;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(path = "correlations")
public interface OrderItemRepo
        extends CrudRepository<OrderItem, UUID> {
}
