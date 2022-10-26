package local.example.outcome.model

import java.util.*

class Result {
    val results: MutableSet<User>? = Collections.newSetFromMap(
        Collections.synchronizedMap(
            LinkedHashMap<User, Boolean>()
        ))
}
