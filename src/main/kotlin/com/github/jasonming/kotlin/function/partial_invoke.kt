@file:Suppress("NOTHING_TO_INLINE")

package com.github.jasonming.kotlin.function


/* **********************************
 *  Extensions for operator `invoke`
 * **********************************/


// region: Function2

inline operator fun <P1, P2, R>
        ((P1, P2) -> R)
        .invoke(p1: P1)
        : (P2) -> R
        = this.apply(p1)

// endregion


// region: Function3

inline operator fun <P1, P2, P3, R>
        ((P1, P2, P3) -> R)
        .invoke(p1: P1)
        : (P2, P3) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, R>
        ((P1, P2, P3) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3) -> R
        = this.apply(p1, p2)

// endregion


// region: Function4

inline operator fun <P1, P2, P3, P4, R>
        ((P1, P2, P3, P4) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, R>
        ((P1, P2, P3, P4) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, R>
        ((P1, P2, P3, P4) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4) -> R
        = this.apply(p1, p2, p3)

// endregion


// region: Function5

inline operator fun <P1, P2, P3, P4, P5, R>
        ((P1, P2, P3, P4, P5) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, R>
        ((P1, P2, P3, P4, P5) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, R>
        ((P1, P2, P3, P4, P5) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, R>
        ((P1, P2, P3, P4, P5) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5) -> R
        = this.apply(p1, p2, p3, p4)

// endregion


// region: Function6

inline operator fun <P1, P2, P3, P4, P5, P6, R>
        ((P1, P2, P3, P4, P5, P6) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, R>
        ((P1, P2, P3, P4, P5, P6) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, R>
        ((P1, P2, P3, P4, P5, P6) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, R>
        ((P1, P2, P3, P4, P5, P6) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, R>
        ((P1, P2, P3, P4, P5, P6) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6) -> R
        = this.apply(p1, p2, p3, p4, p5)

// endregion


// region: Function7

inline operator fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1, P2, P3, P4, P5, P6, P7) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1, P2, P3, P4, P5, P6, P7) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1, P2, P3, P4, P5, P6, P7) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1, P2, P3, P4, P5, P6, P7) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1, P2, P3, P4, P5, P6, P7) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1, P2, P3, P4, P5, P6, P7) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)

// endregion


// region: Function8

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)

// endregion


// region: Function9

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)

// endregion


// region: Function10

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)

// endregion


// region: Function11

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)

// endregion


// region: Function12

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)

// endregion


// region: Function13

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)

// endregion


// region: Function14

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)

// endregion


// region: Function15

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)

// endregion


// region: Function16

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)

// endregion


// region: Function17

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16, P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
        : (P17) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)

// endregion


// region: Function18

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16, P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
        : (P17, P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
        : (P18) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)

// endregion


// region: Function19

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16, P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
        : (P17, P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
        : (P18, P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
        : (P19) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18)

// endregion


// region: Function20

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16, P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
        : (P17, P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
        : (P18, P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
        : (P19, P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19)
        : (P20) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19)

// endregion


// region: Function21

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16, P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
        : (P17, P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
        : (P18, P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
        : (P19, P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19)
        : (P20, P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20)
        : (P21) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20)

// endregion


// region: Function22

inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1)
        : (P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2)
        : (P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3)
        : (P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4)
        : (P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5)
        : (P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6)
        : (P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7)
        : (P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8)
        : (P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9)
        : (P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10)
        : (P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11)
        : (P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12)
        : (P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13)
        : (P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14)
        : (P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15)
        : (P16, P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16)
        : (P17, P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17)
        : (P18, P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18)
        : (P19, P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19)
        : (P20, P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20)
        : (P21, P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20)
inline operator fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R)
        .invoke(p1: P1, p2: P2, p3: P3, p4: P4, p5: P5, p6: P6, p7: P7, p8: P8, p9: P9, p10: P10, p11: P11, p12: P12, p13: P13, p14: P14, p15: P15, p16: P16, p17: P17, p18: P18, p19: P19, p20: P20, p21: P21)
        : (P22) -> R
        = this.apply(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21)

// endregion