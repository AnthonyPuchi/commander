package com.example.commander.controller

import com.example.commander.model.Proteins
import com.example.commander.service.ProteinsService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/proteins")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ProteinsController {
    @Autowired
    lateinit var proteinsService: ProteinsService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(proteinsService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated proteins: Proteins): ResponseEntity<Proteins> {
        return ResponseEntity(proteinsService.save(proteins), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody proteins: Proteins): ResponseEntity<Proteins> {
        return ResponseEntity(proteinsService.update(proteins), HttpStatus.OK)
    }
}