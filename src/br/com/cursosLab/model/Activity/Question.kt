package br.com.cursosLab.model.Activity

import br.com.cursosLab.model.Section
import java.lang.Exception

class Question(
    title: String,
    id: String,
    active: Boolean = false,
    sequence: Int,
    activityType: ActivityType,
    section: Section,
    val detail: String,
    val questionType: QuestionType,
) : Activity(title = title,
    id = id,
    active = active,
    sequence = sequence,
    activityType = activityType,
    section = section) {
    init {
        detailVerify()
        activityTipeVerify()
    }

    private fun detailVerify() {
        if (this.detail.isEmpty()) {
            throw Exception("ERRO, Question detail not be empty!!")
        }
    }

    override fun activityTipeVerify() {
        if (this.activityType != ActivityType.QUESTION) {
            throw Exception("ERRO, Question tyType most be QUESTION!!")
        }
    }

    enum class QuestionType {
        SINGLE,
        MULTIPLE,
        TRUEORFALSE
    }

}

