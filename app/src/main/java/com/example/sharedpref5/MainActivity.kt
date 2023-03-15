package com.example.sharedpref5

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpref5.databinding.ActivityMainBinding




//Создай 4 фрагмента и без использования navigation component сделать переход между ними
//Для перехода изучить bundle но для назад не использовать bundle
//обезьятельно должен быть back stack




class MainActivity : AppCompatActivity() {

lateinit var sharedPrefernces:SharedPreferences

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





      sharedPrefernces=  getSharedPreferences(Constants.PREFERENCES_TEXT_NAME,Context.MODE_PRIVATE)



        val editor=sharedPrefernces.edit()


        binding.txt.text=sharedPrefernces.getString(Constants.TEXT_KEY,"null")

        binding.btn.setOnClickListener {
            val text=binding.edit.text.toString()


            editor.putString(Constants.TEXT_KEY,text)
             editor.apply()


            binding.txt.text=text


        }








    }
}