package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Authorization;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationRepresentationModelAssembler
        implements RepresentationModelAssembler<Authorization, EntityModel<Authorization>> {

    @Override
    public EntityModel<Authorization> toModel(Authorization authorization) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Authorization>> toCollectionModel(
            Iterable<? extends Authorization> authorizations
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(authorizations);
    }
}
