package com.cardealer.dealerservice.dto

import com.cardealer.dealerservice.model.Advertisement
import java.util.*

data class AdvertisementDto(
    val id: String,
    val title: String,
    val description: String,
    val postedDate: Date,
    val expirationDate: Date,
    val price: Double,
    val status: String,
    val vehicle: VehicleDto
) {
    companion object {
        @JvmStatic
        fun convert(advertisement: Advertisement): AdvertisementDto {
            return AdvertisementDto(
                id = advertisement.id ?: "",
                title = advertisement.title,
                description = advertisement.description,
                postedDate = advertisement.postedDate,
                expirationDate = advertisement.expirationDate,
                price = advertisement.price,
                status = advertisement.status,
                vehicle = VehicleDto.convert(advertisement.vehicle)
            )
        }
    }
}

