package com.example.commander.repository

import com.example.commander.model.Petition
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface PetitionRepository: JpaRepository<Petition, Long> {
    fun findById(id: Long?): Petition?
}