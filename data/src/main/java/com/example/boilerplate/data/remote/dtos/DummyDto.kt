package com.example.boilerplate.data.remote.dtos

import androidx.room.Entity
import com.example.boilerplate.domain.models.DummyModel
import com.google.gson.annotations.SerializedName

@Entity
data class DummyDto(
    @SerializedName("id")
    val id: Any
)

fun DummyDto.toDomain() = DummyModel(id)