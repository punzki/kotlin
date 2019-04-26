// TARGET_BACKEND: JVM_IR
import kotlin.test.*

fun box(): String {
    var sum = 0
    for (i in (1 until 5).reversed()) {
        sum = sum * 10 + i
    }

    var sumL = 0L
    for (i in (1L until 5L).reversed()) {
        sumL = sumL * 10 + i
    }

    var sumC = 0
    for (i in ('1' until '5').reversed()) {
        sumC = sumC * 10 + i.toInt() - '0'.toInt()
    }

    return "OK"
}

// JVM non-IR uses while.
// JVM IR uses if + do-while. The surrounding "if" gets optimized in this test (constant condition), except for Long.

// 0 reversed
// 0 iterator
// 0 getStart
// 0 getEnd
// 0 getFirst
// 0 getLast
// 0 getStep
// 2 IF_ICMPNE
// 1 IFGT
// 1 IFNE
// 4 IF
// 2 LCMP