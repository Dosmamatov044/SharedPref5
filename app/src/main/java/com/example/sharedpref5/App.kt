package com.example.sharedpref5

import android.app.Application
import android.content.Context
import android.content.SharedPreferences

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        sharedPrefernces=  getSharedPreferences(Constants.PREFERENCES_IS_FIRST_NAME, Context.MODE_PRIVATE)
        editor=sharedPrefernces.edit()








    }



    companion object{
        lateinit var sharedPrefernces: SharedPreferences
        var editor:SharedPreferences.Editor?=null


    }

}