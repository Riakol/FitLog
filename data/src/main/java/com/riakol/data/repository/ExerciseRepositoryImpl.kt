package com.riakol.data.repository

import com.riakol.data.local.dao.ExerciseDao
import com.riakol.data.mapper.toDomain
import com.riakol.domain.model.ExerciseDomain
import com.riakol.domain.repository.ExerciseRepository
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class ExerciseRepositoryImpl @Inject constructor(
    private val exerciseDao: ExerciseDao,

    ) : ExerciseRepository {
    override fun getExercises(): Flow<List<ExerciseDomain>> {
        return exerciseDao.getAllExercises().map { entities ->
            entities.map { it.toDomain() }
        }
    }
}