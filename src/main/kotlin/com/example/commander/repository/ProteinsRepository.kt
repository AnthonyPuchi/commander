package com.example.commander.repository

import com.example.commander.model.Proteins
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface ProteinsRepository: JpaRepository<Proteins, Long> {
    fun findById(id: Long?): Proteins?
}