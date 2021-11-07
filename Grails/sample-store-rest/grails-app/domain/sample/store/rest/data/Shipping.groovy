package sample.store.rest.data


import grails.rest.*

@Resource(
        readOnly = false,
        formats = ['json', 'xml'],
        uri = "/api/shipments"
)
class Shipping {

    String code

    String toString() {
        code
    }
}