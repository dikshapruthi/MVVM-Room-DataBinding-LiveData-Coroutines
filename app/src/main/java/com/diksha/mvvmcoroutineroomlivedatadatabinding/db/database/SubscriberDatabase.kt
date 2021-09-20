package com.diksha.mvvmcoroutineroomlivedatadatabinding.db.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.diksha.mvvmcoroutineroomlivedatadatabinding.db.entity.Subscriber

@Database(entities = [Subscriber::class], exportSchema = false, version = 1)
abstract class SubscriberDatabase: RoomDatabase() {

    companion object {
        const val dbName = "subscriber_database"

        @Volatile
        private var instance: SubscriberDatabase? = null

        fun getInstance(context: Context): SubscriberDatabase {
            synchronized(this) {
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        SubscriberDatabase::class.java,
                        dbName
                    ).build()
                }
            }
            return instance!!
        }
    }
}