package com.example.boilerplate.data.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.boilerplate.data.remote.dtos.DummyDto

@Dao
interface DummyDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDummy(dummyDto: DummyDto)

    @Query("SELECT * FROM dummydto")
    fun getDummies(): List<DummyDto>
}