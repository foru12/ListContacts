package com.example.listcontacts.ui.contacts

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listcontacts.R
import com.example.listcontacts.data.model.DataContacts
import com.example.listcontacts.databinding.ItemContactBinding

class AdapterContacts (private val activity: Activity) : RecyclerView.Adapter<MyViewHolder>() {

    private var contactsList = mutableListOf<DataContacts>()

    var clickListener: ListClickListener<DataContacts>? = null
    private var onItemClickListener: OnItemClickListener? = null

    @SuppressLint("NotifyDataSetChanged")
    fun setСontacts(listContacts: List<DataContacts>) {
        this.contactsList = listContacts.toMutableList()
        notifyDataSetChanged()
    }

    fun setOncontactsClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contactsList.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val contacts = contactsList[position]
        holder.binding.run {

            txtName.text = contacts.name
            txtNumber.text = contacts.number

           /* Glide
                .with(activity)
                .load(contacts.logoAvatar)
                .centerCrop()
                .into(imAvatarLogo);*/


        }
        holder.itemView.setOnClickListener {
            onItemClickListener?.onContactsClick(contacts)
        }
    }

    fun setOnItemClick(listClickListener: ListClickListener<DataContacts>) {
        this.clickListener = listClickListener
    }

    interface OnItemClickListener {
        fun onContactsClick(contacts: DataContacts)
    }

}
class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemContactBinding.bind(view)
}


interface ListClickListener<T> {
    fun onClick(data: T, position: Int)
    fun onDelete(contacts: T)
}