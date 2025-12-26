package com.riakol.domain.model

data class ExerciseDomain(
    val exerciseId: Long = 0,
    val name: String,
    val category: MuscleGroup,
)