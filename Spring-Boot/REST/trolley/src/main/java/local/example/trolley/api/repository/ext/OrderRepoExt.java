package local.example.trolley.api.repository.ext;

import local.example.trolley.api.model.Order;

import java.util.Optional;

public interface OrderRepoExt {

    Optional<Order> insert(Order order);
}
