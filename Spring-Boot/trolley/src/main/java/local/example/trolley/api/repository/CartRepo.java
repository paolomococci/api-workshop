package local.example.trolley.api.repository;

import local.example.trolley.api.model.Cart;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;
import java.util.UUID;

@RepositoryRestResource
public interface CartRepo
        extends CrudRepository<Cart, UUID> {

    String SELECT_QUERY = "SELECT c FROM carts c JOIN c.user_id WHERE c.id = :customerId";

    @Query(
            value = SELECT_QUERY,
            nativeQuery = true
    )
    Optional<Cart> findByCustomerId(@Param("customerId") UUID customerId);
}
