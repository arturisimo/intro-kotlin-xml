package edu.app.kotlin.service

import edu.app.kotlin.controller.extensions.findNodeByName
import edu.app.kotlin.controller.extensions.getTrimmedContent
import edu.app.kotlin.model.Pm
import edu.app.kotlin.model.Pms
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service
import org.w3c.dom.Document
import org.w3c.dom.Node
import org.w3c.dom.NodeList
import org.xml.sax.InputSource
import org.xml.sax.SAXParseException
import java.io.StringReader
import javax.xml.parsers.DocumentBuilderFactory

@Service
class ParseDomService {

    val errorLogger: Logger = LoggerFactory.getLogger("error")

    fun parse(xml: String): Pms? {

        val inputSource = InputSource(StringReader(xml))

        val listOfPM = mutableListOf<Pm>()

        try {
            val xmlDoc: Document = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(inputSource)
            xmlDoc.documentElement.normalize()

            val fechaHora = xmlDoc.getElementsByTagName("fecha_hora").item(0)?.getTrimmedContent()!!
            val pmList: NodeList = xmlDoc.getElementsByTagName("pm")

            for (i in 0 until pmList.length) {
                val pmNode: Node = pmList.item(i)

                listOfPM.add(
                    Pm(
                        pmNode.childNodes.findNodeByName("idelem")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("descripcion")?.getTrimmedContent(),
                        pmNode.childNodes.findNodeByName("accesoAsociado")?.getTrimmedContent(),
                        pmNode.childNodes.findNodeByName("intensidad")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("ocupacion")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("carga")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("nivelServicio")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("intensidadSat")?.getTrimmedContent(),
                        pmNode.childNodes.findNodeByName("velocidad")?.getTrimmedContent(),
                        pmNode.childNodes.findNodeByName("error")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("subarea")?.getTrimmedContent(),
                        pmNode.childNodes.findNodeByName("st_x")?.getTrimmedContent()!!,
                        pmNode.childNodes.findNodeByName("st_y")?.getTrimmedContent()!!
                    )
                )
            }
            return Pms(fechaHora, listOfPM)

        } catch (spe: SAXParseException) {
            errorLogger.error(spe.message)
            throw Exception("Error unmarshalling: $spe.message")
        }

    }
}
