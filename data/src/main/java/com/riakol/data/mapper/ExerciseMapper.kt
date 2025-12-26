package com.riakol.data.mapper

import com.riakol.data.local.entity.ExerciseEntity
import com.riakol.domain.model.ExerciseDomain

fun ExerciseEntity.toDomain(): ExerciseDomain {
    return ExerciseDomain(
        exerciseId = this.exerciseId,
        name = this.name,
        category = this.category
    )
}