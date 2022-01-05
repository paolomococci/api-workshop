package local.example.demo.controller;

import local.example.demo.api.ApplicationApi;

import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class CartController
        implements ApplicationApi {

    private static final Logger loggerFactory = LoggerFactory.getLogger(CartController.class);
}
