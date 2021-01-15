package uk.gov.justice.hmpps.dynamicframeworkproviders.repositories

import org.springframework.data.repository.CrudRepository
import uk.gov.justice.hmpps.dynamicframeworkproviders.models.Provider
import java.util.UUID

interface ProviderRepository : CrudRepository<Provider, UUID>
