package cl.itcoop.qch.base.room

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room

// import androidx.sqlite.db.SupportSQLiteDatabase
// import kotlinx.coroutines.CoroutineScope
// import kotlinx.coroutines.Dispatchers
// import kotlinx.coroutines.launch


@Database(entities = [Ficha::class, Usuario::class,Genero::class], version = 1)
abstract class FichaRoomDatabase : RoomDatabase() {
    abstract fun fichaDao(): FichaDAO
    companion object {
        @Volatile
        private var INSTANCE: FichaRoomDatabase? = null
        fun getDatabase(
            context: Context,
          //  scope: CoroutineScope
        ): FichaRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    FichaRoomDatabase::class.java,
                    "ficha_database"
                )
                    .fallbackToDestructiveMigration()
                    .build()
                INSTANCE = instance
                instance
            }
        }
   }
}

