package com.example.assignment7quizapp.ui.home

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.assignment7quizapp.constants.Constant.IS_CHECK_BOX
import com.example.assignment7quizapp.constants.Constant.IS_RADIO_BUTTON
import com.example.assignment7quizapp.data.Quiz
import com.example.assignment7quizapp.ui.checkBoxQuestions.CheckBoxQuestionFragment
import com.example.assignment7quizapp.ui.radioButtonQuestions.RadioButtonQuestionFragment
import com.example.assignment7quizapp.ui.result.ResultFragment
import com.google.gson.Gson

class ViewPagerAdapter(
    fragment: Fragment,
    private val questionList: List<Quiz>
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = questionList.size + 1

    override fun createFragment(position: Int): Fragment {
        val fragment: Fragment = if (position == 15) {
            ResultFragment.newInstance()
        }else {
            val quiz = questionList[position]
            //creating fragment object according to position
            when(quiz.questionType) {

                IS_CHECK_BOX -> CheckBoxQuestionFragment.newInstance(Gson().toJson(quiz))

                IS_RADIO_BUTTON -> RadioButtonQuestionFragment.newInstance(Gson().toJson(quiz))

                else -> ResultFragment.newInstance()
            }
        }

        return fragment
    }

}