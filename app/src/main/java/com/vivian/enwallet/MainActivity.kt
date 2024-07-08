package com.vivian.enwallet

import android.os.Bundle
import android.view.SurfaceControl.Transaction
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.vivian.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvtransactions.layoutManager=GridLayoutManager(this,2)
         displayTransactions()
    }
    fun displayTransactions(){
        val transactions1=transactions("Salary","KES 40000","","1 July 2024")
        val transactions2=transactions("Rent","KES 1600000","","2 july 2024")

        val transactionslist= listOf(transactions1,transactions2)
        val transactionsAdapter=transactionAdapter(transactionslist)
        binding.rvtransactions.adapter=transactionsAdapter
    }
}