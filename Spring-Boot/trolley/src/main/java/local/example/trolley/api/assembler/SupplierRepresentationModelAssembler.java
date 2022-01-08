package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Supplier;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class SupplierRepresentationModelAssembler
        implements RepresentationModelAssembler<Supplier, EntityModel<Supplier>> {

    @Override
    public EntityModel<Supplier> toModel(Supplier supplier) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Supplier>> toCollectionModel(
            Iterable<? extends Supplier> suppliers
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(suppliers);
    }
}
