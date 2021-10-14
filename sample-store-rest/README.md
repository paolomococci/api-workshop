# sample-store-rest

## developed thanks to the Grails framework

## scaffolding

```text
mkdir sample-store-rest
cd sample-store-rest
grails
create-app sample-store-rest --profile=rest-api
create-domain-resource sample.store.rest.data.User
create-domain-resource sample.store.rest.data.Product
create-domain-resource sample.store.rest.data.Cart
create-domain-resource sample.store.rest.data.Order
create-domain-resource sample.store.rest.data.Payment
create-domain-resource sample.store.rest.data.Shipping
exit
```