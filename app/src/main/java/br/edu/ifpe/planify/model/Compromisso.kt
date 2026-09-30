package br.edu.ifpe.planify.model

import java.time.LocalDate
import java.time.LocalTime

data class Compromisso(
    val id: Int = 0,
    val clienteId: Int, // ID do Cliente associado
    val descricao: String,
    val data: LocalDate,
    val horarioInicial: LocalTime,
    val horarioFinal: LocalTime? = null,
    val valor: Double,
    val statusPagamento: PaymentStatus = PaymentStatus.PENDENTE,
    val observacoes: String? = null,
    val temLembrete: Boolean = false
)