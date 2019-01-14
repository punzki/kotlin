// !LANGUAGE: +AllowContractsForCustomFunctions +UseReturnsEffect
// !USE_EXPERIMENTAL: kotlin.contracts.ExperimentalContracts
// !DIAGNOSTICS: -INVISIBLE_REFERENCE -INVISIBLE_MEMBER
//
// ISSUE: KT-28672

import kotlin.contracts.*

fun Any?.isNull(): Boolean {
    contract {
        returns(false) implies (this@isNull != null)
    }
    return this == null
}

fun smartcastOnReceiver(x: Int?) {
    with(x) {
        if (isNull()) {
            <!UNSAFE_CALL!>inc<!>()
        }
        else {
            <!UNSAFE_CALL!>dec<!>()
        }
    }
}

fun mixedReceiver(x: Int?): Int =
    if (!x.isNull()) {
        with (<!DEBUG_INFO_SMARTCAST!>x<!>) {
            inc()
        }
    } else {
        with (x) {
            <!UNSAFE_CALL!>dec<!>()
        }
    }