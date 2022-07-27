package local.example.outcome.model

import java.math.BigDecimal

class Account() {

    var accountNumber: Long? = null
    var customerNumber: Long? = null
    var customerName: String? = null
    var balance: BigDecimal? = null
    var accountStatus = AccountStatus.OPEN

    constructor(
        accountNumber: Long?,
        customerNumber: Long?,
        customerName: String?,
        balance: BigDecimal?
    ) : this() {
        this.accountNumber = accountNumber
        this.customerNumber = customerNumber
        this.customerName = customerName
        this.balance = balance
    }
}
