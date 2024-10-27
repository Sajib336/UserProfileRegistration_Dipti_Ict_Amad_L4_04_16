package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.View_Dipti_Ict_Amad_L4_04_16

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.R

class MainActivity_Dipti_Ict_Amad_L4_04_16  : AppCompatActivity() {
    private lateinit var listButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_dipti_ict_amad_l4_04_16)

        listButton = findViewById(R.id.profileListBtn)

        listButton.setOnClickListener {
            // Start LoadingActivity instead of ProfileListActivity
            val intent = Intent(this,LoadingActivity_Dipti_Ict_Amad_L4_04_16::class.java)
            intent.putExtra("TARGET_ACTIVITY", "com.example.userprofileregistration_dipti_ict_amad_l4_04_16.View_Dipti_Ict_Amad_L4_04_16.ProfileListActivity_Dipti_Ict_Amad_L4_04_16")
            startActivity(intent)
            finish() // Finish MainActivity24 so the user can't return to it
        }


    }


}