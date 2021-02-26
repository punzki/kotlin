// "Replace with safe (?.) call" "true"
fun foo(a: String?) {
    a<caret>.length
}
/* FIR_COMPARISON */