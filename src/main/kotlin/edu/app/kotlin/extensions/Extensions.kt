package edu.app.kotlin.controller.extensions

import org.w3c.dom.Node
import org.w3c.dom.NodeList
import java.io.StringWriter
import java.net.URLEncoder
import javax.xml.transform.TransformerFactory
import javax.xml.transform.dom.DOMSource
import javax.xml.transform.stream.StreamResult

fun NodeList.findNodeByName(name: String): Node? {
    for (i in 0 until this.length) {
        if (this.item(i).nodeName == name) {
            return this.item(i)
        }
    }
    return null
}

fun Node.getTrimmedContent(): String = this.textContent.trim()





