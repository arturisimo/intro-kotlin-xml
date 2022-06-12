package edu.app.kotlin.service

import edu.app.kotlin.util.XMLUtils
import kong.unirest.HttpResponse
import kong.unirest.Unirest
import org.springframework.stereotype.Service

@Service
class ConnectorService() {

    val API_URL = "https://informo.madrid.es/informo/tmadrid/pm.xml"

    fun pms(): String {
        val response: HttpResponse<String> =
            Unirest.get(API_URL)
                .asString()
        return removeBomMarker(response.body)
    }

    private fun removeBomMarker(response: String) = response.replace("\uFEFF", "")

}
