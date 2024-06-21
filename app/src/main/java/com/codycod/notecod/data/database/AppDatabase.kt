package com.codycod.notecod.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.codycod.notecod.data.dao.NotaDao
import com.codycod.notecod.data.models.MdNote

@Database(entities = [MdNote::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun notaDao(): NotaDao

    companion object {
        private const val DATABASE_NAME = "NOTES_DB"

        @Volatile
        private var instanceDb: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            instanceDb ?: synchronized(this) {
                instanceDb ?: buildDatabase(context).also {
                    instanceDb = it
                }
            }


        private fun buildDatabase(context: Context): AppDatabase =
            Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DATABASE_NAME
            ).build()

    }

}