package edu.app.kotlin.util

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.StringWriter
import javax.xml.bind.JAXBContext
import javax.xml.bind.Marshaller
import javax.xml.bind.UnmarshalException
import javax.xml.bind.annotation.XmlRootElement

class XMLUtils {

    companion object Methods {

        val errorLogger: Logger = LoggerFactory.getLogger("error")

        /**
         * JAXB unmarshalling
         */
        inline fun <reified T>  unmarshal(xml: String): T {

            val jaxbContext = JAXBContext.newInstance(T::class.java)
            val unmarshaller = jaxbContext.createUnmarshaller()

            xml.reader().use { it ->

                return try {
                    unmarshaller.unmarshal(it) as T
                } catch (ume: UnmarshalException) {
                    errorLogger.error(ume.linkedException.message)
                    throw Exception("Error unmarshalling: $ume")
                } catch (e: Exception) {
                    errorLogger.error(e.message)
                    throw Exception("Error unmarshalling: $e.message")
                }

            }
        }

        /**
         * JAXB marshalling
         */
        inline fun <reified T>  marshal(obj: T): String {

            val jaxbContext = JAXBContext.newInstance(T::class.java)
            val marshaller = jaxbContext.createMarshaller()
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true)
            val sw = StringWriter()
            sw.use {
                marshaller.marshal(obj, sw)
            }
            return sw.toString()
        }

        inline fun <reified T> isRoot() : Boolean =
            T::class.java.annotations.any { it.annotationClass == XmlRootElement::class.java }


    }

}
