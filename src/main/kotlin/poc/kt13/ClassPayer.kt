package poc.kt13

class ClassPayer(val name: String, val age: Int, val paymentTerms: Array<EnumPaymentTerm>? = null) {
    val isAdult: Boolean
        get() = age > 18

    private fun showCardName() = "$name is $age has $paymentTerms"

    private fun showCardName(aka: String) =  "$aka is $age"

    fun showCardName(aka: String, risk: Int): String {
        return if (risk < 1) showCardName() else showCardName(aka)
    }
}