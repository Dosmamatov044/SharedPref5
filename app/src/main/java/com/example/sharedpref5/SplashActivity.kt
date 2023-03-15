package com.example.sharedpref5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpref5.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.okBtn.setOnClickListener {

           App.editor?.putBoolean(Constants.IS_FIRST_RUN_TEXT,true)
            App.editor?.apply()

           val intent= Intent(this,MainActivity::class.java)
           startActivity(intent)



       }
        if (App. sharedPrefernces.getBoolean(Constants.IS_FIRST_RUN_TEXT,false)){

            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)


        }



    }
}