package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Payment;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class PaymentRepresentationModelAssembler
        implements RepresentationModelAssembler<Payment, EntityModel<Payment>> {

    @Override
    public EntityModel<Payment> toModel(Payment payment) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Payment>> toCollectionModel(
            Iterable<? extends Payment> payments
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(payments);
    }
}
