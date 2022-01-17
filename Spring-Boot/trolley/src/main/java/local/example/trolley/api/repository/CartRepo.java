package local.example.trolley.api.repository;

import local.example.trolley.api.model.Cart;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource
public interface CartRepo
        extends CrudRepository<Cart, UUID> {

    String SELECT_QUERY = "SELECT C FROM CARTS C JOIN C.USERS WHERE C.ID = :customerId";
}
