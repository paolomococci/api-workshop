package local.example.trolley.api.repository.impl;

import local.example.trolley.api.model.Order;
import local.example.trolley.api.repository.AddressRepo;
import local.example.trolley.api.repository.CartRepo;
import local.example.trolley.api.repository.ItemRepo;
import local.example.trolley.api.repository.OrderItemRepo;
import local.example.trolley.api.repository.ext.OrderRepoExt;

import local.example.trolley.api.service.ItemService;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.Optional;

@Repository
@Transactional
public class OrderRepoImpl
        implements OrderRepoExt {

    private static final String SELECT_QUERY =
            "SELECT o.* FROM trolley_db.orders WHERE o.customer_id = ? AND o.registered >= ?";
    private static final String INSERT_QUERY =
            "INSERT INTO trolley_db.orders (address_id,card_id,customer_id,registered,total,processed) VALUES(?,?,?,?,?,?)";

    @PersistenceContext
    private final EntityManager entityManager;

    private final AddressRepo addressRepo;
    private final CartRepo cartRepo;
    private final ItemRepo itemRepo;
    private final OrderItemRepo orderItemRepo;
    private final ItemService itemService;

    public OrderRepoImpl(
            EntityManager entityManager,
            AddressRepo addressRepo,
            CartRepo cartRepo,
            ItemRepo itemRepo,
            OrderItemRepo orderItemRepo,
            ItemService itemService
    ) {
        this.entityManager = entityManager;
        this.itemRepo = itemRepo;
        this.addressRepo = addressRepo;
        this.cartRepo = cartRepo;
        this.orderItemRepo = orderItemRepo;
        this.itemService = itemService;
    }

    @Override
    public Optional<Order> insert(Order order) {
        return Optional.empty();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public ItemRepo getItemRepo() {
        return itemRepo;
    }

    public AddressRepo getAddressRepo() {
        return addressRepo;
    }

    public CartRepo getCartRepo() {
        return cartRepo;
    }

    public OrderItemRepo getOrderItemRepo() {
        return orderItemRepo;
    }

    public ItemService getItemService() {
        return itemService;
    }
}
