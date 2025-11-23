package com.finapp.android.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.finapp.android.databinding.ActivityDashboardBinding // Import gerado automaticamente pelo ViewBinding

/**
 * Activity Principal que serve como Dashboard e hub de navegação.
 * Requisitos: Botões para Cadastro, Extrato e Sair.
 */
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    private fun setupListeners() {
        binding.buttonCadastro.setOnClickListener {
            startActivity(Intent(this, CadastroActivity::class.java))
        }

        binding.buttonExtrato.setOnClickListener {
            startActivity(Intent(this, ExtratoActivity::class.java))
        }

        binding.buttonSair.setOnClickListener {
            finish()
            finishAffinity()
        }
    }
}
