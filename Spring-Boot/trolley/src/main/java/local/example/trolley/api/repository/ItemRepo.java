package local.example.trolley.api.repository;

import local.example.trolley.api.model.Item;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

@RepositoryRestResource
public interface ItemRepo
        extends CrudRepository<Item, UUID> {

    String SELECT_QUERY = "SELECT i.* FROM trolley_db.carts c, trolley_db.items i, trolley_db.users u, trolley_db.cart_item ci WHERE u.id = :customerId AND c.user_id = u.id AND c.id = ci.cart_id AND i.id = ci.item_id";
    String DELETE_QUERY = "DELETE FROM trolley_db.cart_item WHERE item_id IN (:uuidList) AND cart_id = :cartId";

    @Query(
            value = SELECT_QUERY,
            nativeQuery = true
    )
    Iterable<Item> findByCustomerId(@Param("customerId") UUID customerId);

    @Query(
            value = DELETE_QUERY,
            nativeQuery = true
    )
    @Modifying
    Iterable<Item> deleteCartItemJoinById(
            @Param("uuidList") List<UUID> uuidList,
            @Param("cartId") UUID cartId
    );
}
