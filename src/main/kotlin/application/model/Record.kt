package application.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="records")
class Record {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Long? = null
    var firstName : String? = null
    var secondName : String? = null
    var patronymic : String? = null
    var squad : String? = null
    var subject : String? = null
    var time : String? = null

    constructor() {}
    constructor(firstName : String, secondName : String, patronymic : String, squad : String, subject : String, time : String) {
        this.firstName = firstName
        this.secondName = secondName
        this.patronymic = patronymic
        this.squad = squad
        this.subject = subject
        this.time = time
    }
}