package local.example.outcome.model

data class User(
    val login: UserLogin = UserLogin(),
    var name: UserName?,
    var email: String?,
    var phone: String?,
    var cell: String?,
    var picture: UserPicture?
) {}
