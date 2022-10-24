package local.example.outcome.model

import java.util.UUID

data class UserLogin(
    var uuid: String = UUID.randomUUID().toString()
) {
}
