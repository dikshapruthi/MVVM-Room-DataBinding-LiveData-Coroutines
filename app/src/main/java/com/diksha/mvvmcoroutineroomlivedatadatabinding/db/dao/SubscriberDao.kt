package com.diksha.mvvmcoroutineroomlivedatadatabinding.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.diksha.mvvmcoroutineroomlivedatadatabinding.db.entity.Subscriber

@Dao
interface SubscriberDao {

    @Insert
    fun insertSubscriber(subscriber: Subscriber)

    @Update
    fun updateSubscriber(subscriber: Subscriber)

    @Delete
    fun deleteSubscriber(subscriber: Subscriber)

    @Query("DELETE FROM subscriber_table")
    fun deleteApp()

    @Query("SELECT * FROM subscriber_table")
    fun getAllSubscriber(): LiveData<List<Subscriber>>

}