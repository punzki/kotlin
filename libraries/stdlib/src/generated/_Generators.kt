package kotlin

//
// NOTE THIS FILE IS AUTO-GENERATED by the GenerateStandardLib.kt
// See: https://github.com/JetBrains/kotlin/tree/master/libraries/stdlib
//

import java.util.*

import java.util.Collections // TODO: it's temporary while we have java.util.Collections in js

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <T, R, V> Array<out T>.merge(array: Array<out R>, transform: (T, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> BooleanArray.merge(array: Array<out R>, transform: (Boolean, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> ByteArray.merge(array: Array<out R>, transform: (Byte, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> CharArray.merge(array: Array<out R>, transform: (Char, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> DoubleArray.merge(array: Array<out R>, transform: (Double, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> FloatArray.merge(array: Array<out R>, transform: (Float, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> IntArray.merge(array: Array<out R>, transform: (Int, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> LongArray.merge(array: Array<out R>, transform: (Long, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> ShortArray.merge(array: Array<out R>, transform: (Short, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <T, R, V> Iterable<T>.merge(array: Array<out R>, transform: (T, R) -> V): List<V> {
    val first = iterator()
    val second = array.iterator()
    val list = ArrayList<V>(collectionSizeOrDefault(10))
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <T, R, V> Array<out T>.merge(other: Iterable<R>, transform: (T, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> BooleanArray.merge(other: Iterable<R>, transform: (Boolean, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> ByteArray.merge(other: Iterable<R>, transform: (Byte, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> CharArray.merge(other: Iterable<R>, transform: (Char, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> DoubleArray.merge(other: Iterable<R>, transform: (Double, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> FloatArray.merge(other: Iterable<R>, transform: (Float, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> IntArray.merge(other: Iterable<R>, transform: (Int, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> LongArray.merge(other: Iterable<R>, transform: (Long, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <R, V> ShortArray.merge(other: Iterable<R>, transform: (Short, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(size())
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a list of values built from elements of both collections with same indexes using provided *transform*. List has length of shortest collection.
 */
public inline fun <T, R, V> Iterable<T>.merge(other: Iterable<R>, transform: (T, R) -> V): List<V> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<V>(collectionSizeOrDefault(10))
    while (first.hasNext() && second.hasNext()) {
        list.add(transform(first.next(), second.next()))
    }
    return list
}

/**
 * Returns a stream of values built from elements of both collections with same indexes using provided *transform*. Stream has length of shortest stream.
 */
public fun <T, R, V> Stream<T>.merge(stream: Stream<R>, transform: (T, R) -> V): Stream<V> {
    return MergingStream(this, stream, transform)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun <T> Array<out T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
    val first = ArrayList<T>()
    val second = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun BooleanArray.partition(predicate: (Boolean) -> Boolean): Pair<List<Boolean>, List<Boolean>> {
    val first = ArrayList<Boolean>()
    val second = ArrayList<Boolean>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun ByteArray.partition(predicate: (Byte) -> Boolean): Pair<List<Byte>, List<Byte>> {
    val first = ArrayList<Byte>()
    val second = ArrayList<Byte>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun CharArray.partition(predicate: (Char) -> Boolean): Pair<List<Char>, List<Char>> {
    val first = ArrayList<Char>()
    val second = ArrayList<Char>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun DoubleArray.partition(predicate: (Double) -> Boolean): Pair<List<Double>, List<Double>> {
    val first = ArrayList<Double>()
    val second = ArrayList<Double>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun FloatArray.partition(predicate: (Float) -> Boolean): Pair<List<Float>, List<Float>> {
    val first = ArrayList<Float>()
    val second = ArrayList<Float>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun IntArray.partition(predicate: (Int) -> Boolean): Pair<List<Int>, List<Int>> {
    val first = ArrayList<Int>()
    val second = ArrayList<Int>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun LongArray.partition(predicate: (Long) -> Boolean): Pair<List<Long>, List<Long>> {
    val first = ArrayList<Long>()
    val second = ArrayList<Long>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun ShortArray.partition(predicate: (Short) -> Boolean): Pair<List<Short>, List<Short>> {
    val first = ArrayList<Short>()
    val second = ArrayList<Short>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun <T> Iterable<T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
    val first = ArrayList<T>()
    val second = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun <T> Stream<T>.partition(predicate: (T) -> Boolean): Pair<List<T>, List<T>> {
    val first = ArrayList<T>()
    val second = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            first.add(element)
        } else {
            second.add(element)
        }
    }
    return Pair(first, second)
}

/**
 * Splits original collection into pair of collections,
 * where *first* collection contains elements for which predicate yielded *true*,
 * while *second* collection contains elements for which predicate yielded *false*
 */
public inline fun String.partition(predicate: (Char) -> Boolean): Pair<String, String> {
    val first = StringBuilder()
    val second = StringBuilder()
    for (element in this) {
        if (predicate(element)) {
            first.append(element)
        } else {
            second.append(element)
        }
    }
    return Pair(first.toString(), second.toString())
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Array<out T>.plus(array: Array<out T>): List<T> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun BooleanArray.plus(array: Array<out Boolean>): List<Boolean> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ByteArray.plus(array: Array<out Byte>): List<Byte> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun CharArray.plus(array: Array<out Char>): List<Char> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun DoubleArray.plus(array: Array<out Double>): List<Double> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun FloatArray.plus(array: Array<out Float>): List<Float> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun IntArray.plus(array: Array<out Int>): List<Int> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun LongArray.plus(array: Array<out Long>): List<Long> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ShortArray.plus(array: Array<out Short>): List<Short> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Iterable<T>.plus(array: Array<out T>): List<T> {
    val answer = toArrayList()
    answer.addAll(array)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Array<out T>.plus(collection: Iterable<T>): List<T> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun BooleanArray.plus(collection: Iterable<Boolean>): List<Boolean> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ByteArray.plus(collection: Iterable<Byte>): List<Byte> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun CharArray.plus(collection: Iterable<Char>): List<Char> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun DoubleArray.plus(collection: Iterable<Double>): List<Double> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun FloatArray.plus(collection: Iterable<Float>): List<Float> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun IntArray.plus(collection: Iterable<Int>): List<Int> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun LongArray.plus(collection: Iterable<Long>): List<Long> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun ShortArray.plus(collection: Iterable<Short>): List<Short> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then all elements of the given *collection*
 */
public fun <T> Iterable<T>.plus(collection: Iterable<T>): List<T> {
    val answer = toArrayList()
    answer.addAll(collection)
    return answer
}

/**
 * Returns a stream containing all elements of original stream and then all elements of the given *collection*
 */
public fun <T> Stream<T>.plus(collection: Iterable<T>): Stream<T> {
    return Multistream(streamOf(this, collection.stream()))
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun <T> Array<out T>.plus(element: T): List<T> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun BooleanArray.plus(element: Boolean): List<Boolean> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun ByteArray.plus(element: Byte): List<Byte> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun CharArray.plus(element: Char): List<Char> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun DoubleArray.plus(element: Double): List<Double> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun FloatArray.plus(element: Float): List<Float> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun IntArray.plus(element: Int): List<Int> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun LongArray.plus(element: Long): List<Long> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun ShortArray.plus(element: Short): List<Short> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a list containing all elements of original collection and then the given element
 */
public fun <T> Iterable<T>.plus(element: T): List<T> {
    val answer = toArrayList()
    answer.add(element)
    return answer
}

/**
 * Returns a stream containing all elements of original stream and then the given element
 */
public fun <T> Stream<T>.plus(element: T): Stream<T> {
    return Multistream(streamOf(this, streamOf(element)))
}

/**
 * Returns a stream containing all elements of original stream and then all elements of the given *stream*
 */
public fun <T> Stream<T>.plus(stream: Stream<T>): Stream<T> {
    return Multistream(streamOf(this, stream))
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Array<out T>.zip(array: Array<out R>): List<Pair<T, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> BooleanArray.zip(array: Array<out R>): List<Pair<Boolean, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ByteArray.zip(array: Array<out R>): List<Pair<Byte, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> CharArray.zip(array: Array<out R>): List<Pair<Char, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> DoubleArray.zip(array: Array<out R>): List<Pair<Double, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> FloatArray.zip(array: Array<out R>): List<Pair<Float, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> IntArray.zip(array: Array<out R>): List<Pair<Int, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> LongArray.zip(array: Array<out R>): List<Pair<Long, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ShortArray.zip(array: Array<out R>): List<Pair<Short, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Iterable<T>.zip(array: Array<out R>): List<Pair<T, R>> {
    return merge(array) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Array<out T>.zip(other: Iterable<R>): List<Pair<T, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> BooleanArray.zip(other: Iterable<R>): List<Pair<Boolean, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ByteArray.zip(other: Iterable<R>): List<Pair<Byte, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> CharArray.zip(other: Iterable<R>): List<Pair<Char, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> DoubleArray.zip(other: Iterable<R>): List<Pair<Double, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> FloatArray.zip(other: Iterable<R>): List<Pair<Float, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> IntArray.zip(other: Iterable<R>): List<Pair<Int, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> LongArray.zip(other: Iterable<R>): List<Pair<Long, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <R> ShortArray.zip(other: Iterable<R>): List<Pair<Short, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from elements of both collections with same indexes. List has length of shortest collection.
 */
public fun <T, R> Iterable<T>.zip(other: Iterable<R>): List<Pair<T, R>> {
    return merge(other) { (t1, t2) -> t1 to t2 }
}

/**
 * Returns a list of pairs built from characters of both strings with same indexes. List has length of shortest collection.
 */
public fun String.zip(other: String): List<Pair<Char, Char>> {
    val first = iterator()
    val second = other.iterator()
    val list = ArrayList<Pair<Char, Char>>(length())
    while (first.hasNext() && second.hasNext()) {
        list.add(first.next() to second.next())
    }
    return list
}

/**
 * Returns a stream of pairs built from elements of both collections with same indexes. Stream has length of shortest stream.
 */
public fun <T, R> Stream<T>.zip(stream: Stream<R>): Stream<Pair<T, R>> {
    return MergingStream(this, stream) { (t1, t2) -> t1 to t2 }
}

