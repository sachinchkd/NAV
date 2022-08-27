package com.example.wellbeing.di

import android.app.Application

import com.example.wellbeing.sensors.MeasurableSensor
import com.example.wellbeing.sensors.Sensor

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object SensorModule {
    @Provides
    @Singleton
    fun provideStepSensor (app:Application): MeasurableSensor {
        return Sensor(context = app)
    }
}
