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

    private static final String SELECT_QUERY = "SELECT o.* FROM trolley_db.orders WHERE o.customer_id = ? AND o.registered >= ?";

    @PersistenceContext
    private EntityManager entityManager;

    private ItemRepo itemRepo;
    private AddressRepo addressRepo;
    private CartRepo cartRepo;
    private OrderItemRepo orderItemRepo;
    private ItemService itemService;

    public OrderRepoImpl(
            EntityManager entityManager,
            ItemRepo itemRepo,
            AddressRepo addressRepo,
            CartRepo cartRepo,
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
}
