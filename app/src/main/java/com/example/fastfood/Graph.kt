package com.example.fastfood

import android.content.Context
import com.example.fastfood.data.room.ShoppingListDatabase
import com.example.fastfood.ui.repositor.Repository

object Graph {

    lateinit var db:ShoppingListDatabase
        private set

    val repository by lazy {
        Repository(
            itemDao = db.itemDao(),
            listDao = db.listDao(),
            storeDao = db.storeDao()
        )
    }

    fun provide(context:Context){
        db = ShoppingListDatabase.getDatabase(context)
    }

}