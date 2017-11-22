package de.bowstreet.testandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.microsoft.azure.mobile.MobileCenter
import com.microsoft.azure.mobile.analytics.Analytics
import com.microsoft.azure.mobile.crashes.Crashes

class MainActivity : AppCompatActivity() {

    private var mButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MobileCenter.start(application, "675da273-5716-4855-9dd0-431fe51ebfef", Analytics::class.java, Crashes::class.java)


        mButton = findViewById<View>(R.id.button) as Button
        mButton!!.setOnClickListener { throw RuntimeException("Test exception") }
    }
}
