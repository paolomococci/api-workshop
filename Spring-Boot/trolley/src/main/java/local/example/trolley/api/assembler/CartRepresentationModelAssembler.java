package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Cart;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class CartRepresentationModelAssembler
        implements RepresentationModelAssembler<Cart, EntityModel<Cart>> {

    @Override
    public EntityModel<Cart> toModel(Cart cart) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Cart>> toCollectionModel(
            Iterable<? extends Cart> carts
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(carts);
    }
}
