package local.example.trolley.api.assembler;

import local.example.trolley.api.model.Card;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

@Component
public class CardRepresentationModelAssembler
        implements RepresentationModelAssembler<Card, EntityModel<Card>> {

    @Override
    public EntityModel<Card> toModel(Card card) {
        return null;
    }

    @Override
    public CollectionModel<EntityModel<Card>> toCollectionModel(
            Iterable<? extends Card> cards
    ) {
        return RepresentationModelAssembler.super.toCollectionModel(cards);
    }
}
