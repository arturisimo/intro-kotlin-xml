package edu.app.kotlin.controller

import io.restassured.RestAssured
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort
import io.restassured.RestAssured.`when`


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ApiControllerTest() {

    @LocalServerPort
    var port = 0

    @BeforeEach
    fun setUp() {
        RestAssured.port = port
    }

    @Test
    fun testDomParse() {
        `when`()
            .get("/pms/dom")
        .then()
            .statusCode(200)
    }


    @Test
    fun testJaxbParse() {
        `when`()
            .get("/pms")
            .then()
            .statusCode(200)
    }


}
