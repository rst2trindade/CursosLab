package br.com.cursosLab.model

import java.lang.Exception

class Activity(
    val title: String,
    val id: String ,
    val active: Boolean = false,
    val sequence: Int,
    val activityType: ActivityType ,
    val section: Section

) {
    init {
        titleVerify()
        idVerify()
        sequenceVerify()

    }

    private fun titleVerify() {
        val regex = "^[A-z]+\$".toRegex()
        if (!regex.containsMatchIn(this.title)) {
            throw Exception("ERRO, Course name have only letters and not be empty!!")
        }
    }

    private fun idVerify(){
        val regex = "^[a-z,.'-]+\$".toRegex()
        if (!regex.containsMatchIn(this.id)) {
            throw Exception("ERRO, Course ID have only lowercase letter and - and not be empty!!")
        }
    }


    private fun sequenceVerify(){
        if (this.sequence < 0){
            throw Exception("ERRO, sequence most be biger than 0 !!")
        }
    }

    enum class ActivityType{
        EXPLICATION,
        VIDEO,
        QUESTION
    }
}

