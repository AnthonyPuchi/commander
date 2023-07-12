package com.example.commander.model

import jakarta.persistence.*

@Entity
@Table(name="detail")

class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name= "petition_id")
    var petitionId: Long? = null
    @Column(name= "saucer_id")
    var saucerId: Long? = null
    var quantity: Int? = null
    var price: Double? = null
}