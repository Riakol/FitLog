package com.riakol.domain.repository

import com.riakol.domain.model.ExerciseDomain
import kotlinx.coroutines.flow.Flow

interface ExerciseRepository {
    fun getExercises(): Flow<List<ExerciseDomain>>
}