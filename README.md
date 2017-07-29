# Kotlin Funtion Extensions

This is an extension library offer (un)currying features for kotlin.  

## Curry and Uncurry

### Expand `(a, b, ...) -> R` to `(a) -> (b) -> ... -> R`

```kotlin
import me.ming.kotlin.function.extension.*

fun main(args: Array<String>)
{
    val func3: (String, Int, Any) -> Unit = { a, b, c -> println("a: $a, b: $b, c: $c")}

    val curried: (String) -> (Int) -> (Any) -> Unit =  func3.curry()
}
```

### Shrink `(a) -> (b) -> ... -> R` to `(a, b, ...) -> R`

```kotlin
import me.ming.kotlin.function.extension.*

fun main(args: Array<String>)
{
    val funx3: (String) -> (Int) -> (Any) -> Unit =  { a -> { b -> { c -> println("a: $a, b: $b, c: $c") } } }

    val uncurried: (String, Int, Any) -> Unit = funx3.uncurry()
}
```

## Partial apply

This is a convenient way to bind some arguments from **left to right**.

```kotlin
import me.ming.kotlin.function.extension.*

fun main(args: Array<String>)
{
    val func3: (String, Int, Any) -> Unit = { a, b, c -> println("a: $a, b: $b, c: $c")}

    // Apply the first-n parameter, returns the function with rest parameters.
    val apply1:        (Int, Any) -> Unit = func3.apply("foo")
    val apply2:             (Any) -> Unit = func3.apply("foo", 23)
    
    // Or, you can just "invoke" the function continuously by using the extension operator.
    val invoke1:       (Int, Any) -> Unit = func3("foo")
    val invoke2:            (Any) -> Unit = func3("foo", 23)
    
    // When you fill all parameters, the origin "invoke" method is called.
    val result:                      Unit = func3("foo", 23, "whatever")
    
    // But, there is no such "apply" method for you to fill all parameters.
    val error:                       Unit = func3.apply("foo", 23, "whatever") // Compile error: Too many argument for "apply" function.
}
```