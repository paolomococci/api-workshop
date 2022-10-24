package local.example.outcome.model

data class User(
    login: UserLogin,
    name: UserName,
    email: String,
    phone: String,
    cell: String,
    picture: UserPicture
) {}
