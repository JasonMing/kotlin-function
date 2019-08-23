@file:Suppress("NOTHING_TO_INLINE")

package com.github.jasonming.kotlin.function


inline fun <P1, R>
        ((P1) -> R)
        .uncurry()
        : (P1) -> R
        = { p1 -> this(p1) }

inline fun <P1, P2, R>
        ((P1) -> (P2) -> R)
        .uncurry()
        : (P1, P2) -> R
        = { p1, p2 -> this(p1)(p2) }

inline fun <P1, P2, P3, R>
        ((P1) -> (P2) -> (P3) -> R)
        .uncurry()
        : (P1, P2, P3) -> R
        = { p1, p2, p3 -> this(p1)(p2)(p3) }

inline fun <P1, P2, P3, P4, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> R)
        .uncurry()
        : (P1, P2, P3, P4) -> R
        = { p1, p2, p3, p4 -> this(p1)(p2)(p3)(p4) }

inline fun <P1, P2, P3, P4, P5, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5) -> R
        = { p1, p2, p3, p4, p5 -> this(p1)(p2)(p3)(p4)(p5) }

inline fun <P1, P2, P3, P4, P5, P6, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6) -> R
        = { p1, p2, p3, p4, p5, p6 -> this(p1)(p2)(p3)(p4)(p5)(p6) }

inline fun <P1, P2, P3, P4, P5, P6, P7, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7) -> R
        = { p1, p2, p3, p4, p5, p6, p7 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19)(p20) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> (P21) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19)(p20)(p21) }

inline fun <P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22, R>
        ((P1) -> (P2) -> (P3) -> (P4) -> (P5) -> (P6) -> (P7) -> (P8) -> (P9) -> (P10) -> (P11) -> (P12) -> (P13) -> (P14) -> (P15) -> (P16) -> (P17) -> (P18) -> (P19) -> (P20) -> (P21) -> (P22) -> R)
        .uncurry()
        : (P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, P12, P13, P14, P15, P16, P17, P18, P19, P20, P21, P22) -> R
        = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22 -> this(p1)(p2)(p3)(p4)(p5)(p6)(p7)(p8)(p9)(p10)(p11)(p12)(p13)(p14)(p15)(p16)(p17)(p18)(p19)(p20)(p21)(p22) }