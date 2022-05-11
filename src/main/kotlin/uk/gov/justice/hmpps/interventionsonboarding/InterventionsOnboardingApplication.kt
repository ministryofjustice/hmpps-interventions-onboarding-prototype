package uk.gov.justice.hmpps.interventionsonboarding

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DynamicFrameworkProvidersApplication

fun main(args: Array<String>) {
    runApplication<DynamicFrameworkProvidersApplication>(*args)
}
