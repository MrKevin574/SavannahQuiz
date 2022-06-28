package com.mrkevin574.quizsabana.di

import android.app.Application
import androidx.room.Room
import com.mrkevin574.quizsabana.data.local.QuizAppDatabase
import com.mrkevin574.quizsabana.util.NAME_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(app: Application) =
        Room.databaseBuilder(app, QuizAppDatabase::class.java, NAME_DATABASE).build()

    @Provides
    @Singleton
    fun provideDao(db : QuizAppDatabase) = db.scoreDao()

}