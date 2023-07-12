package com.example.commander.model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "proteins")

class Proteins {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name: String? = null
    var quantity: String? = null
}