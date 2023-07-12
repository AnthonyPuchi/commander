package com.example.commander.repository

import com.example.commander.model.DetailView
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository

interface DetailViewRepository: JpaRepository<DetailView, Long> {

}