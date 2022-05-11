package uk.gov.justice.hmpps.interventionsonboarding.repositories

import org.springframework.data.repository.CrudRepository
import uk.gov.justice.hmpps.interventionsonboarding.models.Provider
import java.util.UUID

interface ProviderRepository : CrudRepository<Provider, UUID>
