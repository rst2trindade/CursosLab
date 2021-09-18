package br.com.cursosLab.model

import java.lang.Exception

class Course(
    val name: String,
    val id: String ,
    val time: Int ,
    val visibility: Boolean = false,
    val targetPublic: String = "",
    val instructor: String ,
    val pathway: String = "",
    val skill: String = "",
) {
    init {
        nameVerify()
        idVerify()
        instructorVerify()
        timeVerify()

    }

    private fun nameVerify() {
        val regex = "^[A-z]+\$".toRegex()
        if (!regex.containsMatchIn(this.name)) {
            throw Exception("ERRO, Course name have only letters and not be empty!!")
        }
    }

    private fun idVerify(){
        val regex = "^[a-z,.'-]+\$".toRegex()
        if (!regex.containsMatchIn(this.id)) {
            throw Exception("ERRO, Course ID have only lowercase letter and - and not be empty!!")
        }
    }

    private fun instructorVerify() {
        val regex = "^[A-z]+\$".toRegex()
        if (!regex.containsMatchIn(this.instructor)) {
            throw Exception("ERRO, instructor name have only letters and not be empty!!")
        }
    }

    private fun timeVerify() {
        if (this.time < 1 || this.time > 20){
            throw Exception("ERRO, Course time have length between 1 and 20 hours not be empty!!")
        }
    }


}