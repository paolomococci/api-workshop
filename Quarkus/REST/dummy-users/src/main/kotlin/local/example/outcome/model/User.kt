package local.example.outcome.model

class User(
    //var name: UserName?,
    //var picture: UserPicture?
) {
    val login: UserLogin = UserLogin()
    var email: String = ""
    var phone: String = ""
    var cell: String = ""
}
