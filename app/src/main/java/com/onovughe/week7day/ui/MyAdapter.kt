package com.onovughe.week7day.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onovughe.week7day.databinding.UserItemBinding
import com.onovughe.week7day.model.User


class MyAdapter(var users: List<User>)
    :RecyclerView.Adapter<MyAdapter.UserViewHolder>(){

    class  UserViewHolder(private val binding: UserItemBinding)
        :RecyclerView.ViewHolder(binding.root)
    fun bind(user: User){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val binding = UserItemBinding.inflate(LayoutInflater.from(parent.context))
        return UserViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
    }

    override fun getItemCount(): Int {
        return users.size
    }

}