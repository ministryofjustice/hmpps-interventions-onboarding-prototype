package uk.gov.justice.hmpps.dynamicframeworkproviders.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uk.gov.justice.hmpps.dynamicframeworkproviders.models.Provider
import uk.gov.justice.hmpps.dynamicframeworkproviders.repositories.ProviderRepository

@Service
class Providers(@Autowired val repository: ProviderRepository) {
    fun all(): Iterable<Provider> {
        return repository.findAll()
    }
}
