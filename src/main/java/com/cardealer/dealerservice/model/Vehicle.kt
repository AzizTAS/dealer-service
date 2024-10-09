package com.cardealer.dealerservice.model

import jakarta.persistence.*

@Entity
data class Vehicle @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    @Column(nullable = false, length = 50)
    val make: String,

    @Column(nullable = false, length = 50)
    val model: String,

    @Column(nullable = false)
    val year: Int,

    @Column(nullable = false, length = 30)
    val color: String,

    @Column(nullable = false)
    val mileage: Int,

    @Column(nullable = false, length = 50)
    val vehicleType: String,

    @Column(nullable = false, length = 50)
    val engineType: String,

    @Column(nullable = true, length = 500)
    val description: String?,

    @Column(nullable = false)
    val status: String,

    @OneToOne
    @JoinColumn(name = "advertisement_id", nullable = true) // Ilan ile ilişki
    val advertisement: Advertisement? = null,

    @ManyToOne
    @JoinColumn(name = "garage_id", nullable = true) // Garaj ile ilişki
    val garage: Garage? = null
)
