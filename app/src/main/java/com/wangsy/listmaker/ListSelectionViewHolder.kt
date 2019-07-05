package com.wangsy.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSelectionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val listPosition = itemView.findViewById<TextView>(R.id.item_number)
    val listTitle = itemView.findViewById<TextView>(R.id.item_title)
}