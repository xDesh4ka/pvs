package application.controller

import application.model.Record
import application.repos.RecordsRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam


@Controller
open class AddController {
    @Autowired
    private lateinit var recordsRepo : RecordsRepo

    @GetMapping("/add_record")
    fun view(model : MutableMap<String, Any>) : String
    {
        return "addPage"
    }

    @PostMapping("/add_record")
    fun addRecord(@RequestParam firstName : String,
                  @RequestParam secondName : String,
                  @RequestParam patronymic : String,
                  @RequestParam subject : String,
                  @RequestParam squad : String,
                  @RequestParam time : String
    ) : String
    {
        val record : Record = Record(firstName, secondName, patronymic, squad, subject, time)
        recordsRepo.save(record)
        return "redirect:/"
    }
}

