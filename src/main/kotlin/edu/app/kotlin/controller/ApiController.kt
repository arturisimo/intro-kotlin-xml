package edu.app.kotlin.controller

import edu.app.kotlin.service.ConnectorService
import edu.app.kotlin.util.XMLUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EntrypointController(
    private val connectorService: ConnectorService,
) {

    @GetMapping("/pms")
    fun pms(): ResponseEntity<Any> {
        return try {
            val xml: String = connectorService.pms()
            val pms = XMLUtils.unmarshal<jaxb.model.Pms>(xml)
            ResponseEntity(pms, HttpStatus.OK)
        } catch (e: Exception){
            ResponseEntity(e.message, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

}
