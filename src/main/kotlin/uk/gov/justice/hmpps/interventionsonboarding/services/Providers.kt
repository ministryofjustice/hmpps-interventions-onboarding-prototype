package uk.gov.justice.hmpps.interventionsonboarding.services

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import uk.gov.justice.hmpps.interventionsonboarding.models.Provider
import uk.gov.justice.hmpps.interventionsonboarding.repositories.ProviderRepository

@Service
class Providers(@Autowired val repository: ProviderRepository) {
    fun all(): Iterable<Provider> {
        return repository.findAll()
    }
}
