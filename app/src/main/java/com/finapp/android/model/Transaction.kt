package com.finapp.android.model

/**
 * Representa uma transação financeira no FinApp.
 * * Requisitos:
 * - Tipo da operação (débito/crédito)
 * - Descrição curta
 * - Valor
 */
data class Transaction(
    val type: TransactionType,

    val description: String,

    val value: Double
)

enum class TransactionType {
    DEBITO,
    CREDITO
}
