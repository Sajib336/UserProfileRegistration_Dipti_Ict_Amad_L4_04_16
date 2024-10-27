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

class UpdateProfileActivity_Dipti_Ict_Amad_L4_04_16 : AppCompatActivity() {
    private lateinit var profileViewModel24: ProfileViewActivity_Dipti_Ict_Amad_L4_04_16
    private lateinit var profile24: Profile_Dipti_Ict_Amad_L4_04_16

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var dobEditText: EditText
    private lateinit var districtEditText: EditText
    private lateinit var mobileEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_profile_dipti_ict_amad_l4_04_16)

        profileViewModel24 = ViewModelProvider(this).get(ProfileViewActivity_Dipti_Ict_Amad_L4_04_16::class.java)

        profile24 = intent.getSerializableExtra("USER_PROFILE") as Profile_Dipti_Ict_Amad_L4_04_16

        nameEditText = findViewById(R.id.profileNameEt)
        emailEditText = findViewById(R.id.profileEmailEt)
        dobEditText = findViewById(R.id.profileDOBEt)
        districtEditText = findViewById(R.id.profileDistrictEt)
        mobileEditText = findViewById(R.id.profilemobileEt)

        populateFields()

        findViewById<Button>(R.id.updateBtn).setOnClickListener {
            updateUserProfile()
        }
    }

    private fun populateFields() {
        nameEditText.setText(profile24.name)
        emailEditText.setText(profile24.email)
        dobEditText.setText(profile24.dob)
        districtEditText.setText(profile24.district)
        mobileEditText.setText(profile24.mobile)
    }

    private fun updateUserProfile() {
        val name = nameEditText.text.toString()
        val email = emailEditText.text.toString()
        val dob = dobEditText.text.toString()
        val district = districtEditText.text.toString()
        val mobile = mobileEditText.text.toString()

        val updatedUserProfile = Profile_Dipti_Ict_Amad_L4_04_16(
            id = profile24.id,
            name = name,
            email = email,
            dob = dob,
            district = district,
            mobile = mobile
        )

        profileViewModel24.updateUserProfile(updatedUserProfile)

        finish()
    }
}