package uk.gov.justice.hmpps.interventionsonboarding.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import uk.gov.justice.hmpps.interventionsonboarding.services.Providers

@Controller
class PageController {
    @Autowired
    lateinit var providers: Providers

    @GetMapping("/")
    fun main(@Autowired model: Model): String {
        model.addAttribute("providers", providers.all())
        return "page"
    }
}
