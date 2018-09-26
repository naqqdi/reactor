package com.dfmabbas.reactor.security

import android.content.Context
import com.dfmabbas.reactor.engine.EngineController
import com.dfmabbas.reactor.engine.convertToAny
import com.dfmabbas.reactor.handler.Algorithm

internal class SecurityController(appContext: Context, alg: Algorithm) {
    private var engineController = EngineController(appContext, alg.name)
    private val securityModel = SecurityModel(appContext, alg)

    internal fun put(key: String, value: Any): Boolean {
        return engineController.put(key, securityModel.encryptValue(value.toString()), value)
    }

    internal fun <T> get(key: String, default: T): T {
        val value = engineController.get(key, default) ?: return default
        val newValue = try {
            securityModel.decryptValue("$value")
        } catch (ex: Exception) {
            ex.printStackTrace()
            default
        }

        return newValue.toString().convertToAny(default as Any) as T ?: return default
    }

    fun remove(key: String, type: Any): Boolean {
        return engineController.remove(key, type)
    }

    fun clearAll() {
        engineController.clearAll()
    }
}