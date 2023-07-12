package com.example.commander.service

import com.example.commander.model.Proteins
import com.example.commander.repository.ProteinsRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class ProteinsService {
    @Autowired
    lateinit var proteinsRepository: ProteinsRepository

    fun list(): List<Proteins> {
        return proteinsRepository.findAll()
    }

    fun save(proteins: Proteins):  Proteins? {
        return proteinsRepository.save(proteins)
    }

    fun update(proteins: Proteins): Proteins {
        try {
            proteinsRepository.findById(proteins.id)
                    ?: throw Exception("ID no existe")

            return proteinsRepository.save(proteins)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}