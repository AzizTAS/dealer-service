package com.cardealer.dealerservice.model

import jakarta.persistence.*
import java.util.Date

@Entity
data class Logs @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    @Temporal(TemporalType.TIMESTAMP)
    val timestamp: Date = Date(),

    @Column(nullable = false, length = 10)
    val level: String,

    @Column(nullable = false, length = 500)
    val message: String,

    @Column(nullable = true)
    val userId: String?
)