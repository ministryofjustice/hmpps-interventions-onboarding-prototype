package uk.gov.justice.hmpps.dynamicframeworkproviders

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DynamicFrameworkProvidersApplication

fun main(args: Array<String>) {
    runApplication<DynamicFrameworkProvidersApplication>(*args)
}
