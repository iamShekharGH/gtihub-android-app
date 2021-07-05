package com.iamshekhargh.githubandroidapp.util

/**
 * Created by <<-- iamShekharGH -->>
 * on 05 July 2021, Monday
 * at 2:35 PM
 */


sealed class Resources<T>(
    val data: T? = null,
    val message: String? = null
) {

    class Success<T>(data: T) : Resources<T>(data)

    class Failure<T>(text: String) : Resources<T>(null, text)

    class Loading<T>(data: T?) : Resources<T>(data)
}

