package com.finapp.android.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.finapp.android.databinding.ItemTransactionBinding
import com.finapp.android.model.Transaction
import com.finapp.android.model.TransactionType
import java.text.NumberFormat
import java.util.Locale

/**
 * Adapter responsável por listar as operações cadastradas.
 */
class TransactionAdapter(private val transactions: List<Transaction>) :
    RecyclerView.Adapter<TransactionAdapter.TransactionViewHolder>() {

    class TransactionViewHolder(private val binding: ItemTransactionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(transaction: Transaction) {

            val color: Int = when (transaction.type) {
                TransactionType.CREDITO -> Color.parseColor("#4CAF50") // Verde para Crédito
                TransactionType.DEBITO -> Color.parseColor("#F44336")  // Vermelho para Débito
            }

            val formatter = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
            val formattedValue = formatter.format(transaction.value)

            binding.textViewTypeDescription.apply {

                text = "${transaction.type.name}: ${transaction.description}"
                setTextColor(color)
            }

            binding.textViewValue.apply {
                text = formattedValue // Ex: R$ 1.200,00
                setTextColor(color)
            }

        }
    }

    // Cria o ViewHolder inflando o layout do item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val binding = ItemTransactionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return TransactionViewHolder(binding)
    }

    // Conecta os dados na posição 'position' com o ViewHolder
    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        holder.bind(transactions[position])
    }

    override fun getItemCount(): Int {
        return transactions.size
    }
}