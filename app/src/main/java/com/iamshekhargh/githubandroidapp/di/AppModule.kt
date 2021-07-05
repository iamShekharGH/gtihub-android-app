package com.iamshekhargh.githubandroidapp.di

import com.iamshekhargh.githubandroidapp.network.GithubApi
import com.iamshekhargh.githubandroidapp.repo.GithubAppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by <<-- iamShekharGH -->>
 * on 04 July 2021, Sunday
 * at 4:13 PM
 */

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideRepoInstance() = GithubAppRepository()

    // Room ----------------

    // ----------------

    // Retrofit -----------
    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
        .build()

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder().client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(GithubApi.BASE_URL).build()

    @Provides
    @Singleton
    fun provideGithubApi(retrofit: Retrofit) = retrofit.create(GithubApi::class.java)

    // --------------------

}