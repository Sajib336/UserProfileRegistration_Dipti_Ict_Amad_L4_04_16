package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.View_Dipti_Ict_Amad_L4_04_16

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.R

class SingleProfileActivity_Dipti_Ict_Amad_L4_04_16 :  AppCompatActivity() {
    private lateinit var argentinaProfile: Profile_Dipti_Ict_Amad_L4_04_16
    private lateinit var nameTextView: TextView
    private lateinit var emailTextView: TextView
    private lateinit var dobTextView: TextView
    private lateinit var districtTextView: TextView
    private lateinit var mobileTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_profile_dipti_ict_amad_l4_04_16)
        argentinaProfile = intent.getSerializableExtra("USER_PROFILE") as Profile_Dipti_Ict_Amad_L4_04_16

        nameTextView = findViewById(R.id.nameTextView)
        emailTextView = findViewById(R.id.emailTextView)
        dobTextView = findViewById(R.id.dobTextView)
        districtTextView = findViewById(R.id.districtTextView)
        mobileTextView = findViewById(R.id.mobileTextView)

        populateFields()
    }

    private fun populateFields() {
        nameTextView.text = argentinaProfile.name
        emailTextView.text = argentinaProfile.email
        dobTextView.text = argentinaProfile.dob
        districtTextView.text = argentinaProfile.district
        mobileTextView.text = argentinaProfile.mobile
    }
}