package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.View_Dipti_Ict_Amad_L4_04_16

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.R
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.ViewModel_Dipti_Ict_Amad_L4_04_16.ProfileViewActivity_Dipti_Ict_Amad_L4_04_16

class AddProfileActivity_Dipti_Ict_Amad_L4_04_16 : AppCompatActivity() {
    private lateinit var profileViewActivity_Dipti_Ict_Amad_L4_04_16: ProfileViewActivity_Dipti_Ict_Amad_L4_04_16
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_profile_dipti_ict_amad_l4_04_16)

        profileViewActivity_Dipti_Ict_Amad_L4_04_16 = ViewModelProvider(this).get(ProfileViewActivity_Dipti_Ict_Amad_L4_04_16::class.java)

        val nameEditText = findViewById<EditText>(R.id.profileNameEt)
        val emailEditText = findViewById<EditText>(R.id.profileEmailEt)
        val dobEditText = findViewById<EditText>(R.id.profileDOBEt)
        val districtEditText = findViewById<EditText>(R.id.profileDistrictEt)
        val mobileEditText = findViewById<EditText>(R.id.profilemobileEt)

        findViewById<Button>(R.id.addBtn).setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val dob = dobEditText.text.toString()
            val district = districtEditText.text.toString()
            val mobile = mobileEditText.text.toString()

            val userProfile = Profile_Dipti_Ict_Amad_L4_04_16(name = name, email = email, dob = dob, district = district, mobile = mobile)
            profileViewActivity_Dipti_Ict_Amad_L4_04_16.insertUserProfile(userProfile)

            finish()
        }
    }
}