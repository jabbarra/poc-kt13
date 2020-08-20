package poc.kt13

import java.util.function.BiPredicate

class ClassPayer(val name: String, val age: Int, val paymentTerms: Array<EnumPaymentTerm>? = null) {
    val isAdult: Boolean
        get() = age > 18

    private fun showCardName() = "$name is $age has $paymentTerms"

    private fun showCardName(aka: String) =  "$aka is $age"

    fun showCardName(aka: String, risk: Int): String {
        return if (risk < 1) showCardName() else showCardName(aka)
    }
    infix operator fun plus(other: ClassPayer): ClassPayer{
        return ClassPayer(this.name + other.name, this.age + other.age, this.paymentTerms)
    }

}

