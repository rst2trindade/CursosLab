package br.com.cursosLab.model

import java.lang.Exception

class Section(
    val name: String,
    val id: String,
    val position: Int = 0,
    val atived: Boolean = false,
    val exam : Boolean = false,
    val course: Course


    ) {
    init {
        nameVerify()
        idVerify()
    }

    private fun nameVerify() {
        val regex = "^[A-z]+\$".toRegex()
        if (!regex.containsMatchIn(this.name)) {
            throw Exception("Section, Course name have only letters and not be empty!!")
        }
    }

    private fun idVerify() {
        val regex = "^[a-z,.'-]+\$".toRegex()
        if (!regex.containsMatchIn(this.id)) {
            throw Exception("Section, Course ID have only lowercase letter and - and not be empty!!")
        }
    }


}