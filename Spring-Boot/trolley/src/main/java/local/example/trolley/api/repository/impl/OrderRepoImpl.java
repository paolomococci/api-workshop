package local.example.trolley.api.repository.impl;

import local.example.trolley.api.model.Order;
import local.example.trolley.api.repository.ItemRepo;
import local.example.trolley.api.repository.ext.OrderRepoExt;

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

    @Override
    public Optional<Order> insert(Order order) {
        return Optional.empty();
    }
}
