package `in`.mlevsh.gradlemonorepo.first.domain

import `in`.mlevsh.gradlemonorepo.domain.Domain
import java.time.LocalDateTime
import java.util.*

class TestDomain(
    override val id: UUID,
    override val createdDate: LocalDateTime,
    override val updatedDate: LocalDateTime
) : Domain<UUID>