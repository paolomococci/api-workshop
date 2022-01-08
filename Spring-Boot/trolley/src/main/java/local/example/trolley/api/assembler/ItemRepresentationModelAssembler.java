package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Item;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class ItemRepresentationModelAssembler
        implements RepresentationModelAssembler<Item, EntityModel<Item>> {
    @Override
    public EntityModel<Item> toModel(Item item) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Item>> toCollectionModel(
            Iterable<? extends Item> items
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(items);
    }
}
