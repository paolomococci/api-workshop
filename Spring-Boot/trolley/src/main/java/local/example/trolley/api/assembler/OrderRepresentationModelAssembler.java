package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Order;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class OrderRepresentationModelAssembler
        implements RepresentationModelAssembler<Order, EntityModel<Order>> {

    @Override
    public EntityModel<Order> toModel(Order order) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Order>> toCollectionModel(
            Iterable<? extends Order> orders
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(orders);
    }
}
