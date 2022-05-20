package com.example.boilerplate.data.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.boilerplate.data.local.room.daos.DummyDao
import com.example.boilerplate.data.remote.dtos.DummyDto

@Database(
    entities = [DummyDto::class], version = 1, exportSchema = false
)


abstract class AppDatabase : RoomDatabase() {

    abstract fun dummyDao(): DummyDao
}