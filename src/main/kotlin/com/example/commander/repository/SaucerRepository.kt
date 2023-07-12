package com.example.commander.repository

import com.example.commander.model.Saucer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface SaucerRepository: JpaRepository<Saucer, Long> {
    fun findById(id: Long?): Saucer?
}