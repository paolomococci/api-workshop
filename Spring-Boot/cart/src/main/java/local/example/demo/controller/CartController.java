package local.example.demo.controller;

import local.example.demo.api.ApplicationApi;

import local.example.demo.model.item.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

@RestController
public class CartController
        implements ApplicationApi {

    private static final Logger loggerFactory = LoggerFactory.getLogger(CartController.class);

    @Override
    public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, Item item) {
        return ResponseEntity.ok(Collections.emptyList());
    }
}
