package com.example.commander.controller

import com.example.commander.model.Petition
import com.example.commander.service.PetitionService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/petition")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class PetitionController {
    @Autowired
    lateinit var petitionService: PetitionService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(petitionService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated petition: Petition): ResponseEntity<Petition> {
        return ResponseEntity(petitionService.save(petition), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody petition: Petition): ResponseEntity<Petition> {
        return ResponseEntity(petitionService.update(petition), HttpStatus.OK)
    }
}