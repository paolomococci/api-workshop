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

    fun markOverstate() {
        accountStatus = AccountStatus.OVERSTATE
    }

    fun removeOverstateStatus() {
        accountStatus = AccountStatus.OPEN
    }

    fun close() {
        accountStatus = AccountStatus.CLOSED
        balance = BigDecimal.valueOf(0)
    }

    fun recedeFunds(amount: BigDecimal?) {
        balance = balance!!.subtract(amount)
    }

    fun addFunds(amount: BigDecimal?) {
        balance = balance!!.add(amount)
    }
}
