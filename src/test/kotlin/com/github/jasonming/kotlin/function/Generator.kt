package com.github.jasonming.kotlin.function

import org.junit.jupiter.api.Test


/**
 *
 * @author MiNG
 * @version 1.0.0
 * @since 1.0.0 (2017-07-29)
 */

private const val PARAMETER_TYPE_PREFIX = "P";
private const val PARAMETER_NAME_PREFIX = "p";
private const val RETURN_TYPE_NAME = "R";

class Generator
{
    @Test
    fun generate_apply()
    {
        /* ======== template ======== */
        // fun <P1, P2, P3, R>
        //     ((P1, P2, P3) -> R)
        //     .apply(p1: P1, p2: P2, p3: P3)
        //     : () -> R
        //     = { -> this(p1, p2, p3) }

        val lines = mutableListOf<String>()

        for (fnSize in 2..22)
        {
            lines.add("// region: Function$fnSize")
            for (argSize in 1 until fnSize)
            {
                lines.add("""
fun <${parameterTypes(fnSize, suffix = RETURN_TYPE_NAME).joinToString()}>
    ((${parameterTypes(fnSize).joinToString()}) -> ${RETURN_TYPE_NAME})
    .apply(${parameters(argSize).joinToString()})
    : (${parameterTypes(start = argSize + 1, end = fnSize).joinToString()}) -> ${RETURN_TYPE_NAME}
    = { ${arguments(start = argSize + 1, end = fnSize).joinToString()} -> this(${arguments(fnSize).joinToString()}) }""")
            } // end `for` @argSize
            lines.add("\n// endregion\n\n")
        } // end `for` @fnSize

        lines.forEach { println(it) }
    }

    @Test
    fun generate_partialInvoke()
    {
        /* ======== template ======== */
        // operator fun <P1, P2, P3, R>
        //     ((P1, P2, P3) -> R).invoke(p1 : P1, p2 : P2)
        //     : (P3) -> R
        //     = this.apply(p1, p2)

        val lines = mutableListOf<String>()

        for (fnSize in 2..22)
        {
            lines.add("// region: Function$fnSize")
            for (argSize in 1 until fnSize)
            {
                lines.add("""
operator fun <${parameterTypes(fnSize, suffix = RETURN_TYPE_NAME).joinToString()}>
    ((${parameterTypes(fnSize).joinToString()}) -> ${RETURN_TYPE_NAME})
    .invoke(${parameters(argSize).joinToString()})
    : (${parameterTypes(start = argSize + 1, end = fnSize).joinToString()}) -> ${RETURN_TYPE_NAME}
    = this.apply(${arguments(argSize).joinToString()})""")
            } // end `for` @argSize
            lines.add("\n// endregion\n\n")
        } // end `for` @fnSize

        lines.forEach { println(it) }
    }

    @Test
    fun generate_curry()
    {
        /* ======== template ======== */
        // fun <P1, P2, P3, R>
        //         ((P1, P2, P3) -> R).curry()
        //         : (P1) -> (P2) -> (P3) -> R
        //         = { p1 -> { p2 -> { p3 -> this(p1, p2, p3) } } }

        val lines = mutableListOf<String>()

        for (fnSize in 1..22)
        {
            lines.add("""
fun <${parameterTypes(fnSize, suffix = RETURN_TYPE_NAME).joinToString()}>
    ((${parameterTypes(fnSize).joinToString()}) -> ${RETURN_TYPE_NAME})
    .curry()
    : ${parameterTypes(fnSize).joinToString(" -> ", transform = { "($it)" })} -> ${RETURN_TYPE_NAME}
    = ${arguments(fnSize).recurse("this(${arguments(fnSize).joinToString()})", { acc, item -> "{ $item -> $acc }" })}""")
            //  = ${arguments(fnSize).recurse("\n        this(${arguments(fnSize).joinToString()})\n     ", { acc, item -> "{ $item -> $acc }" })}
        } // end `for` @fnSize

        lines.forEach { println(it) }
    }

    @Test
    fun generate_uncurry()
    {
        /* ======== template ======== */
        // fun <P1, P2, P3, R>
        //         ((P1) -> (P2) -> (P3) -> R).uncurry()
        //         : (P1, P2, P3) -> R
        //         = { p1, p2, p3 -> this(p1)(p2)(p3) }

        val lines = mutableListOf<String>()

        for (fnSize in 1..22)
        {
            lines.add("""
fun <${parameterTypes(fnSize, suffix = RETURN_TYPE_NAME).joinToString()}>
    (${parameterTypes(fnSize).joinToString(" -> ", transform = { "($it)" })} -> ${RETURN_TYPE_NAME})
    .uncurry()
    : (${parameterTypes(fnSize).joinToString()}) -> ${RETURN_TYPE_NAME}
    = { ${arguments(fnSize).joinToString()} -> this${arguments(fnSize).joinToString(")(", "(", ")")} }""")
        } // end `for` @fnSize

        lines.forEach { println(it) }
    }
}

// region: Helpers

private data class Parameter(val i: Int)
{
    val type: String
        get() = "${PARAMETER_TYPE_PREFIX}$i"

    val name: String
        get() = "${PARAMETER_NAME_PREFIX}$i"

    override fun toString(): String
        = "$name: $type"
}

private fun parameters(end: Int, start: Int = 1): Sequence<Parameter> =
    (start..end)
        .asSequence()
        .map { Parameter(it) }

private fun arguments(end: Int, start: Int = 1): Sequence<String> =
    (start..end)
        .asSequence()
        .map { "${PARAMETER_NAME_PREFIX}$it" }

private fun parameterTypes(end: Int, start: Int = 1, suffix: String? = null): Sequence<String> =
    parameters(end, start)
        .map { it.type }
        .run { suffix?.let { this.plus(it) } ?: this }

private fun <T> Sequence<T>.recurse(identity: T, accumulator: (T, T) -> T, firstIn: Boolean = false): T =
    this.plus(identity)
        .toList()
        .run { if (firstIn) this else this.asReversed() }
        .reduce(accumulator)

// endregion