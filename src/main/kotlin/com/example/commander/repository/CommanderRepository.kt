package com.example.commander.repository

import com.example.commander.model.Commander
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommanderRepository: JpaRepository<Commander, Long> {
    fun findById(id: Long?): Commander?
}