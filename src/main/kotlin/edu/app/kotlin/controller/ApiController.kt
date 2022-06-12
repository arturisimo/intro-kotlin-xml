package edu.app.kotlin.controller

import edu.app.kotlin.service.ConnectorService
import edu.app.kotlin.service.ParseDomService
import edu.app.kotlin.util.XMLUtils
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class EntrypointController(
    private val connectorService: ConnectorService,
    private val parseDomService: ParseDomService,
) {

    @GetMapping("/pms")
    fun pms(): ResponseEntity<Any> {
        return try {
            val xml: String = connectorService.pms()
            val start = System.nanoTime()
            val pms = XMLUtils.unmarshal<jaxb.model.Pms>(xml)
            println("execution time jaxb: ${(System.nanoTime() - start)/1_000_000} ms")
            ResponseEntity(pms, HttpStatus.OK)
        } catch (e: Exception){
            ResponseEntity(e.message, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/pms/dom")
    fun pmsDom(): ResponseEntity<Any> {
        return try {
            val start = System.nanoTime()
            val xml: String = connectorService.pms()
            val pms = parseDomService.parse(xml)
            println("execution time dom: ${(System.nanoTime() - start)/1_000_000} ms")
            ResponseEntity(pms, HttpStatus.OK)
        } catch (e: Exception){
            ResponseEntity(e.message, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

}
