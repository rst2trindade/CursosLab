package br.com.cursosLab.model

import java.lang.Exception

class Explication(
    title: String,
    id: String,
    active: Boolean = false,
    sequence: Int,
    activityType: ActivityType,
    section: Section,
    val detail: String,
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
            throw Exception("ERRO, Activity detail not be empty!!")
        }
    }

    override fun activityTipeVerify() {
        if (this.activityType != ActivityType.EXPLICATION) {
            throw Exception("ERRO, Activi tyType most be explication!!")
        }
    }


}

