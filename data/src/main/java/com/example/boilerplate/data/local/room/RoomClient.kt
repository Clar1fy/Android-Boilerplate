package com.example.boilerplate.data.local.room

import android.content.Context
import androidx.room.Room
import com.example.boilerplate.data.local.room.daos.DummyDao
import com.example.boilerplate.data.local.room.database.AppDatabase

class RoomClient {

    fun provideRoomDatabase(context: Context) =
        Room.databaseBuilder(context, AppDatabase::class.java, "database")
            .fallbackToDestructiveMigration().build()

    fun provideCharacterDao(appDatabase: AppDatabase): DummyDao =
        appDatabase.dummyDao()
}