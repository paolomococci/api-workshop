package local.example.outcome.model

class User() {
    val login: UserLogin = UserLogin()
    var name: UserName? = null
    var email: String = ""
    var phone: String = ""
    var cell: String = ""
    var picture: UserPicture? = null
}
