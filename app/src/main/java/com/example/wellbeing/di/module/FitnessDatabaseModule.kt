package com.example.wellbeing.di.module

import android.content.Context
import androidx.room.Room
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

import com.example.wellbeing.database.WaterIntakeDatabase

@InstallIn(SingletonComponent::class)
class FitnessDatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(@ApplicationContext appContext: Context) : WaterIntakeDatabase {
        return Room
            .databaseBuilder(
                appContext,
                WaterIntakeDatabase::class.java,
                "FitnessApp").
            build()
    }
}

