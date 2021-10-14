package sample.store.rest.data


import grails.rest.*

@Resource(
        readOnly = false,
        formats = ['json', 'xml'],
        uri = "/api/products"
)
class Product {

}