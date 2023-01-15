package com.example.assignment7quizapp.di

import android.app.Application
import androidx.room.Room
import com.example.assignment7quizapp.constants.Constant
import com.example.assignment7quizapp.database.QuizDatabase
import com.example.assignment7quizapp.repository.QuizRepository
import com.example.assignment7quizapp.repository.QuizRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideQuizDatabase(context: Application) : QuizDatabase {
        return Room.databaseBuilder(
            context,
            QuizDatabase::class.java,
            Constant.DB_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideQuizRepository(db: QuizDatabase) : QuizRepository {
        return QuizRepositoryImpl(db)
    }
}