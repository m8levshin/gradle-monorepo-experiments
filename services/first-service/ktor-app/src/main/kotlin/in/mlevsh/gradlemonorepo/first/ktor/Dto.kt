import `in`.mlevsh.gradlemonorepo.common.serdes.LocalDateSerDes
import `in`.mlevsh.gradlemonorepo.common.serdes.UUIDSerDes
import `in`.mlevsh.gradlemonorepo.first.domain.TestDomain
import kotlinx.serialization.Serializable
import java.time.LocalDate
import java.util.*

@Serializable
data class TestDomainDto(
    @Serializable(with = UUIDSerDes::class) val id: UUID,
    @Serializable(with = LocalDateSerDes::class) val createdDate: LocalDate
)

fun TestDomain.mapToDto() = TestDomainDto(id, createdDate.toLocalDate())