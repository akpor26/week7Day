package com.onovughe.week7day

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.onovughe.week7day.databinding.ActivityMainBinding
import com.onovughe.week7day.ui.MainViewModel
import com.onovughe.week7day.ui.MyAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var  viewModel: MainViewModel
    private lateinit var  MyAdapter1: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MyAdapter1 = MyAdapter(listOf())
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        binding.recyclerId.apply {
            adapter = MyAdapter1
            layoutManager = LinearLayoutManager(this@MainActivity)
        }

        viewModel.run {
            getUsers()
            usersLiveData.observe(this@MainActivity, {
                users ->
                MyAdapter1.users = users
                MyAdapter1.notifyDataSetChange()
            })
        }
    }
}