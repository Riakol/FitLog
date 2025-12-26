package com.riakol.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.riakol.data.local.converters.MuscleGroupConverter
import com.riakol.data.local.dao.ExerciseDao
import com.riakol.data.local.entity.ExerciseEntity

@Database(
    entities = [ExerciseEntity::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(MuscleGroupConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun exerciseDao(): ExerciseDao

    companion object {
        private const val DATABASE_NAME = "workout_db"

        fun build(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context,
                AppDatabase::class.java,
                DATABASE_NAME
            )
                .createFromAsset("exercises.db")
                .build()
        }
    }
}
