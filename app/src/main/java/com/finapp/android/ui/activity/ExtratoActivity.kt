package com.finapp.android.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.finapp.android.data.FinAppMemoryData
import com.finapp.android.databinding.ActivityExtratoBinding
import com.finapp.android.ui.adapter.TransactionAdapter

/**
 * Activity responsável por listar todas as operações cadastradas.
 */
class ExtratoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityExtratoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityExtratoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setupRecyclerView()
    }

    /**
     * Configura o RecyclerView com a lista de transações em memória.
     */
    private fun setupRecyclerView() {

        val transactions = FinAppMemoryData.getAllTransactions()
        val adapter = TransactionAdapter(transactions)

        binding.recyclerViewExtrato.apply {
            layoutManager = LinearLayoutManager(this@ExtratoActivity)
            this.adapter = adapter
            addItemDecoration(DividerItemDecoration(this@ExtratoActivity, LinearLayoutManager.VERTICAL))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}