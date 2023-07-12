package com.example.commander.model

import jakarta.persistence.*

@Entity
@Table(name = "saucerProteins")

class SaucerProteins {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "saucer_id", updatable = false)
    var saucerId: Long? = null
    @Column(name= "proteins_id")
    var proteinsId: Long? = null
}