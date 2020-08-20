package poc.kt13

fun String.replaceMultipleWhiteSpace(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}

fun String.myConcat(other: String): String {
    val stringBuilder = StringBuilder()
    return stringBuilder.append(this).append(other).toString()
}

infix fun String.myConcatInfix(other: String): String {
    val stringBuilder = StringBuilder()
    return stringBuilder.append(this).append(other).toString()
}

inline fun <T> findFirst(items: List<T>, predicate: (T) -> Boolean) : T {
    for (item in items) {
        if(predicate(item)) return item
    }
    throw Exception()
}
