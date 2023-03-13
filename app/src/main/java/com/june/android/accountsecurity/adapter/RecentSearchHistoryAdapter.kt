package com.june.android.accountsecurity.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.june.android.accountsecurity.databinding.ItemRecyclerBinding
import com.june.android.accountsecurity.model.RecentSearch

class RecentSearchHistoryAdapter() : ListAdapter<RecentSearch, RecentSearchHistoryAdapter.ViewHolder>(diffUtil) {

    interface ClickEventListener {
        fun onModifyButtonLongClickEvent(item: RecentSearch)
        fun onModifyButtonShortClickEvent(newItem: RecentSearch)
        fun onDeleteButtonShortClickEvent(item: RecentSearch)
    }

    inner class ViewHolder(private val binding: ItemRecyclerBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(item: RecentSearch) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<RecentSearch>() {
            override fun areItemsTheSame(oldItem: RecentSearch, newItem: RecentSearch): Boolean {
                return oldItem.id == newItem.id
            }
            override fun areContentsTheSame(oldItem: RecentSearch, newItem: RecentSearch): Boolean {
                return oldItem == newItem
            }
        }
    }
}