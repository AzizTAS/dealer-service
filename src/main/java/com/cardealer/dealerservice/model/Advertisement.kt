package com.cardealer.dealerservice.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id


@Entity
data class Advertisement @JvmOverloads constructor(
    @Id
    @GeneratedValue(generator = "org.hibernate.id.UUIDGenerator")
    val id: String? = "",
    val title: String,
    val description: String,
    val vehicle: Vehicle


)
