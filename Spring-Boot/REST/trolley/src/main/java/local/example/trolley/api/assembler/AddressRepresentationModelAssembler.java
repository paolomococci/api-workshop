package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Address;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class AddressRepresentationModelAssembler
        implements RepresentationModelAssembler<Address, EntityModel<Address>> {

    @Override
    public EntityModel<Address> toModel(Address address) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Address>> toCollectionModel(
            Iterable<? extends Address> addresses
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(addresses);
    }
}
