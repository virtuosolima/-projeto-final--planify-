package br.edu.ifpe.planify.model

data class Cliente(
    val id: Int = 0,
    val nome: String,
    val telefone: String,
    val observacoes: String? = null
)