package com.iamshekhargh.githubandroidapp.network

import retrofit2.http.GET

/**
 * Created by <<-- iamShekharGH -->>
 * on 05 July 2021, Monday
 * at 1:44 PM
 */
interface GithubApi {

    companion object {
        const val BASE_URL = ""
    }

    suspend fun getEndpoints()
}