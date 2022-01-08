package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Tag;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class TagRepresentationModelAssembler
        implements RepresentationModelAssembler<Tag, EntityModel<Tag>> {

    @Override
    public EntityModel<Tag> toModel(Tag tag) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Tag>> toCollectionModel(
            Iterable<? extends Tag> tags
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(tags);
    }
}
