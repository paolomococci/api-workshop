package local.example.trolley.api.assembler;

import local.example.trolley.api.model.OderItem;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class OrderItemRepresentationModelAssembler
        implements RepresentationModelAssembler<OderItem, EntityModel<OderItem>> {
    @Override
    public EntityModel<OderItem> toModel(OderItem correlation) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<OderItem>> toCollectionModel(
            Iterable<? extends OderItem> correlations
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(correlations);
    }
}
