package com.example.commander.repository

import com.example.commander.model.SaucerProteins
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface SaucerProteinsRepository: JpaRepository<SaucerProteins, Long> {
    fun findById(id: Long?): SaucerProteins?
}