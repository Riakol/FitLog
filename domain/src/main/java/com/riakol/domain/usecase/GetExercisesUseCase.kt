package com.riakol.domain.usecase

import com.riakol.domain.repository.ExerciseRepository
import jakarta.inject.Inject

class GetExercisesUseCase @Inject constructor(
    private val exerciseRepository: ExerciseRepository
) {
    operator fun invoke() = exerciseRepository.getExercises()
}