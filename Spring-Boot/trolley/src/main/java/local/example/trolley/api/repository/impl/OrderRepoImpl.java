package local.example.trolley.api.repository.impl;

import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class OrderRepoImpl {

    private static final String SELECT_QUERY = "SELECT o.* FROM trolley_db.orders WHERE o.customer_id = ? AND o.registered >= ?";
}
