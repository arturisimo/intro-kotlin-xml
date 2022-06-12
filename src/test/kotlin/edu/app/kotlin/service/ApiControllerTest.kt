package edu.app.kotlin.service

import com.ninjasquad.springmockk.MockkBean
import edu.app.kotlin.util.FileUtils
import edu.app.kotlin.util.XMLUtils
import io.mockk.every
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.boot.test.context.SpringBootTest
import java.math.BigInteger

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApiControllerTest() {

    @MockkBean
    private lateinit var connectorService: ConnectorService

    @Test
    fun jaxb() {
        val xml = FileUtils.readFileUsingGetResources("/pms.xml")
        every { connectorService.pms() } returns xml
        val pms = XMLUtils.unmarshal<jaxb.model.Pms>(xml)
        Assertions.assertEquals(4, pms.pm.size)
        Assertions.assertEquals(BigInteger("3409"), pms.pm[0].idelem)
    }
}
