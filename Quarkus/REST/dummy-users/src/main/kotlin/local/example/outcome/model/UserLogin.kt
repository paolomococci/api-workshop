package local.example.outcome.model

import java.util.UUID

class UserLogin() {
    val uuid: String = this.generateID()

    private fun generateID(): String {
        return UUID.randomUUID().toString()
    }
}
