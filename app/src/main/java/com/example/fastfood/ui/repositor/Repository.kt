package com.example.fastfood.ui.repositor

import com.example.fastfood.data.room.ItemDao
import com.example.fastfood.data.room.ListDao
import com.example.fastfood.data.room.StoreDao
import com.example.fastfood.data.room.models.Item
import com.example.fastfood.data.room.models.ShoppingList
import com.example.fastfood.data.room.models.Store

class Repository(
    private val listDao: ListDao,
    private val itemDao: ItemDao,
    private val storeDao: StoreDao
) {
    val store = storeDao.getAllStores()
    val getItemsWithListAndStore = listDao.getItemsWithStoreAndList()

    fun getItemWithStoreAndList(id: Int) = listDao
        .getItemWithStoreAndListFilterById(id)

    fun getItemWithStoreAndListFilteredById(id:Int) =
        listDao.getItemsWithStoreAndListFilterById(id)

    suspend fun insertList(shoppingList: ShoppingList){
        listDao.insertShoppingList(shoppingList)
    }

    suspend fun insertStore(store: Store){
        storeDao.insert(store)
    }

    suspend fun insertItem(item: Item){
        itemDao.insert(item)
    }


    suspend fun deleteIem(item: Item){
        itemDao.delete(item)
    }

    suspend fun updateItem(item: Item){
        itemDao.update(item)
    }

}