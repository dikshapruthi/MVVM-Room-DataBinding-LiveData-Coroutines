package com.diksha.mvvmcoroutineroomlivedatadatabinding.db.dao

import androidx.room.Dao
import androidx.room.Insert
import com.diksha.mvvmcoroutineroomlivedatadatabinding.db.entity.Subscriber

@Dao
interface SubscriberDao {

    @Insert
    fun insertSubscriber(subscriber: Subscriber): Long

    @Insert
    fun insertSubscriber(subscriber1: Subscriber, subscriber2: Subscriber): Long

    @Insert
    fun insertSubscriber(subscriber: List<Subscriber>): List<Long>

    @Insert
    fun insertSubscriber(subscriber1: Subscriber, subscriber2: List<Subscriber>): List<Long>

}