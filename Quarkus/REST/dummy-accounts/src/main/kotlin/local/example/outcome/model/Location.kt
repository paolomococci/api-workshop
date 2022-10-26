package local.example.outcome.model

data class Location(
    var street: Street?,
    var city: String?,
    var state: String?,
    var country: String?,
    var postcode: String?,
    var coordinates: Coordinates?,
    var timezone: Timezone?
)
