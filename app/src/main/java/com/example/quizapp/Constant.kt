package com.example.quizapp

object Constant {
    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTION:String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,"What country does this flag belong to?",
           R.drawable.portugal,
            "Argentina","Spain","Portugal","Pakistan",3

        )
        questionList.add(que1)
        val que2 = Question(
            2,"What country does this flag belong to?",
            R.drawable.india,
            "Argentina","India","China","Pakistan",2

        )
        questionList.add(que2)
        val que3 = Question(
            3,"What country does this flag belong to?",
            R.drawable.austrlia,
            "New Zealand","Spain","Portugal","Australia",4

        )
        questionList.add(que3)
        val que4 = Question(
            4,"What country does this flag belong to?",
            R.drawable.germany,
            "Germany","France","Portugal","Pakistan",1

        )
        questionList.add(que4)

        val que5 = Question(
            5,"What country does this flag belong to?",
            R.drawable.brazil,
            "Argentina","Brazil","Portugal","India",2

        )
        questionList.add(que5)

        val que6 = Question(
            6,"What country does this flag belong to?",
            R.drawable.denmark,
            "IceLand","Spain","Portugal","Denmark",4

        )
        questionList.add(que6)

        val que7 = Question(
            7,"What country does this flag belong to?",
            R.drawable.belgium,
            "Argentina","Belgium","Portugal","Poland",2

        )
        questionList.add(que7)

        val que8 = Question(
            8,"What country does this flag belong to?",
            R.drawable.fiji,
            "Fiji","ASSAM","Portugal","BRITISH",1

        )
        questionList.add(que8)

        val que9 = Question(
            9,"What country does this flag belong to?",
            R.drawable.kuwait,
            "Dubai","Qatar","U.A.E","Kuwait",4

        )
        questionList.add(que9)





        return questionList
    }
}