package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Repository_Dipti_Ict_Amad_L4_04_16

import androidx.lifecycle.LiveData
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Dao_Dipti_Ict_Amad_L4_04_16.ProfileDao_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16

class ProfileRepository_Dipti_Ict_Amad_L4_04_16 (private val userProfileDao24: ProfileDao_Dipti_Ict_Amad_L4_04_16) {
    fun getUserProfiles(): LiveData<List<Profile_Dipti_Ict_Amad_L4_04_16>> {
        return userProfileDao24.getAllUserProfiles()
    }

    suspend fun insert(userProfile: Profile_Dipti_Ict_Amad_L4_04_16) {
        userProfileDao24.insert(userProfile)
    }

    suspend fun update(userProfile: Profile_Dipti_Ict_Amad_L4_04_16) {
        userProfileDao24.update(userProfile)
    }

    suspend fun delete(userProfile: Profile_Dipti_Ict_Amad_L4_04_16) {
        userProfileDao24.delete(userProfile)
    }
}