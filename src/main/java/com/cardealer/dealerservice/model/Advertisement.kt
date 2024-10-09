package com.cardealer.dealerservice.model

import jakarta.persistence.*
import java.util.Date

@Entity
data class Advertisement @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    @Column(nullable = false, length = 100)
    val title: String,

    @Column(nullable = false, length = 500)
    val description: String,

    @OneToOne(mappedBy = "advertisement")
    val vehicle: Vehicle,

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @Column(nullable = false)
    val price: Double,

    @Temporal(TemporalType.DATE)
    val postedDate: Date,

    @Temporal(TemporalType.DATE)
    val expirationDate: Date,

    @Column(nullable = false)
    val status: String
)
