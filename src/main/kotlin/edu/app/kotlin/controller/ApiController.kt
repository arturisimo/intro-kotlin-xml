package edu.app.kotlin.controller

import edu.app.kotlin.model.Pms
import edu.app.kotlin.service.ConnectorService
import edu.app.kotlin.service.ParseXmlService
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EntrypointController(
    private val connectorService: ConnectorService,
    private val parseService: ParseXmlService,
) {

    @GetMapping("/pms", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun pms(): ResponseEntity<Any> {
        return try {
            val xml: String = connectorService.pms()
            var pms: jaxb.model.Pms = parseService.parseJAXB(xml)
            ResponseEntity(pms, HttpStatus.OK)
        } catch (e: Exception){
            ResponseEntity(e.message, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/pms/dom", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun pmsDom(): ResponseEntity<Any> {
        return try {
            val xml: String = connectorService.pms()
            var pms: Pms? = parseService.parseDom(xml)
            ResponseEntity(pms, HttpStatus.OK)
        } catch (e: Exception){
            ResponseEntity(e.message, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

}
