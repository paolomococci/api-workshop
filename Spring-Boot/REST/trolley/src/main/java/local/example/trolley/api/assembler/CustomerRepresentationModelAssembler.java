package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Customer;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepresentationModelAssembler
        implements RepresentationModelAssembler<Customer, EntityModel<Customer>> {

    @Override
    public EntityModel<Customer> toModel(Customer customer) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Customer>> toCollectionModel(
            Iterable<? extends Customer> customers
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(customers);
    }
}
