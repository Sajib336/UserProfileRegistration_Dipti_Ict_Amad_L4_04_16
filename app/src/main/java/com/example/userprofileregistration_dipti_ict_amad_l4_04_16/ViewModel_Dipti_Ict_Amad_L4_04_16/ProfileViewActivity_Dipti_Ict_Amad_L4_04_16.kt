package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.ViewModel_Dipti_Ict_Amad_L4_04_16

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Data_Dipti_Ict_Amad_L4_04_16.UserDatabase_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Repository_Dipti_Ict_Amad_L4_04_16.ProfileRepository_Dipti_Ict_Amad_L4_04_16
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ProfileViewActivity_Dipti_Ict_Amad_L4_04_16 (application: Application) : AndroidViewModel(application) {
    private val repository_Dipti_Ict_Amad_L4_04_16: ProfileRepository_Dipti_Ict_Amad_L4_04_16
    init {
        val argentinaProfileDao = UserDatabase_Dipti_Ict_Amad_L4_04_16.getDatabase(application).userProfileDao()
        repository_Dipti_Ict_Amad_L4_04_16 = ProfileRepository_Dipti_Ict_Amad_L4_04_16(argentinaProfileDao)
    }

    fun getUserProfiles(): LiveData<List<Profile_Dipti_Ict_Amad_L4_04_16>> {
        return repository_Dipti_Ict_Amad_L4_04_16.getUserProfiles()
    }

    fun insertUserProfile(profile: Profile_Dipti_Ict_Amad_L4_04_16) {
        viewModelScope.launch(Dispatchers.IO) {
            repository_Dipti_Ict_Amad_L4_04_16.insert(profile)
        }
    }

    fun updateUserProfile(profile: Profile_Dipti_Ict_Amad_L4_04_16) {
        viewModelScope.launch(Dispatchers.IO) {
            repository_Dipti_Ict_Amad_L4_04_16.update(profile)
        }
    }

    fun deleteUserProfile(profile: Profile_Dipti_Ict_Amad_L4_04_16) {
        viewModelScope.launch(Dispatchers.IO) {
            repository_Dipti_Ict_Amad_L4_04_16.delete(profile)
        }
    }
}