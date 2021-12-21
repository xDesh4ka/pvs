package application.repos

import application.model.Record
import org.springframework.data.repository.CrudRepository

interface RecordsRepo : CrudRepository<Record, Long> {
    fun findBySquad(squad: String?): List<Record>
}