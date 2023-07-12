package com.example.commander.model

import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalTime

@Entity
@Table(name = "saucer")

class Saucer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var name: String? = null
    var category: String? = null
    @Column(name= "price")
    var price: BigDecimal? = null
    var preparation: String? = null
}