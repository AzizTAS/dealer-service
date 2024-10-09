package com.cardealer.dealerservice.model

import jakarta.persistence.*

@Entity
data class Garage(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = null,

    @Column(nullable = false, length = 75)
    val name: String,

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    val owner: User,

    @OneToMany(mappedBy = "garage")
    val vehicles: List<Vehicle> = ArrayList()
)
