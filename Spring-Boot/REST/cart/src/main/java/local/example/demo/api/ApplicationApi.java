package local.example.demo.api;

import io.swagger.annotations.*;

import local.example.demo.api.delegate.ApplicationApiDelegate;
import local.example.demo.model.address.AddAddressReq;
import local.example.demo.model.address.Address;
import local.example.demo.model.authorization.Authorization;
import local.example.demo.model.card.AddCardReq;
import local.example.demo.model.card.Card;
import local.example.demo.model.cart.Cart;
import local.example.demo.model.item.Item;
import local.example.demo.model.order.NewOrder;
import local.example.demo.model.order.Order;
import local.example.demo.model.payment.PaymentReq;
import local.example.demo.model.product.Product;
import local.example.demo.model.shipping.Shipment;
import local.example.demo.model.shipping.ShippingReq;
import local.example.demo.model.user.User;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;


@Validated
@Api(value = "api")
public interface ApplicationApi {

    default ApplicationApiDelegate getDelegate() {
        return new ApplicationApiDelegate() {};
    }

    /**
     * POST /api/v1/carts/{customerId}/items : adds an item in shopping cart
     * adds an item to the shopping cart if it doesn&#39;t already exist or increment quantity by the specified number of items if it does
     *
     * @param customerId customer identifier (required)
     * @param item item object (optional)
     * @return item added successfully (status code 201)
     *         or given customer ID doesn&#39;t exist (status code 404)
     */

    @ApiOperation(
            value = "adds an item in shopping cart",
            nickname = "addCartItemsByCustomerId",
            notes = "adds an item to the shopping cart if it doesn't already exist or increment quantity by the specified number of items if it does",
            response = Item.class,
            responseContainer = "List",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "item added successfully", response = Item.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "given customer ID doesn't exist")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/carts/{customerId}/items",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Item>> addCartItemsByCustomerId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId,
            @ApiParam(value = "item object" ) @Valid @RequestBody(required = false) Item item
    ) {
        return getDelegate().addCartItemsByCustomerId(customerId, item);
    }


    /**
     * PUT /api/v1/carts/{customerId}/items : replace or add an item in shopping cart
     * adds an item to the shopping cart if it doesn&#39;t already exist or replace with given item if it does
     *
     * @param customerId customer identifier (required)
     * @param item item object (optional)
     * @return item added successfully (status code 201)
     *         or given customer ID doesn&#39;t exist (status code 404)
     */

    @ApiOperation(
            value = "replace or add an item in shopping cart",
            nickname = "addOrReplaceItemsByCustomerId",
            notes = "adds an item to the shopping cart if it doesn't already exist or replace with given item if it does",
            response = Item.class,
            responseContainer = "List",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "item added successfully", response = Item.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "given customer ID doesn't exist") })
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/carts/{customerId}/items",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId,
            @ApiParam(value = "item object" ) @Valid @RequestBody(required = false) Item item
    ) {
        return getDelegate().addOrReplaceItemsByCustomerId(customerId, item);
    }


    /**
     * POST /api/v1/orders : creates a new order for the given order request
     * creates a new order for the given order request
     *
     * @param newOrder new order request object (optional)
     * @return order added successfully (status code 201)
     *         or if payment is not authorized (status code 406)
     */

    @ApiOperation(
            value = "creates a new order for the given order request",
            nickname = "addOrder",
            notes = "creates a new order for the given order request",
            response = Order.class,
            responseContainer = "List",
            tags = { "order", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 201, message = "order added successfully", response = Order.class, responseContainer = "List"),
        @ApiResponse(code = 406, message = "if payment is not authorized")
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/orders",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Order>> addOrder(

@ApiParam(value = "new order request object" ) @Valid @RequestBody(required = false) NewOrder newOrder) {
        return getDelegate().addOrder(newOrder);
    }


    /**
     * POST /api/v1/payments : authorize a payment request
     * authorize a payment request
     *
     * @param paymentReq  (optional)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "authorize a payment request",
            nickname = "authorize",
            notes = "authorize a payment request",
            response = Authorization.class,
            tags = { "payment", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Authorization.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/payments",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<Authorization> authorize(
            @ApiParam() @Valid @RequestBody(required = false) PaymentReq paymentReq
    ) {
        return getDelegate().authorize(paymentReq);
    }


    /**
     * POST /api/v1/addresses : creates a new user addresses
     * create a new user address only if the address does not already exist
     *
     * @param addAddressReq  (optional)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "creates a new user addresses",
            nickname = "createAddress",
            notes = "create a new user address only if the address does not already exist",
            response = Address.class,
            tags = { "address", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Address.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/addresses",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<Address> createAddress(
            @ApiParam @Valid @RequestBody(required = false) AddAddressReq addAddressReq
    ) {
        return getDelegate().createAddress(addAddressReq);
    }


    /**
     * DELETE /api/v1/addresses/{id} : deletes user&#39;s address
     * deletes user&#39;s address based on given address ID
     *
     * @param id address identifier (required)
     * @return accepts the deletion request and perform deletion (status code 202)
     */

    @ApiOperation(
            value = "deletes user's address",
            nickname = "deleteAddressesById",
            notes = "deletes user's address based on given address ID",
            tags = { "address", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "accepts the deletion request and perform deletion")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/addresses/{id}"
    )
    default ResponseEntity<Void> deleteAddressesById(
            @ApiParam(value = "address identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().deleteAddressesById(id);
    }


    /**
     * DELETE /api/v1/cards/{id} : deletes card&#39;s address
     * deletes card&#39;s address based on given card ID
     *
     * @param id card identifier (required)
     * @return accepts the deletion request and perform deletion (status code 202)
     */

    @ApiOperation(
            value = "deletes card's address",
            nickname = "deleteCardById",
            notes = "deletes card's address based on given card ID",
            tags = { "card", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "accepts the deletion request and perform deletion")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/cards/{id}"
    )
    default ResponseEntity<Void> deleteCardById(
            @ApiParam(value = "card identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().deleteCardById(id);
    }


    /**
     * DELETE /api/v1/carts/{customerId} : delete the shopping cart
     * deletes the shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @return successful operation (status code 204)
     *         or given customer ID doesn&#39;t exist (status code 404)
     */

    @ApiOperation(
            value = "delete the shopping cart",
            nickname = "deleteCart",
            notes = "deletes the shopping cart of given customer",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 204, message = "successful operation"),
        @ApiResponse(code = 404, message = "given customer ID doesn't exist")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/carts/{customerId}"
    )
    default ResponseEntity<Void> deleteCart(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId
    ) {
        return getDelegate().deleteCart(customerId);
    }


    /**
     * DELETE /api/v1/customers/{id} : deletes the customer
     * deletes the customer identifiable by given ID
     *
     * @param id customer identifier (required)
     * @return request accepted returns this status even if user does not exist (status code 202)
     */

    @ApiOperation(
            value = "deletes the customer",
            nickname = "deleteCustomerById",
            notes = "deletes the customer identifiable by given ID",
            tags = { "customer", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "request accepted returns this status even if user does not exist")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/customers/{id}"
    )
    default ResponseEntity<Void> deleteCustomerById(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().deleteCustomerById(id);
    }


    /**
     * DELETE /api/v1/carts/{customerId}/items/{itemId} : delete the item from shopping cart
     * deletes the item from shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @param itemId item Identifier (required)
     * @return accepts the request regardless of whether the specified item exists in the cart or not (status code 202)
     */

    @ApiOperation(
            value = "delete the item from shopping cart",
            nickname = "deleteItemFromCart",
            notes = "deletes the item from shopping cart of given customer",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 202, message = "accepts the request regardless of whether the specified item exists in the cart or not")
    })
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/carts/{customerId}/items/{itemId}"
    )
    default ResponseEntity<Void> deleteItemFromCart(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId,
            @ApiParam(value = "item Identifier", required = true) @PathVariable("itemId") String itemId
    ) {
        return getDelegate().deleteItemFromCart(customerId, itemId);
    }


    /**
     * GET /api/v1/customers/{id}/addresses : returns all customer&#39;s addresses
     * returns all customer&#39;s addresses based on given customer ID
     *
     * @param id customer identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns all customer's addresses",
            nickname = "getAddressesByCustomerId",
            notes = "returns all customer's addresses based on given customer ID",
            response = Address.class,
            tags = { "customer", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Address.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers/{id}/addresses",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Address> getAddressesByCustomerId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getAddressesByCustomerId(id);
    }


    /**
     * GET /api/v1/addresses/{id} : returns user&#39;s address
     * returns user&#39;s address based on given address ID
     *
     * @param id address Identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns user's address",
            nickname = "getAddressesById",
            notes = "returns user's address based on given address ID",
            response = Address.class,
            tags = { "address", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Address.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/addresses/{id}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Address> getAddressesById(
            @ApiParam(value = "address Identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getAddressesById(id);
    }


    /**
     * GET /api/v1/addresses : returns all user&#39;s addresses
     * returns all user&#39;s addresses else empty collection
     *
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns all user's addresses",
            nickname = "getAllAddresses",
            notes = "returns all user's addresses else empty collection",
            response = Address.class,
            responseContainer = "List",
            tags = { "address", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Address.class, responseContainer = "List")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/addresses",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Address>> getAllAddresses() {
        return getDelegate().getAllAddresses();
    }


    /**
     * GET /api/v1/cards : returns all user&#39;s cards
     * returns all user&#39;s cards or an empty collection
     *
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns all user's cards",
            nickname = "getAllCards",
            notes = "returns all user's cards or an empty collection",
            response = Card.class,
            responseContainer = "List",
            tags = { "card", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Card.class, responseContainer = "List")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/cards",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Card>> getAllCards() {
        return getDelegate().getAllCards();
    }


    /**
     * GET /api/v1/customers : returns all customers
     * returns all customers or empty collection if no use found
     *
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns all customers",
            nickname = "getAllCustomers",
            notes = "returns all customers or empty collection if no use found",
            response = User.class,
            responseContainer = "List",
            tags = { "customer", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = User.class, responseContainer = "List")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<User>> getAllCustomers() {
        return getDelegate().getAllCustomers();
    }


    /**
     * GET /api/v1/cards/{id} : returns user&#39;s card
     * returns user&#39;s card based on given card ID
     *
     * @param id card identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns user's card",
            nickname = "getCardById",
            notes = "returns user's card based on given card ID",
            response = Card.class,
            tags = { "card", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Card.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/cards/{id}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Card> getCardById(
            @ApiParam(value = "card identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getCardById(id);
    }


    /**
     * GET /api/v1/customers/{id}/cards : returns all customer&#39;s cards
     * returns all customer&#39;s cards based on given customer ID
     *
     * @param id customer identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns all customer's cards",
            nickname = "getCardsByCustomerId",
            notes = "returns all customer's cards based on given customer ID",
            response = Card.class,
            tags = { "customer", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Card.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers/{id}/cards",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Card> getCardsByCustomerId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getCardsByCustomerId(id);
    }


    /**
     * GET /api/v1/carts/{customerId} : returns the shopping cart
     * returns the shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @return successful operation (status code 200)
     *         or given customer ID doesn&#39;t exist (status code 404)
     */

    @ApiOperation(
            value = "returns the shopping cart",
            nickname = "getCartByCustomerId",
            notes = "returns the shopping cart of given customer",
            response = Cart.class,
            responseContainer = "List",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Cart.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "given customer ID doesn't exist")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/carts/{customerId}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Cart>> getCartByCustomerId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId
    ) {
        return getDelegate().getCartByCustomerId(customerId);
    }


    /**
     * GET /api/v1/carts/{customerId}/items : returns the list of products in customer&#39;s shopping cart
     * returns the items in shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @return successful operation (status code 200)
     *         or given customer ID doesn&#39;t exist (status code 404)
     */

    @ApiOperation(
            value = "returns the list of products in customer's shopping cart",
            nickname = "getCartItemsByCustomerId",
            notes = "returns the items in shopping cart of given customer",
            response = Item.class,
            responseContainer = "List",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "successful operation", response = Item.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "given customer ID doesn't exist")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/carts/{customerId}/items",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Item>> getCartItemsByCustomerId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId
    ) {
        return getDelegate().getCartItemsByCustomerId(customerId);
    }


    /**
     * GET /api/v1/carts/{customerId}/items/{itemId} : returns given item from user&#39;s shopping cart
     * returns given item from shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @param itemId item Identifier (required)
     * @return if item exists in cart (status code 200)
     *         or given item ID doesn&#39;t exist (status code 404)
     */

    @ApiOperation(
            value = "returns given item from user's shopping cart",
            nickname = "getCartItemsByItemId",
            notes = "returns given item from shopping cart of given customer",
            response = Item.class,
            responseContainer = "List",
            tags = { "cart", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "if item exists in cart", response = Item.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "given item ID doesn't exist")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/carts/{customerId}/items/{itemId}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Item>> getCartItemsByItemId(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("customerId") String customerId,
            @ApiParam(value = "item Identifier", required = true) @PathVariable("itemId") String itemId
    ) {
        return getDelegate().getCartItemsByItemId(customerId, itemId);
    }


    /**
     * GET /api/v1/customers/{id} : returns a customer
     * returns a customers identifiable by given ID
     *
     * @param id customer identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns a customer",
            nickname = "getCustomerById",
            notes = "returns a customers identifiable by given ID",
            response = User.class,
            tags = { "customer", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = User.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/customers/{id}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<User> getCustomerById(
            @ApiParam(value = "customer identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getCustomerById(id);
    }


    /**
     * GET /api/v1/orders : returns the orders of given user
     * returns orders of given user
     *
     * @param customerId customer identifier (required)
     * @return if order exists (status code 200)
     *         or order doesn&#39;t exist for given user (status code 404)
     */

    @ApiOperation(
            value = "returns the orders of given user",
            nickname = "getOrdersByCustomerId",
            notes = "returns orders of given user",
            response = Order.class,
            responseContainer = "List",
            tags = { "order", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "if order exists", response = Order.class, responseContainer = "List"),
        @ApiResponse(code = 404, message = "order doesn't exist for given user")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/orders",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Order>> getOrdersByCustomerId(@NotNull @ApiParam(
            value = "customer identifier", required = true) @Valid @RequestParam(value = "customerId") String customerId
    ) {
        return getDelegate().getOrdersByCustomerId(customerId);
    }


    /**
     * GET /api/v1/orders/{id} : returns the order of given order ID
     * returns orders of given order ID
     *
     * @param id order identifier (required)
     * @return if order exists (status code 200)
     *         or order doesn&#39;t exist for given user (status code 404)
     */

    @ApiOperation(
            value = "returns the order of given order ID",
            nickname = "getOrdersByOrderId",
            notes = "returns orders of given order ID",
            response = Order.class,
            tags = { "order", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "if order exists", response = Order.class),
        @ApiResponse(code = 404, message = "order doesn't exist for given user")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/orders/{id}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Order> getOrdersByOrderId(
            @ApiParam(value = "order identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getOrdersByOrderId(id);
    }


    /**
     * GET /api/v1/payments : returns the payment authorization
     * return the payment authorization for the specified order
     *
     * @param id order identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns the payment authorization",
            nickname = "getOrdersPaymentAuthorization",
            notes = "return the payment authorization for the specified order",
            response = Authorization.class,
            responseContainer = "List",
            tags = { "payment", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Authorization.class, responseContainer = "List")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/payments",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Authorization>> getOrdersPaymentAuthorization(
            @NotNull @ApiParam(value = "order identifier", required = true) @Valid @RequestParam(value = "id") String id
    ) {
        return getDelegate().getOrdersPaymentAuthorization(id);
    }


    /**
     * GET /api/v1/products/{id} : returns a product
     * returns the product that matches the given product ID
     *
     * @param id product identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns a product",
            nickname = "getProduct",
            notes = "returns the product that matches the given product ID",
            response = Product.class,
            tags = { "product", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Product.class)
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/products/{id}",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<Product> getProduct(
            @ApiParam(value = "product identifier", required = true) @PathVariable("id") String id
    ) {
        return getDelegate().getProduct(id);
    }


    /**
     * GET /api/v1/shipments : return the shipment
     * return the Shipment for the specified order
     *
     * @param id order identifier (required)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "return the shipment",
            nickname = "getShipmentByOrderId",
            notes = "return the Shipment for the specified order",
            response = Shipment.class,
            responseContainer = "List",
            tags = { "shipping", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Shipment.class, responseContainer = "List")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/shipments",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Shipment>> getShipmentByOrderId(
            @NotNull @ApiParam(value = "order identifier", required = true) @Valid @RequestParam(value = "id") String id
    ) {
        return getDelegate().getShipmentByOrderId(id);
    }


    /**
     * GET /api/v1/products : returns all the matched products
     * returns the products that matches the given query criteria
     *
     * @param tag product tag (optional)
     * @param name product name (optional)
     * @param page query page number (optional, default to 1)
     * @param size query page size (optional, default to 10)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "returns all the matched products",
            nickname = "queryProducts",
            notes = "returns the products that matches the given query criteria",
            response = Product.class,
            responseContainer = "List",
            tags = { "product", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Product.class, responseContainer = "List")
    })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/products",
        produces = { "application/xml", "application/json" }
    )
    default ResponseEntity<List<Product>> queryProducts(
            @ApiParam(value = "product tag") @Valid @RequestParam(value = "tag", required = false) String tag,
            @ApiParam(value = "product name") @Valid @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "query page number", defaultValue = "1") @Valid @RequestParam(
                    value = "page", required = false, defaultValue = "1"
            ) Integer page,
            @ApiParam(value = "query page size", defaultValue = "10") @Valid @RequestParam(
                    value = "size", required = false, defaultValue = "10"
            ) Integer size
    ) {
        return getDelegate().queryProducts(tag, name, page, size);
    }


    /**
     * POST /api/v1/cards : creates a new user addresses
     * creates a new user addresses or does nothing if address already exists
     *
     * @param addCardReq  (optional)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "creates a new user addresses",
            nickname = "registerCard",
            notes = "creates a new user addresses or does nothing if address already exists",
            response = Address.class,
            tags = { "card", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Address.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/cards",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<Address> registerCard(
            @ApiParam @Valid @RequestBody(required = false) AddCardReq addCardReq
    ) {
        return getDelegate().registerCard(addCardReq);
    }


    /**
     * POST /api/v1/shipments : ship the specified shipping request
     * ship the specified shipping request
     *
     * @param shippingReq  (optional)
     * @return for successful fetch (status code 200)
     */

    @ApiOperation(
            value = "ship the specified shipping request",
            nickname = "shipOrder",
            notes = "ship the specified shipping request",
            response = Authorization.class,
            tags = { "shipping", }
    )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "for successful fetch", response = Authorization.class)
    })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/shipments",
        produces = { "application/xml", "application/json" },
        consumes = { "application/xml", "application/json" }
    )
    default ResponseEntity<Authorization> shipOrder(
            @ApiParam @Valid @RequestBody(required = false) ShippingReq shippingReq
    ) {
        return getDelegate().shipOrder(shippingReq);
    }
}
