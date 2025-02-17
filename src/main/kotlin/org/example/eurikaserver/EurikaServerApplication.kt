package org.example.eurikaserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurikaServerApplication

fun main(args: Array<String>) {
    runApplication<EurikaServerApplication>(*args)
}
