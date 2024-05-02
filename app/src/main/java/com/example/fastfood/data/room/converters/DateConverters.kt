package com.example.fastfood.data.room.converters

import androidx.room.TypeConverter
import java.util.Date

open class DateConverters{

    @TypeConverter
    fun toDate(date:Long?): Date? {
        return date?.let { Date(it) }
    }

    @TypeConverter
    fun fromDate(date:Date?):Long?{
        return date?.time
    }

}