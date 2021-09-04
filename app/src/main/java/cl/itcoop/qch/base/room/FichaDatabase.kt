package cl.itcoop.qch.base.room

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room


@Database(entities = [Ficha::class ], version = 1)
abstract class FichaDatabase : RoomDatabase() {
    abstract fun fichaDao(): FichaDAO
    companion object {
        @Volatile
        private var INSTANCE: FichaDatabase? = null
        fun getDatabase(context: Context): FichaDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                  context.applicationContext,
                    FichaDatabase::class.java,
                    "ficha_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
