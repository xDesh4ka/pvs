package application.controller

import application.repos.RecordsRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
open class MainController {
    @Autowired
    private lateinit var recordsRepo : RecordsRepo


    @GetMapping("/")
    fun mainPage(model : MutableMap<String, Any>) : String
    {
        val records = recordsRepo.findAll()
        model["records"] = records
        return "MainPage"
    }
}