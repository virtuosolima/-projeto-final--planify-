package br.edu.ifpe.planify.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pets")
data class Pet(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val nome: String,
    val especie: String, // Ex: Cachorro, Gato
    val raca: String,
    val idade: Int,
    val clienteId: Int // Relacionamento com o dono (Cliente)
)
