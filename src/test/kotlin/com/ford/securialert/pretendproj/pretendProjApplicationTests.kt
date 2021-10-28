package com.ford.securialert.pretendproj;

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.fail
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class pretendProjApplicationTests {

    @Test
    fun contextLoads() {
        try {
        } catch (exception: Exception) {
            fail("Spring Boot container failed to boot up...")
        }
    }
}
