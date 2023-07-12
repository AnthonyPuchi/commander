package com.example.commander.controller

import com.example.commander.model.DetailView
import com.example.commander.model.SaucerProteins
import com.example.commander.model.SaucerProteinsView
import com.example.commander.service.SaucerProteinsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/saucerProteins")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class SaucerProteinsController {
    @Autowired
    lateinit var saucerProteinsService: SaucerProteinsService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(saucerProteinsService.list(), HttpStatus.OK)
    }

    @GetMapping("/saucer-proteins")
    fun listSaucerProteins ():List<SaucerProteinsView>{
        return  saucerProteinsService.listSaucerProteins()
    }

    @PostMapping
    fun save (@RequestBody @Validated saucerProteins: SaucerProteins): ResponseEntity<SaucerProteins> {
        return ResponseEntity(saucerProteinsService.save(saucerProteins), HttpStatus.OK)
    }
}