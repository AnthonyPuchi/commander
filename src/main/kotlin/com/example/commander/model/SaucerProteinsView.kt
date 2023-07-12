package com.example.commander.model

import jakarta.persistence.*

@Entity
@Table(name = "saucer_proteins_view")

class SaucerProteinsView {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name= "saucer_id", updatable = false)
    var saucerId: Long? = null
    @Column(name= "proteins_id")
    var proteinsId: Long? = null
    var saucer: String? = null
    var proteins: String? = null
}