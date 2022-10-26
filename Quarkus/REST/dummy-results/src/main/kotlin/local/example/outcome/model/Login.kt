package local.example.outcome.model

import java.util.*

class Login {
    val uuid: String = UUID.randomUUID().toString()
    var username: String = ""
    var password: String = ""
    var salt: String = ""
    var md5: String = ""
    var sha1: String = ""
    var sha256: String = ""
}
