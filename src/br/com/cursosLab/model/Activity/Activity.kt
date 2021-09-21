package br.com.cursosLab.model.Activity

import br.com.cursosLab.model.Section
import java.lang.Exception

abstract class Activity(
    val title: String,
    val id: String,
    val active: Boolean = false,
    val sequence: Int,
    val activityType: ActivityType,
    val section: Section,

    ) {
    init {
        titleVerify()
        idVerify()
        sequenceVerify()

    }

    private fun titleVerify() {
        if (this.title.isEmpty()) {
            throw Exception("ERRO, Activity title not be empty!!")
        }
    }

    private fun idVerify() {
        val regex = "^[a-z,.'-]+\$".toRegex()
        if (!regex.containsMatchIn(this.id)) {
            throw Exception("ERRO, Activity ID have only lowercase letter and - and not be empty!!")
        }
    }
    
    private fun sequenceVerify() {
        if (this.sequence < 0) {
            throw Exception("ERRO, sequence most be biger than 0 !!")
        }
    }

    protected abstract fun activityTipeVerify()

    enum class ActivityType {
        EXPLICATION,
        VIDEO,
        QUESTION
    }
}

