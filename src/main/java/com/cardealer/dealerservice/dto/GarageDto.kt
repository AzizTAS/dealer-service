package com.cardealer.dealerservice.dto

import com.cardealer.dealerservice.model.Garage

data class GarageDto(
    val id: String,
    val name: String,
    val ownerName: String,
    val vehicles: List<VehicleDto>
) {
    companion object {
        @JvmStatic
        fun convert(garage: Garage): GarageDto {
            return GarageDto(
                id = garage.id ?: "",
                name = garage.name,
                ownerName = garage.owner.name,
                vehicles = garage.vehicles.map(VehicleDto::convert)
            )
        }
    }
}

