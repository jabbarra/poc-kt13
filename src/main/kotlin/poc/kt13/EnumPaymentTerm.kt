package poc.kt13

enum class EnumPaymentTerm(val value: Int) {
    TC(1),
    TD(2);

    fun showPretty() = "$value client code"
}