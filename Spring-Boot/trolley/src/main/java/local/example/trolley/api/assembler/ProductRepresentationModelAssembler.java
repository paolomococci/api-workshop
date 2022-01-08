package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Product;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class ProductRepresentationModelAssembler
        implements RepresentationModelAssembler<Product, EntityModel<Product>> {

    @Override
    public EntityModel<Product> toModel(Product product) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Product>> toCollectionModel(
            Iterable<? extends Product> products
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(products);
    }
}
