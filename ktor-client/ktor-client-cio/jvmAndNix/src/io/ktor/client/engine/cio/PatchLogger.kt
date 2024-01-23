package io.ktor.client.engine.cio


public object PatchLogger {
    public var logger: ((message: String) -> Unit)? = null
    internal fun log(message: String) { logger?.invoke(message) }
}
