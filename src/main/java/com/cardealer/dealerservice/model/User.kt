package com.cardealer.dealerservice.model

import jakarta.persistence.*
import java.util.Date

@Entity
data class User @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    @Column(nullable = false, length = 50)
    val name: String,

    @Column(nullable = false, unique = true, length = 50)
    val email: String,

    @Column(nullable = true, length = 20)
    val phoneNumber: String?,

    @Column(nullable = true, length = 255)
    val address: String?,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val role: Role,

    @Temporal(TemporalType.TIMESTAMP)
    val registrationDate: Date = Date()
)