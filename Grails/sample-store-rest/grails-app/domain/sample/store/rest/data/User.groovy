package sample.store.rest.data


import grails.rest.*

@Resource(
        readOnly = false,
        formats = ['json', 'xml'],
        uri = "/api/users"
)
class User {

    String code

    String toString() {
        code
    }
}