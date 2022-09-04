package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Forwarder;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class ForwarderRepresentationModelAssembler
        implements RepresentationModelAssembler<Forwarder, EntityModel<Forwarder>> {
    @Override
    public EntityModel<Forwarder> toModel(Forwarder forwarder) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Forwarder>> toCollectionModel(
            Iterable<? extends Forwarder> forwarders
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(forwarders);
    }
}
