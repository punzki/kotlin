fun foo(limit: Int) {
    var k = 0
    some@ while (k < limit) {
        k++
        println(k)
        while (k == 13) k++
    }
}

fun bar(limit: Int) {
    var k = limit
    do {
        k--
        println(k)
    } while (k >= 0)
}