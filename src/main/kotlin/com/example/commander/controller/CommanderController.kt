package com.example.commander.controller

import com.example.commander.model.Commander
import com.example.commander.service.CommanderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/commander")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class CommanderController {
    @Autowired
    lateinit var commanderService: CommanderService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(commanderService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated commander: Commander): ResponseEntity<Commander> {
        return ResponseEntity(commanderService.save(commander), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody commander: Commander): ResponseEntity<Commander> {
        return ResponseEntity(commanderService.update(commander), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody commander: Commander): ResponseEntity<Commander> {
        return ResponseEntity(commanderService.updateName(commander), HttpStatus.OK)
    }
}