package local.example.demo.api.delegate;

import local.example.demo.api.ApplicationApi;
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

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;

public interface ApplicationApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/carts/{customerId}/items : adds an item in shopping cart
     * adds an item to the shopping cart if it doesn&#39;t already exist or increment quantity by the specified number of items if it does
     *
     * @param customerId customer identifier (required)
     * @param item item object (optional)
     * @return item added successfully (status code 201)
     *         or given customer ID doesn&#39;t exist (status code 404)
     * @see ApplicationApi#addCartItemsByCustomerId
     */
    default ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, Item item) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * PUT /api/v1/carts/{customerId}/items : replace or add an item in shopping cart
     * adds an item to the shopping cart if it doesn&#39;t already exist or replace with given item if it does
     *
     * @param customerId customer identifier (required)
     * @param item item object (optional)
     * @return item added successfully (status code 201)
     *         or given customer ID doesn&#39;t exist (status code 404)
     * @see ApplicationApi#addOrReplaceItemsByCustomerId
     */
    default ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId, Item item) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * POST /api/v1/orders : creates a new order for the given order request
     * creates a new order for the given order request
     *
     * @param newOrder new order request object (optional)
     * @return order added successfully (status code 201)
     *         or if payment is not authorized (status code 406)
     * @see ApplicationApi#addOrder
     */
    default ResponseEntity<List<Order>> addOrder(NewOrder newOrder) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * POST /api/v1/payments : authorize a payment request
     * authorize a payment request
     *
     * @param paymentReq  (optional)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#authorize
     */
    default ResponseEntity<Authorization> authorize(PaymentReq paymentReq) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * POST /api/v1/addresses : creates a new user addresses
     * create a new user address only if the address does not already exist
     *
     * @param addAddressReq  (optional)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#createAddress
     */
    default ResponseEntity<Address> createAddress(AddAddressReq addAddressReq) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /api/v1/addresses/{id} : deletes user&#39;s address
     * deletes user&#39;s address based on given address ID
     *
     * @param id address identifier (required)
     * @return accepts the deletion request and perform deletion (status code 202)
     * @see ApplicationApi#deleteAddressesById
     */
    default ResponseEntity<Void> deleteAddressesById(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /api/v1/cards/{id} : deletes card&#39;s address
     * deletes card&#39;s address based on given card ID
     *
     * @param id card identifier (required)
     * @return accepts the deletion request and perform deletion (status code 202)
     * @see ApplicationApi#deleteCardById
     */
    default ResponseEntity<Void> deleteCardById(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /api/v1/carts/{customerId} : delete the shopping cart
     * deletes the shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @return successful operation (status code 204)
     *         or given customer ID doesn&#39;t exist (status code 404)
     * @see ApplicationApi#deleteCart
     */
    default ResponseEntity<Void> deleteCart(String customerId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /api/v1/customers/{id} : deletes the customer
     * deletes the customer identifiable by given ID
     *
     * @param id customer identifier (required)
     * @return request accepted returns this status even if user does not exist (status code 202)
     * @see ApplicationApi#deleteCustomerById
     */
    default ResponseEntity<Void> deleteCustomerById(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * DELETE /api/v1/carts/{customerId}/items/{itemId} : delete the item from shopping cart
     * deletes the item from shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @param itemId item Identifier (required)
     * @return accepts the request regardless of whether the specified item exists in the cart or not (status code 202)
     * @see ApplicationApi#deleteItemFromCart
     */
    default ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/customers/{id}/addresses : returns all customer&#39;s addresses
     * returns all customer&#39;s addresses based on given customer ID
     *
     * @param id customer identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getAddressesByCustomerId
     */
    default ResponseEntity<Address> getAddressesByCustomerId(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/addresses/{id} : returns user&#39;s address
     * returns user&#39;s address based on given address ID
     *
     * @param id address Identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getAddressesById
     */
    default ResponseEntity<Address> getAddressesById(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/addresses : returns all user&#39;s addresses
     * returns all user&#39;s addresses else empty collection
     *
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getAllAddresses
     */
    default ResponseEntity<List<Address>> getAllAddresses() {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/cards : returns all user&#39;s cards
     * returns all user&#39;s cards or an empty collection
     *
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getAllCards
     */
    default ResponseEntity<List<Card>> getAllCards() {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/customers : returns all customers
     * returns all customers or empty collection if no use found
     *
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getAllCustomers
     */
    default ResponseEntity<List<User>> getAllCustomers() {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/cards/{id} : returns user&#39;s card
     * returns user&#39;s card based on given card ID
     *
     * @param id card identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getCardById
     */
    default ResponseEntity<Card> getCardById(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/customers/{id}/cards : returns all customer&#39;s cards
     * returns all customer&#39;s cards based on given customer ID
     *
     * @param id customer identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getCardsByCustomerId
     */
    default ResponseEntity<Card> getCardsByCustomerId(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/carts/{customerId} : returns the shopping cart
     * returns the shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @return successful operation (status code 200)
     *         or given customer ID doesn&#39;t exist (status code 404)
     * @see ApplicationApi#getCartByCustomerId
     */
    default ResponseEntity<List<Cart>> getCartByCustomerId(String customerId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/carts/{customerId}/items : returns the list of products in customer&#39;s shopping cart
     * returns the items in shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @return successful operation (status code 200)
     *         or given customer ID doesn&#39;t exist (status code 404)
     * @see ApplicationApi#getCartItemsByCustomerId
     */
    default ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/carts/{customerId}/items/{itemId} : returns given item from user&#39;s shopping cart
     * returns given item from shopping cart of given customer
     *
     * @param customerId customer identifier (required)
     * @param itemId item Identifier (required)
     * @return if item exists in cart (status code 200)
     *         or given item ID doesn&#39;t exist (status code 404)
     * @see ApplicationApi#getCartItemsByItemId
     */
    default ResponseEntity<List<Item>> getCartItemsByItemId(String customerId, String itemId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/customers/{id} : returns a customer
     * returns a customers identifiable by given ID
     *
     * @param id customer identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getCustomerById
     */
    default ResponseEntity<User> getCustomerById(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/orders : returns the orders of given user
     * returns orders of given user
     *
     * @param customerId customer identifier (required)
     * @return if order exists (status code 200)
     *         or order doesn&#39;t exist for given user (status code 404)
     * @see ApplicationApi#getOrdersByCustomerId
     */
    default ResponseEntity<List<Order>> getOrdersByCustomerId(String customerId) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/orders/{id} : returns the order of given order ID
     * returns orders of given order ID
     *
     * @param id order identifier (required)
     * @return if order exists (status code 200)
     *         or order doesn&#39;t exist for given user (status code 404)
     * @see ApplicationApi#getOrdersByOrderId
     */
    default ResponseEntity<Order> getOrdersByOrderId(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/payments : returns the payment authorization
     * return the payment authorization for the specified order
     *
     * @param id order identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getOrdersPaymentAuthorization
     */
    default ResponseEntity<List<Authorization>> getOrdersPaymentAuthorization(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/products/{id} : returns a product
     * returns the product that matches the given product ID
     *
     * @param id product identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getProduct
     */
    default ResponseEntity<Product> getProduct(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /api/v1/shipments : return the shipment
     * return the Shipment for the specified order
     *
     * @param id order identifier (required)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#getShipmentByOrderId
     */
    default ResponseEntity<List<Shipment>> getShipmentByOrderId(String id) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
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
     * @see ApplicationApi#queryProducts
     */
    default ResponseEntity<List<Product>> queryProducts(String tag, String name, Integer page, Integer size) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * POST /api/v1/cards : creates a new user addresses
     * creates a new user addresses or does nothing if address already exists
     *
     * @param addCardReq  (optional)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#registerCard
     */
    default ResponseEntity<Address> registerCard(AddCardReq addCardReq) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * POST /api/v1/shipments : ship the specified shipping request
     * ship the specified shipping request
     *
     * @param shippingReq  (optional)
     * @return for successful fetch (status code 200)
     * @see ApplicationApi#shipOrder
     */
    default ResponseEntity<Authorization> shipOrder(ShippingReq shippingReq) {
        // TODO
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}
