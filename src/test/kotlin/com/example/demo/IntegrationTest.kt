package com.example.demo

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.boot.test.web.client.getForEntity
import org.springframework.http.HttpStatus
import java.net.http.HttpClient

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class IntegrationTest(@Autowired val restTemplate: TestRestTemplate) {

    @BeforeAll
    fun testSetUp() {
        println("Test Setup")
    }

    @Test
    fun `Testing book endPoints`() {
        val entity = restTemplate.getForEntity<String>("/book")
        Assertions.assertEquals(entity.statusCode, HttpStatus.OK)
    }
}