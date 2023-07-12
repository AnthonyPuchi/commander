package com.example.commander.controller

import com.example.commander.model.Detail
import com.example.commander.model.DetailView
import com.example.commander.service.DetailService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/detail")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class DetailController {
    @Autowired
    lateinit var detailService: DetailService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(detailService.list(), HttpStatus.OK)
    }

    @GetMapping("/detail-petition-saucer")
    fun listDetailPetitionSaucer ():List<DetailView>{
        return  detailService.listDetailPetitionSaucer()
    }

    @PostMapping
    fun save (@RequestBody @Validated detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.save(detail), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody detail: Detail): ResponseEntity<Detail> {
        return ResponseEntity(detailService.update(detail), HttpStatus.OK)
    }
}