package com.swapnil.sendmail

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.myairmed.sendmail.SendMail

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mail = SendMail(
            "dev.airmedsolutions@gmail.com",
            "My@irm3dg",
            "ganpatmalekar@gmail.com",
            "MyAirmed Doctor's Appointment",
            "Email Body"
        )
        mail.execute()

        Toast.makeText(this, "Mail sent success...", Toast.LENGTH_SHORT).show()
    }
}