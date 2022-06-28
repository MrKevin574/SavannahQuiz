package com.mrkevin574.quizsabana.di

import android.content.Context
import androidx.room.Room
import com.mrkevin574.quizsabana.data.local.QuizAppDatabase
import com.mrkevin574.quizsabana.util.NAME_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, QuizAppDatabase::class.java, NAME_DATABASE).build()

    @Provides
    @Singleton
    fun provideDao(db : QuizAppDatabase) = db.scoreDao()
}