package com.example.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class quizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0



    private var progressBar: ProgressBar?= null
    private var progress: TextView?= null
    private var TVquestion: TextView?= null
    private var ivImage: ImageView?= null

    private var option1: TextView?= null
    private var option2: TextView?= null
    private var option3: TextView?= null
    private var option4: TextView?= null
    private var btnSubmit: Button?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        progressBar = findViewById(R.id.progressBar)
        progress = findViewById(R.id.TVprogess)
        TVquestion = findViewById(R.id.TVquestion)
        ivImage = findViewById(R.id.ivImage)

        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)
        btnSubmit = findViewById(R.id.btnSubmit)


        mQuestionList = Constants.getQuestions()

        setQuestion()


    }

    private fun setQuestion() {
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progressBar?.progress = mCurrentPosition
        progress?.text = "$mCurrentPosition/${progressBar?.max}"
        TVquestion?.text = question.question
        option1?.text = question.optionsOne
        option2?.text = question.optionsTwo
        option3?.text = question.optionsThree
        option4?.text = question.optionFour

        if(mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text = "FINISH"
        }
        else{
            btnSubmit?.text = "SUBMIT"
        }
    }


    private fun defaultOptionView(){
        val options = ArrayList<TextView>()
        option1?.let {
            options.add(0, it)
        }
        option2?.let {
            options.add(1, it)
        }
        option3?.let {
            options.add(2, it)
        }
        option4?.let {
            options.add(3, it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )

        }


    }

    private fun selectedOptionView(tv:TextView, selectedOptionNum: Int){
        defaultOptionView()

        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border
        )
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.option1 -> {
                option1?.let{
                    selectedOptionView(it, 1)
                }
            }
            R.id.option2 -> {
                option2?.let{
                    selectedOptionView(it, 2)
                }
            }
            R.id.option3 -> {
                option3?.let{
                    selectedOptionView(it, 3)
                }
            }
            R.id.option4 -> {
                option4?.let{
                    selectedOptionView(it, 4)
                }
            }
        }
    }
}