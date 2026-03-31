package com.lionico.template.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    // Example: Providing a Singleton Database instance
    // @Provides
    // @Singleton
    // fun provideDatabase(@ApplicationContext context: Context): AppDatabase {
    //     return Room.databaseBuilder(context, AppDatabase::class.java, "app_db").build()
    // }

    // --- ADVANCED: Retrofit/Networking ---
    // Uncomment when you add networking
    /*
    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return Retrofit.Builder()
            .baseUrl("https://api.lionico.com/")
            .build()
            .create(ApiService::class.java)
    }
    */
}
