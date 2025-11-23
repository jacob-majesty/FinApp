package com.finapp.android.ui.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.finapp.android.R
import com.finapp.android.data.FinAppMemoryData
import com.finapp.android.databinding.ActivityCadastroBinding
import com.finapp.android.model.Transaction
import com.finapp.android.model.TransactionType

/**
 * Activity para cadastro de novas transações financeiras (débito/crédito).
 * Requisitos: Campos obrigatórios para Tipo, Descrição e Valor.
 */
class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setupListener()
    }

    private fun setupListener() {
        binding.buttonSalvar.setOnClickListener {
            if (validateFields()) {
                saveTransaction()
            }
        }
    }

    /**
     * Implementa as validações de campos obrigatórios.
     */
    private fun validateFields(): Boolean {

        binding.inputLayoutDescricao.error = null
        binding.inputLayoutValor.error = null

        val description = binding.editTextDescricao.text.toString().trim()
        val valueString = binding.editTextValor.text.toString().trim()
        var isValid = true

        if (description.isEmpty()) {
            binding.inputLayoutDescricao.error = getString(R.string.validation_required)
            isValid = false
        }

        if (valueString.isEmpty()) {
            binding.inputLayoutValor.error = getString(R.string.validation_required)
            isValid = false
        } else {
            try {
                if (valueString.toDouble() <= 0) {
                    binding.inputLayoutValor.error = "O valor deve ser positivo."
                    isValid = false
                }
            } catch (e: NumberFormatException) {
                binding.inputLayoutValor.error = "Valor inválido."
                isValid = false
            }
        }

        return isValid
    }

    /**
     * Cria e salva a transação na estrutura de dados em memória.
     */
    private fun saveTransaction() {
        val description = binding.editTextDescricao.text.toString().trim()
        val value = binding.editTextValor.text.toString().toDouble()


        val selectedId = binding.radioGroupTipo.checkedRadioButtonId
        val type = if (selectedId == R.id.radio_debito) {
            TransactionType.DEBITO
        } else {
            TransactionType.CREDITO
        }

        val newTransaction = Transaction(type, description, value)
        FinAppMemoryData.addTransaction(newTransaction)

        Toast.makeText(this, "Transação salva com sucesso!", Toast.LENGTH_SHORT).show()

        finish()
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
}