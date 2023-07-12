package com.example.commander.service

import com.example.commander.model.SaucerProteins
import com.example.commander.model.SaucerProteinsView
import com.example.commander.repository.SaucerProteinsRepository
import com.example.commander.repository.SaucerProteinsViewRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service

class SaucerProteinsService {
    @Autowired
    lateinit var saucerProteinsRepository: SaucerProteinsRepository

    @Autowired
    lateinit var saucerProteinsViewRepository: SaucerProteinsViewRepository

    fun list(): List<SaucerProteins> {
        return saucerProteinsRepository.findAll()
    }

    fun listSaucerProteins (): List<SaucerProteinsView>{
        return saucerProteinsViewRepository.findAll()
    }

    fun save(saucerProteins: SaucerProteins):  SaucerProteins? {
        return saucerProteinsRepository.save(saucerProteins)
    }
}