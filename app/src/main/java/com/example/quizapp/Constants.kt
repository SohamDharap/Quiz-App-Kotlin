package com.example.quizapp

object Constants {
    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
                1, "What country this flag belong to?",
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Brazil", "India",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2, "What country this flag belong to?",
            R.drawable.ic_flag_of_australia, "Belgium", "Australia", "Australia", "USA",
            4
        )

        questionList.add(que2)


        val que3 = Question(
            3, "What country this flag belong to?",
            R.drawable.ic_flag_of_belgium, "Fiji", "Germany", "Brazil", "Belgium",
            4
        )

        questionList.add(que3)


        val que4 = Question(
            4, "What country this flag belong to?",
            R.drawable.ic_flag_of_brazil, "Denmark", "Australia", "Brazil", "France",
            3
        )

        questionList.add(que4)


        val que5 = Question(
            5, "What country this flag belong to?",
            R.drawable.ic_flag_of_denmark, "Denmark", "Austria", "Cuba", "Afghanistan",
            1
        )

        questionList.add(que5)


        val que6 = Question(
            6, "What country this flag belong to?",
            R.drawable.ic_flag_of_fiji, "Germany", "Fiji", "Denmark", "India",
            2
        )

        questionList.add(que6)


        val que7 = Question(
            7, "What country this flag belong to?",
            R.drawable.ic_flag_of_germany, "USA", "Poland", "Russia", "Germany",
            7
        )

        questionList.add(que7)


        val que8 = Question(
            8, "What country this flag belong to?",
            R.drawable.ic_flag_of_india, "Italy", "Niger", "Brazil", "India",
            4
        )

        questionList.add(que8)


        val que9 = Question(
            9, "What country this flag belong to?",
            R.drawable.ic_flag_of_kuwait, "UAE", "Iraq", "Kuwait", "Afghanistan",
            3
        )

        questionList.add(que9)


        val que10 = Question(
            10, "What country this flag belong to?",
            R.drawable.ic_flag_of_new_zealand, "Austria", "Australia", "USA", "New Zealand",
            4
        )

        questionList.add(que10)

        return questionList
    }
}