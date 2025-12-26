package com.riakol.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.riakol.domain.model.MuscleGroup

@Entity(tableName = "exercises")
data class ExerciseEntity(
    @PrimaryKey(autoGenerate = true) val exerciseId: Long = 0,
    val name: String,
    val category: MuscleGroup,
)