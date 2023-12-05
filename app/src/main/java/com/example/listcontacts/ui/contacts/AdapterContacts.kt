package com.example.listcontacts.ui.contacts

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listcontacts.R
import com.example.listcontacts.data.model.DataContacts
import com.example.listcontacts.databinding.ItemContactBinding

class AdapterContacts () : RecyclerView.Adapter<MyViewHolder>() {

    private var contactsList = mutableListOf<DataContacts>()


    private var onItemClickListener: OnItemClickListener? = null

    @SuppressLint("NotifyDataSetChanged")
    fun setСontacts(listContacts: List<DataContacts>) {
        this.contactsList = listContacts.toMutableList()
        notifyDataSetChanged()
    }

    fun setOnContactsClickListener(onItemClickListener: OnItemClickListener) {
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
            checkboxItem.visibility = View.GONE

          /*  Glide
                .with(activity)
                .load(contacts.logoAvatar)
                .centerCrop()
                .into(imAvatarLogo);
*/

        }
        holder.itemView.setOnClickListener {
            onItemClickListener?.onContactsClick(contacts)
        }
    }



    interface OnItemClickListener {
        fun onContactsClick(contacts: DataContacts)
    }

}
class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemContactBinding.bind(view)
}


