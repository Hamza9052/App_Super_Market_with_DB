package com.example.fastfood

import android.app.Application
import com.example.fastfood.Graph

class JetShoppingApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this)
    }

}