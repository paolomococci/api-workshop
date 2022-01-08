package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Shipment;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class ShipmentRepresentationModelAssembler
        implements RepresentationModelAssembler<Shipment, EntityModel<Shipment>> {

    @Override
    public EntityModel<Shipment> toModel(Shipment shipment) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Shipment>> toCollectionModel(
            Iterable<? extends Shipment> shipments
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(shipments);
    }
}
