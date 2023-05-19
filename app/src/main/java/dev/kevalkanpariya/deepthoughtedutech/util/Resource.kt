package dev.kevalkanpariya.deepthoughtedutech.util

sealed class Resource<T>(val data: T? = null, val error: String? = null) {
    class Success<T>(data: T?): Resource<T>(data = data)
    class Error<T>(e: String, data: T? = null): Resource<T>(error = e, data = data)
}

typealias SimpleResource = Resource<Unit>
