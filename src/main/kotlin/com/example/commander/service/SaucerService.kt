package com.example.commander.service

import com.example.commander.model.Saucer
import com.example.commander.repository.SaucerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class SaucerService {
    @Autowired
    lateinit var saucerRepository: SaucerRepository

    fun list(): List<Saucer> {
        return saucerRepository.findAll()
    }

    fun save(saucer: Saucer):  Saucer? {
        return saucerRepository.save(saucer)
    }

    fun update(saucer: Saucer): Saucer {
        try {
            saucerRepository.findById(saucer.id)
                    ?: throw Exception("ID no existe")

            return saucerRepository.save(saucer)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}