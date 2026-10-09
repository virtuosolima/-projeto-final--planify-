package br.edu.ifpe.planify.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ForeignKey

@Entity(
    tableName = "lembretes",
    foreignKeys = [
        ForeignKey(
            entity = Compromisso::class,
            parentColumns = ["id"],
            childColumns = ["compromissoId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class Lembrete(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val compromissoId: Long,
    val antecedencia: Int, // em minutos
    val ativo: Boolean = true
)
