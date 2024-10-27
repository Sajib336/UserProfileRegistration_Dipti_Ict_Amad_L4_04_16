package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Data_Dipti_Ict_Amad_L4_04_16

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Dao_Dipti_Ict_Amad_L4_04_16.ProfileDao_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16


@Database(entities = [Profile_Dipti_Ict_Amad_L4_04_16::class], version = 1)
abstract class UserDatabase_Dipti_Ict_Amad_L4_04_16: RoomDatabase() {
    abstract fun userProfileDao(): ProfileDao_Dipti_Ict_Amad_L4_04_16

    companion object {
        @Volatile
        private var INSTANCE: UserDatabase_Dipti_Ict_Amad_L4_04_16? = null

        fun getDatabase(context: Context): UserDatabase_Dipti_Ict_Amad_L4_04_16 {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDatabase_Dipti_Ict_Amad_L4_04_16::class.java,
                    "user_profile_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}