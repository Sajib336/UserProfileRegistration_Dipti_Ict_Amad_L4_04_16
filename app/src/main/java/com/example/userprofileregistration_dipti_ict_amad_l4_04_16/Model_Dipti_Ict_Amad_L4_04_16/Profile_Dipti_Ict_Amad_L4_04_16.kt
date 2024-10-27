package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "profile")
data class Profile_Dipti_Ict_Amad_L4_04_16(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val email: String,
    val dob: String,
    val district: String,
    val mobile: String
): Serializable