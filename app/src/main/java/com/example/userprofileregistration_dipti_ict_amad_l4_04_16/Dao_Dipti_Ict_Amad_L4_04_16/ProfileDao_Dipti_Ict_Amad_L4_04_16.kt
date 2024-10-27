package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Dao_Dipti_Ict_Amad_L4_04_16

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16

@Dao
interface ProfileDao_Dipti_Ict_Amad_L4_04_16 {
    @Insert
    suspend fun insert(argentinaProfile: Profile_Dipti_Ict_Amad_L4_04_16)

    @Update
    suspend fun update(argentinaProfile: Profile_Dipti_Ict_Amad_L4_04_16)

    @Delete
    suspend fun delete(argentinaProfile: Profile_Dipti_Ict_Amad_L4_04_16)

    @Query("SELECT * FROM profile")
    fun getAllUserProfiles(): LiveData<List<Profile_Dipti_Ict_Amad_L4_04_16>>
}