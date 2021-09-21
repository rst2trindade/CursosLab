package br.com.cursosLab.model.Activity

import br.com.cursosLab.model.Section

class Video(
    title: String,
    id: String,
    active: Boolean = false,
    sequence: Int,
    activityType: ActivityType,
    section: Section,
    val url: String,
    val time: Int,
    val description: String = ""
) : Activity(title = title,
    id = id,
    active = active,
    sequence = sequence,
    activityType = activityType,
    section = section) {
    init {
        urlVerify()
        activityTipeVerify()
        timeVerify()
    }

    private fun urlVerify() {
        if (this.url.isEmpty()) {
            throw Exception("ERRO, Activity url not be empty!!")
        }
    }

    override fun activityTipeVerify() {
        if (this.activityType != ActivityType.VIDEO) {
            throw Exception("ERRO, Activi tyType most be VIDEO!!")
        }
    }

    private fun timeVerify() {
        if (this.time < 1 ){
            throw java.lang.Exception("ERROR, Video time must be have length above 0 !!")
        }
    }

}

