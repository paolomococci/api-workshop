package local.example.outcome.model

import java.math.BigDecimal

import java.util.*
import java.util.concurrent.atomic.AtomicLong

class Account() {

    var accountNumber: String = this.generateID()
    var customerNumber: String = this.generateID()
    var customerName: String = ""
    var balance: BigDecimal? = null
    var accountStatus = AccountStatus.OPEN

    constructor(
        customerName: String,
        balance: BigDecimal?
    ) : this() {
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

    fun withdrawFunds(amount: BigDecimal?) {
        balance = balance!!.subtract(amount)
    }

    fun addFunds(amount: BigDecimal?) {
        balance = balance!!.add(amount)
    }

    private fun generateID(): String {
        return UUID.randomUUID().toString()
    }

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false
        val that = o as Account
        return accountNumber == that.accountNumber && customerNumber == that.customerNumber
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumber,
            customerNumber
        )
    }
}
