package local.example.trolley.api.repository;

import local.example.trolley.api.model.Order;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface OrderRepo
        extends CrudRepository<Order, UUID> {

    String SELECT_QUERY = "SELECT o FROM orders o JOIN o.customer_id u WHERE u.id = :customerId";

    @Query(
            value = SELECT_QUERY,
            nativeQuery = true
    )
    Iterable<Order> findByCustomerId(@Param("customerId") UUID customerId);
}
