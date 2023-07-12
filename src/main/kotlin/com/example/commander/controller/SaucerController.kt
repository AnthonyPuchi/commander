package com.example.commander.controller

import com.example.commander.model.Saucer
import com.example.commander.service.SaucerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/saucer")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class SaucerController {
    @Autowired
    lateinit var saucerService: SaucerService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(saucerService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated saucer: Saucer): ResponseEntity<Saucer> {
        return ResponseEntity(saucerService.save(saucer), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody saucer: Saucer): ResponseEntity<Saucer> {
        return ResponseEntity(saucerService.update(saucer), HttpStatus.OK)
    }
}