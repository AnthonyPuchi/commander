package com.example.commander.service

import com.example.commander.model.Commander
import com.example.commander.repository.CommanderRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class CommanderService {
    @Autowired
    lateinit var commanderRepository: CommanderRepository

    fun list(): List<Commander> {
        return commanderRepository.findAll()
    }

    fun save(commander: Commander):  Commander? {
        return commanderRepository.save(commander)
    }

    fun update(commander: Commander): Commander {
        try {
            commanderRepository.findById(commander.id)
                    ?: throw Exception("ID no existe")

            return commanderRepository.save(commander)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun updateName(commander: Commander): Commander {
        try {
            val response = commanderRepository.findById(commander.id)
                    ?: throw Exception("ID no existe")
            response.apply {
                fullname = commander.fullname
            }
            return commanderRepository.save(response)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}