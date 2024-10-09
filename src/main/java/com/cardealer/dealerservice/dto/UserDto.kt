package com.cardealer.dealerservice.dto

import com.cardealer.dealerservice.model.Role
import com.cardealer.dealerservice.model.User
import java.util.*

data class UserDto(
    val id: String,
    val name: String,
    val email: String,
    val phoneNumber: String?,
    val address: String?,
    val role: Role, // Role tipinde role bilgisi
    val registrationDate: Date
) {
    companion object {
        @JvmStatic
        fun convert(user: User): UserDto {
            return UserDto(
                id = user.id ?: "",
                name = user.name,
                email = user.email,
                phoneNumber = user.phoneNumber,
                address = user.address,
                role = user.role,
                registrationDate = user.registrationDate
            )
        }
    }
}


