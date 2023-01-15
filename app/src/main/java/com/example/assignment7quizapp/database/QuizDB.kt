package com.example.assignment7quizapp.database

import android.content.Context
import androidx.room.Room
import com.example.assignment7quizapp.constants.Constant
import com.example.assignment7quizapp.data.QuizDAO

class QuizDB(context: Context) {

    private var quizDatabase: QuizDatabase = Room.databaseBuilder(
        context,
        QuizDatabase::class.java,
        Constant.DB_NAME
    ).build()

    fun getQuizDAO(): QuizDAO = quizDatabase.quizDAO
}