package com.example.commander.model

import jakarta.persistence.*
import java.util.Date

@Entity
@Table(name="petition")
class Petition {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    @Column(name= "client_id")
    var clientId: Long? = null
    @Column(name= "commander_id")
    var commanderId: Long? = null
    @Column(name= "petition_date")
    var petitionDate: Date? = null
    var total: Double? = null
}