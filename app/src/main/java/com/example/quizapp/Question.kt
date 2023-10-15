package com.example.quizapp

data class Question(



    val ID: Int,
    val question: String,
    val image: Int,

    val optionsOne:String,
    val optionsTwo:String,
    val optionsThree:String,
    val optionFour:String,
    val correctAnswer: Int
)
