package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.View_Dipti_Ict_Amad_L4_04_16

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Adapter_Dipti_Ict_Amad_L4_04_16.ProfileAdapter_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.R
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.ViewModel_Dipti_Ict_Amad_L4_04_16.ProfileViewActivity_Dipti_Ict_Amad_L4_04_16
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileListActivity_Dipti_Ict_Amad_L4_04_16 : AppCompatActivity() {
    private lateinit var profileViewActivity_Dipti_Ict_Amad_L4_04_16: ProfileViewActivity_Dipti_Ict_Amad_L4_04_16
    private lateinit var profileAdapter_Dipti_Ict_Amad_L4_04_16: ProfileAdapter_Dipti_Ict_Amad_L4_04_16

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_list_dipti_ict_amad_l4_04_16)

        profileViewActivity_Dipti_Ict_Amad_L4_04_16 = ViewModelProvider(this).get(ProfileViewActivity_Dipti_Ict_Amad_L4_04_16::class.java)

        val recyclerView = findViewById<RecyclerView>(R.id.profileRecyclerView)
        profileAdapter_Dipti_Ict_Amad_L4_04_16 = ProfileAdapter_Dipti_Ict_Amad_L4_04_16()

        recyclerView.adapter = profileAdapter_Dipti_Ict_Amad_L4_04_16
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Observe profiles from ViewModel
        profileViewActivity_Dipti_Ict_Amad_L4_04_16.getUserProfiles().observe(this, Observer { profiles ->
            if (profiles.isEmpty()) {
                // Show a Toast message if there are no profiles
                Toast.makeText(this, "No profiles available", Toast.LENGTH_SHORT).show()
            } else {
                profileAdapter_Dipti_Ict_Amad_L4_04_16.submitList(profiles)
            }
        })

        // Set item click listener for details
        profileAdapter_Dipti_Ict_Amad_L4_04_16.setOnItemClickListener { profile24 ->
            val intent = Intent(this@ProfileListActivity_Dipti_Ict_Amad_L4_04_16, SingleProfileActivity_Dipti_Ict_Amad_L4_04_16::class.java)
            intent.putExtra("USER_PROFILE", profile24)
            startActivity(intent)
        }

        // Set delete click listener
        profileAdapter_Dipti_Ict_Amad_L4_04_16.setOnDeleteClickListener { userProfile ->
            showDeleteConfirmationDialog(userProfile)
        }

        // Set update click listener
        profileAdapter_Dipti_Ict_Amad_L4_04_16.setOnUpdateClickListener { userProfile ->
            val intent = Intent(this@ProfileListActivity_Dipti_Ict_Amad_L4_04_16, UpdateProfileActivity_Dipti_Ict_Amad_L4_04_16::class.java)
            intent.putExtra("USER_PROFILE", userProfile)
            startActivity(intent)
        }

        // Add profile button click listener
        findViewById<FloatingActionButton>(R.id.addProfileBtn).setOnClickListener {
            val intent = Intent(this@ProfileListActivity_Dipti_Ict_Amad_L4_04_16, AddProfileActivity_Dipti_Ict_Amad_L4_04_16::class.java)
            startActivity(intent)
        }
    }

    // Show delete confirmation dialog
    private fun showDeleteConfirmationDialog(profile: Profile_Dipti_Ict_Amad_L4_04_16) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Delete Profile")
        builder.setMessage("Are you sure you want to delete this profile?")

        builder.setPositiveButton("Yes") { dialog, which ->
            profileViewActivity_Dipti_Ict_Amad_L4_04_16.deleteUserProfile(profile)  // Delete the profile
            dialog.dismiss()
        }

        builder.setNegativeButton("No") { dialog, which ->
            dialog.dismiss()  // Cancel delete operation
        }


        val dialog = builder.create()
        dialog.show()
    }
}
