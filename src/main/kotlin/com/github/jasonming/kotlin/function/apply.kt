package com.github.jasonming.kotlin.function


// region: Function2

fun <P1, P2, R>
    ((P1, P2) -> R)
    .apply(p1: P1)
    : (P2) -> R
    = { p2 -> this(p1, p2) }

// endregion


// region: Function3

fun <P1, P2, P3, R>
    ((P1, P2, P3) -> R)
    .apply(p1: P1)
    : (P2, P3) -> R
    = { p2, p3 -> this(p1, p2, p3) }

fun <P1, P2, P3, R>
    ((P1, P2, P3) -> R)
    .apply(p1: P1, p2: P2)
    : (P3) -> R
    = { p3 -> this(p1, p2, p3) }

// endregion


// region: Function4

fun <P1, P2, P3, P4, R>
    ((P1, P2, P3, P4) -> R)
    .apply(p1: P1)
    : (P2, P3, P4) -> R
    = { p2, p3, p4 -> this(p1, p2, p3, p4) }

fun <P1, P2, P3, P4, R>
    ((P1, P2, P3, P4) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4) -> R
    = { p3, p4 -> this(p1, p2, p3, p4) }

fun <P1, P2, P3, P4, R>
    ((P1, P2, P3, P4) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4) -> R
    = { p4 -> this(p1, p2, p3, p4) }

// endregion


// region: Function5

fun <P1, P2, P3, P4, P5, R>
    ((P1, P2, P3, P4, P5) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5) -> R
    = { p2, p3, p4, p5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R>
    ((P1, P2, P3, P4, P5) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5) -> R
    = { p3, p4, p5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R>
    ((P1, P2, P3, P4, P5) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5) -> R
    = { p4, p5 -> this(p1, p2, p3, p4, p5) }

fun <P1, P2, P3, P4, P5, R>
    ((P1, P2, P3, P4, P5) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5) -> R
    = { p5 -> this(p1, p2, p3, p4, p5) }

// endregion


// region: Function6

fun <P1, P2, P3, P4, P5, P6, R>
    ((P1, P2, P3, P4, P5, P6) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6) -> R
    = { p2, p3, p4, p5, p6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R>
    ((P1, P2, P3, P4, P5, P6) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6) -> R
    = { p3, p4, p5, p6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R>
    ((P1, P2, P3, P4, P5, P6) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6) -> R
    = { p4, p5, p6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R>
    ((P1, P2, P3, P4, P5, P6) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6) -> R
    = { p5, p6 -> this(p1, p2, p3, p4, p5, p6) }

fun <P1, P2, P3, P4, P5, P6, R>
    ((P1, P2, P3, P4, P5, P6) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6) -> R
    = { p6 -> this(p1, p2, p3, p4, p5, p6) }

// endregion


// region: Function7

fun <P1, P2, P3, P4, P5, P6, P7, R>
    ((P1, P2, P3, P4, P5, P6, P7) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7) -> R
    = { p2, p3, p4, p5, p6, p7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R>
    ((P1, P2, P3, P4, P5, P6, P7) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7) -> R
    = { p3, p4, p5, p6, p7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R>
    ((P1, P2, P3, P4, P5, P6, P7) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7) -> R
    = { p4, p5, p6, p7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R>
    ((P1, P2, P3, P4, P5, P6, P7) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7) -> R
    = { p5, p6, p7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R>
    ((P1, P2, P3, P4, P5, P6, P7) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7) -> R
    = { p6, p7 -> this(p1, p2, p3, p4, p5, p6, p7) }

fun <P1, P2, P3, P4, P5, P6, P7, R>
    ((P1, P2, P3, P4, P5, P6, P7) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7) -> R
    = { p7 -> this(p1, p2, p3, p4, p5, p6, p7) }

// endregion


// region: Function8

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8) -> R
    = { p2, p3, p4, p5, p6, p7, p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8) -> R
    = { p3, p4, p5, p6, p7, p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8) -> R
    = { p4, p5, p6, p7, p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8) -> R
    = { p5, p6, p7, p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8) -> R
    = { p6, p7, p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8) -> R
    = { p7, p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8) -> R
    = { p8 -> this(p1, p2, p3, p4, p5, p6, p7, p8) }

// endregion


// region: Function9

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9) -> R
    = { p3, p4, p5, p6, p7, p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9) -> R
    = { p4, p5, p6, p7, p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9) -> R
    = { p5, p6, p7, p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9) -> R
    = { p6, p7, p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9) -> R
    = { p7, p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9) -> R
    = { p8, p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9) -> R
    = { p9 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9) }

// endregion


// region: Function10

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10) -> R
    = { p4, p5, p6, p7, p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10) -> R
    = { p5, p6, p7, p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10) -> R
    = { p6, p7, p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10) -> R
    = { p7, p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10) -> R
    = { p8, p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10) -> R
    = { p9, p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10) -> R
    = { p10 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10) }

// endregion


// region: Function11

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11) -> R
    = { p5, p6, p7, p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11) -> R
    = { p6, p7, p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11) -> R
    = { p7, p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11) -> R
    = { p8, p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11) -> R
    = { p9, p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11) -> R
    = { p10, p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11) -> R
    = { p11 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11) }

// endregion


// region: Function12

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12) -> R
    = { p6, p7, p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12) -> R
    = { p7, p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12) -> R
    = { p8, p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12) -> R
    = { p9, p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12) -> R
    = { p10, p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12) -> R
    = { p11, p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12) -> R
    = { p12 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12) }

// endregion


// region: Function13

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13) -> R
    = { p7, p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13) -> R
    = { p8, p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13) -> R
    = { p9, p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13) -> R
    = { p10, p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13) -> R
    = { p11, p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13) -> R
    = { p12, p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13) -> R
    = { p13 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13) }

// endregion


// region: Function14

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14) -> R
    = { p8, p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14) -> R
    = { p9, p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14) -> R
    = { p10, p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14) -> R
    = { p11, p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14) -> R
    = { p12, p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14) -> R
    = { p13, p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14) -> R
    = { p14 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14) }

// endregion


// region: Function15

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15) -> R
    = { p9, p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15) -> R
    = { p10, p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15) -> R
    = { p11, p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15) -> R
    = { p12, p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15) -> R
    = { p13, p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15) -> R
    = { p14, p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15) -> R
    = { p15 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15) }

// endregion


// region: Function16

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16) -> R
    = { p10, p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16) -> R
    = { p11, p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16) -> R
    = { p12, p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16) -> R
    = { p13, p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16) -> R
    = { p14, p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16) -> R
    = { p15, p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16) -> R
    = { p16 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16) }

// endregion


// region: Function17

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16, P17) -> R
    = { p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16, P17) -> R
    = { p11, p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16, P17) -> R
    = { p12, p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16, P17) -> R
    = { p13, p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16, P17) -> R
    = { p14, p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16, P17) -> R
    = { p15, p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16, P17) -> R
    = { p16, p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
    : (P17) -> R
    = { p17 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17) }

// endregion


// region: Function18

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16, P17, P18) -> R
    = { p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16, P17, P18) -> R
    = { p12, p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16, P17, P18) -> R
    = { p13, p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16, P17, P18) -> R
    = { p14, p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16, P17, P18) -> R
    = { p15, p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16, P17, P18) -> R
    = { p16, p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
    : (P17, P18) -> R
    = { p17, p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
    : (P18) -> R
    = { p18 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18) }

// endregion


// region: Function19

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16, P17, P18, P19) -> R
    = { p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16, P17, P18, P19) -> R
    = { p13, p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16, P17, P18, P19) -> R
    = { p14, p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16, P17, P18, P19) -> R
    = { p15, p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16, P17, P18, P19) -> R
    = { p16, p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
    : (P17, P18, P19) -> R
    = { p17, p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
    : (P18, P19) -> R
    = { p18, p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
    : (P19) -> R
    = { p19 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19) }

// endregion


// region: Function20

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16, P17, P18, P19, P20) -> R
    = { p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16, P17, P18, P19, P20) -> R
    = { p14, p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16, P17, P18, P19, P20) -> R
    = { p15, p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16, P17, P18, P19, P20) -> R
    = { p16, p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
    : (P17, P18, P19, P20) -> R
    = { p17, p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
    : (P18, P19, P20) -> R
    = { p18, p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
    : (P19, P20) -> R
    = { p19, p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19)
    : (P20) -> R
    = { p20 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20) }

// endregion


// region: Function21

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16, P17, P18, P19, P20, P21) -> R
    = { p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16, P17, P18, P19, P20, P21) -> R
    = { p15, p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16, P17, P18, P19, P20, P21) -> R
    = { p16, p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
    : (P17, P18, P19, P20, P21) -> R
    = { p17, p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
    : (P18, P19, P20, P21) -> R
    = { p18, p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
    : (P19, P20, P21) -> R
    = { p19, p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19)
    : (P20, P21) -> R
    = { p20, p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20)
    : (P21) -> R
    = { p21 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21) }

// endregion


// region: Function22

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1)
    : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2)
    : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3)
    : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4)
    : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
    : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
    : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
    : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
    : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
    : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
    : (P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
    : (P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
    : (P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
    : (P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
    : (P15, P16, P17, P18, P19, P20, P21, P22) -> R
    = { p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
    : (P16, P17, P18, P19, P20, P21, P22) -> R
    = { p16, p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
    : (P17, P18, P19, P20, P21, P22) -> R
    = { p17, p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
    : (P18, P19, P20, P21, P22) -> R
    = { p18, p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
    : (P19, P20, P21, P22) -> R
    = { p19, p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19)
    : (P20, P21, P22) -> R
    = { p20, p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20)
    : (P21, P22) -> R
    = { p21, p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
    ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
    .apply(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21)
    : (P22) -> R
    = { p22 -> this(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22) }

// endregion
