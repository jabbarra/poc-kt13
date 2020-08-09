package poc.kt13

class ClassPayer(val name: String, val age: Int, val paymentTerms: Array<PaymentTerm>? = null) {

    enum class PaymentTerm {
        TC,
        TD
    }

    private fun showCardName(): String {
        return "$name is $age has $paymentTerms"
    }

    private fun showCardName(aka: String): String {
        return "$aka is $age"
    }

    fun showCardName(aka: String, risk: Int): String {
        return if (risk < 1) showCardName() else showCardName(aka)
    }
}