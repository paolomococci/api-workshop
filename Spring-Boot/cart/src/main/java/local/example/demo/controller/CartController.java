package local.example.demo.controller;

import local.example.demo.api.ApplicationApi;
import local.example.demo.model.cart.Cart;
import local.example.demo.model.item.Item;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class CartController
        implements ApplicationApi {

    private static final Logger loggerFactory = LoggerFactory.getLogger(CartController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(
            String customerId,
            @Valid Item item
    ) {
        loggerFactory.info("Request for customer ID: {}\nItem: {}", customerId, item);
        // TODO
        return ResponseEntity.ok(Collections.emptyList());
    }

    @Override
    public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(
            String customerId,
            @Valid Item item
    ) {
        // TODO
        return ResponseEntity.ok(Collections.emptyList());
    }
    
    @Override
    public ResponseEntity<Void> deleteCart(
            String customerId
    ) {
        // TODO
        return ResponseEntity.of(Optional.empty());
    }

    @Override
    public ResponseEntity<Void> deleteItemFromCart(
            String customerId,
            String itemId
    ) {
        // TODO
        return ResponseEntity.of(Optional.empty());
    }

    @Override
    public ResponseEntity<List<Cart>> getCartByCustomerId(
            String customerId
    ) {
        loggerFactory.info("Request for customer ID: {}", customerId);
        // TODO
        return ResponseEntity.ok(Collections.emptyList());
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByCustomerId(
            String customerId
    ) {
        // TODO
        return ResponseEntity.of(Optional.empty());
    }

    @Override
    public ResponseEntity<List<Item>> getCartItemsByItemId(
            String customerId,
            String itemId
    ) {
        // TODO
        return ResponseEntity.of(Optional.empty());
    }
}
