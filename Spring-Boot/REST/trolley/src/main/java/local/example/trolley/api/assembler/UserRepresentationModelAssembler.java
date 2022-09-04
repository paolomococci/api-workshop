package local.example.trolley.api.assembler;

import local.example.trolley.api.model.User;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class UserRepresentationModelAssembler
        implements RepresentationModelAssembler<User, EntityModel<User>> {

    @Override
    public EntityModel<User> toModel(User user) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<User>> toCollectionModel(
            Iterable<? extends User> users
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(users);
    }
}
