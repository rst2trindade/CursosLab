package br.com.cursosLab.model.Activity

import java.lang.Exception

class Alternative(
    val text: String,
    val sequence: Int=0,
    val correct: Boolean=true,
    val justification: String="",
    val question: Question,
){
    init {
        textVerify()
    }

    private fun textVerify() {
        if (this.text.isEmpty()) {
            throw Exception("ERRO, Alternative text not be empty!!")
        }
    }
}