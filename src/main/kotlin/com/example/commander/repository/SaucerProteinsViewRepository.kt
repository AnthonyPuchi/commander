package com.example.commander.repository

import com.example.commander.model.SaucerProteinsView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface SaucerProteinsViewRepository: JpaRepository<SaucerProteinsView, Long> {

}