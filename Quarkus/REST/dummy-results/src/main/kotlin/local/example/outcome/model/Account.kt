package local.example.outcome.model

import java.util.*

class Account {
    val users: Set<User>? = Collections.newSetFromMap(
        Collections.synchronizedMap(
            LinkedHashMap<User, Boolean>()
        ))
}
