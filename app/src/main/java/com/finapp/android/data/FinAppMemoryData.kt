package com.finapp.android.data

import com.finapp.android.model.Transaction
import com.finapp.android.model.TransactionType

/**
 * Gerencia a lista de transações em memória.
 * Os dados não são persistentes e serão perdidos ao fechar o aplicativo.
 */
object FinAppMemoryData {

    private val transactions = mutableListOf<Transaction>()

    init {

        addTransaction(Transaction(TransactionType.DEBITO, "Lazer", 20.50))
        addTransaction(Transaction(TransactionType.DEBITO, "Moradia", 1200.00))
        addTransaction(Transaction(TransactionType.CREDITO, "Salário", 10000.00))
    }

    /**
     * Adiciona uma nova transação à lista.
     */
    fun addTransaction(transaction: Transaction) {
        transactions.add(transaction)
    }

    /**
     * Retorna uma cópia da lista de transações para evitar modificações externas não controladas.
     */
    fun getAllTransactions(): List<Transaction> {
        return transactions.toList()
    }
}