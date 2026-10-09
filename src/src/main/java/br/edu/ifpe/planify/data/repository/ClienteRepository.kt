package br.edu.ifpe.planify.data.repository

import br.edu.ifpe.planify.data.local.dao.ClienteDao
import br.edu.ifpe.planify.model.Cliente
import kotlinx.coroutines.flow.Flow

class ClienteRepository(private val clienteDao: ClienteDao) {
    val allClientes: Flow<List<Cliente>> = clienteDao.getAllClientes()

    suspend fun getClienteById(id: Int): Cliente? = clienteDao.getClienteById(id)

    suspend fun insert(cliente: Cliente) = clienteDao.insertCliente(cliente)

    suspend fun update(cliente: Cliente) = clienteDao.updateCliente(cliente)

    suspend fun delete(cliente: Cliente) = clienteDao.deleteCliente(cliente)
}
