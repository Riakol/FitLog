package com.riakol.data.local.converters

import androidx.room.TypeConverter
import com.riakol.domain.model.MuscleGroup

class MuscleGroupConverter {
    @TypeConverter
    fun fromMuscleGroup(value: MuscleGroup): String {
        return value.name
    }

    @TypeConverter
    fun toMuscleGroup(value: String): MuscleGroup {
        return MuscleGroup.valueOf(value)
    }
}