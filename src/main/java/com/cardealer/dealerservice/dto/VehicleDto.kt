package com.cardealer.dealerservice.dto

import com.cardealer.dealerservice.model.Vehicle

data class VehicleDto(
    val id: String,
    val make: String,
    val model: String,
    val year: Int,
    val color: String,
    val mileage: Int,
    val vehicleType: String,
    val engineType: String,
    val status: String,
    val description: String? = null
) {
    companion object {
        @JvmStatic
        fun convert(vehicle: Vehicle): VehicleDto {
            return VehicleDto(
                id = vehicle.id ?: "",
                make = vehicle.make,
                model = vehicle.model,
                year = vehicle.year,
                color = vehicle.color,
                mileage = vehicle.mileage,
                vehicleType = vehicle.vehicleType,
                engineType = vehicle.engineType,
                status = vehicle.status,
                description = vehicle.description
            )
        }
    }
}
