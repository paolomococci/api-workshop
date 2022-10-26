package local.example.outcome.model

import java.util.*

class Account {
    val users: MutableSet<User>? = Collections.newSetFromMap(
        Collections.synchronizedMap(
            LinkedHashMap<User, Boolean>()
        ))
}
