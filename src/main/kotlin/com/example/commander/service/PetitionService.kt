package com.example.commander.service

import com.example.commander.model.Petition
import com.example.commander.repository.ClientRepository
import com.example.commander.repository.PetitionRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service

class PetitionService {
    @Autowired
    lateinit var petitionRepository: PetitionRepository
    @Autowired
    lateinit var clientRepository: ClientRepository

    fun list(): List<Petition> {
        return petitionRepository.findAll()
    }

    fun save(petition: Petition):  Petition? {
        return petitionRepository.save(petition)
    }

    fun update(petition: Petition): Petition {
        try {
            petitionRepository.findById(petition.id)
                    ?: throw Exception("ID no existe")

            return petitionRepository.save(petition)
        } catch (ex: Exception) {
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }
}