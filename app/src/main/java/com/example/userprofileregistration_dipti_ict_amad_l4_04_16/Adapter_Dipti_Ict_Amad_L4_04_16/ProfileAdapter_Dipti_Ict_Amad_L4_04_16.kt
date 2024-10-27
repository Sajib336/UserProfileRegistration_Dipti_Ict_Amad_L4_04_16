package com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Adapter_Dipti_Ict_Amad_L4_04_16

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.Model_Dipti_Ict_Amad_L4_04_16.Profile_Dipti_Ict_Amad_L4_04_16
import com.example.userprofileregistration_dipti_ict_amad_l4_04_16.R

class ProfileAdapter_Dipti_Ict_Amad_L4_04_16: ListAdapter<Profile_Dipti_Ict_Amad_L4_04_16, ProfileAdapter_Dipti_Ict_Amad_L4_04_16.ProfileViewHolder>(DiffCallback()) {

    private var onItemClickListener: ((Profile_Dipti_Ict_Amad_L4_04_16) -> Unit)? = null
    private var onDeleteClickListener: ((Profile_Dipti_Ict_Amad_L4_04_16) -> Unit)? = null
    private var onUpdateClickListener: ((Profile_Dipti_Ict_Amad_L4_04_16) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.profile_item_layout_dipti_ict_amad_l4_04_16, parent, false)
        return ProfileViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)
    }

    fun setOnItemClickListener(listener: (Profile_Dipti_Ict_Amad_L4_04_16) -> Unit) {
        onItemClickListener = listener
    }

    fun setOnDeleteClickListener(listener: (Profile_Dipti_Ict_Amad_L4_04_16) -> Unit) {
        onDeleteClickListener = listener
    }

    fun setOnUpdateClickListener(listener: (Profile_Dipti_Ict_Amad_L4_04_16) -> Unit) {
        onUpdateClickListener = listener
    }

    inner class ProfileViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val profileName: TextView = itemView.findViewById(R.id.argentinaNameTxt)
        private val profileEmail: TextView = itemView.findViewById(R.id.argentinaEmailTxt)
        private val profileDOB: TextView = itemView.findViewById(R.id.argentinaDOBTxt)
        private val profileDistrict: TextView = itemView.findViewById(R.id.argentinaDistritTxt)
        private val profileMobile: TextView = itemView.findViewById(R.id.argentinaMobileTxt)
        private val deleteButton: ImageButton = itemView.findViewById(R.id.deleteBtn)
        private val updateButton: ImageButton = itemView.findViewById(R.id.editBtn)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    onItemClickListener?.invoke(profile)
                }
            }

            deleteButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    onDeleteClickListener?.invoke(profile)
                }
            }

            updateButton.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val profile = getItem(position)
                    onUpdateClickListener?.invoke(profile)
                }
            }
        }

        fun bind(userProfile: Profile_Dipti_Ict_Amad_L4_04_16) {
            profileName.text = userProfile.name
            profileEmail.text = userProfile.email
            profileDOB.text = userProfile.dob
            profileDistrict.text = userProfile.district
            profileMobile.text = userProfile.mobile
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Profile_Dipti_Ict_Amad_L4_04_16>() {
        override fun areItemsTheSame(oldItem: Profile_Dipti_Ict_Amad_L4_04_16, newItem: Profile_Dipti_Ict_Amad_L4_04_16): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Profile_Dipti_Ict_Amad_L4_04_16, newItem: Profile_Dipti_Ict_Amad_L4_04_16): Boolean {
            return oldItem == newItem
        }
    }
}