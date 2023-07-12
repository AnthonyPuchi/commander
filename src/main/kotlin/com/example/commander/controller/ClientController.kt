package com.example.commander.controller

import com.example.commander.model.Client
import com.example.commander.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/client")
@CrossOrigin(methods = [RequestMethod.GET, RequestMethod.POST, RequestMethod.PATCH, RequestMethod.PUT, RequestMethod.DELETE])
class ClientController {
    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list (): ResponseEntity<*> {
        return ResponseEntity(clientService.list(), HttpStatus.OK)
    }

    @PostMapping
    fun save (@RequestBody @Validated client: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.save(client), HttpStatus.OK)
    }

    @PutMapping
    fun update (@RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.update(client), HttpStatus.OK)
    }

    @PatchMapping
    fun updateName (@RequestBody client: Client): ResponseEntity<Client> {
        return ResponseEntity(clientService.updateName(client), HttpStatus.OK)
    }
}