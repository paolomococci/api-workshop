package local.example.trolley.api.assembler;

import local.example.trolley.api.model.OrderItem;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class OrderItemRepresentationModelAssembler
        implements RepresentationModelAssembler<OrderItem, EntityModel<OrderItem>> {
    @Override
    public EntityModel<OrderItem> toModel(OrderItem correlation) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<OrderItem>> toCollectionModel(
            Iterable<? extends OrderItem> correlations
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(correlations);
    }
}
