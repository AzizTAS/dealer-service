package com.cardealer.dealerservice.model

import jakarta.persistence.*
import java.util.Date

@Entity
data class Photos @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    @Column(nullable = false)
    val path: String,

    @Column(nullable = true, length = 255)
    val description: String?,

    @Temporal(TemporalType.TIMESTAMP)
    val uploadDate: Date = Date(),

    @Column(nullable = true)
    val userId: String?
)