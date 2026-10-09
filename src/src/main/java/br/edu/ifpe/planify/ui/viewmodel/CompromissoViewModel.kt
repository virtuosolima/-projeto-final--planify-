package br.edu.ifpe.planify.ui.viewmodel

import androidx.lifecycle.*
import br.edu.ifpe.planify.data.repository.CompromissoRepository
import br.edu.ifpe.planify.model.Compromisso
import br.edu.ifpe.planify.notification.NotificationScheduler
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalDate

class CompromissoViewModel(
    private val repository: CompromissoRepository,
    private val notificationScheduler: NotificationScheduler
) : ViewModel() {

    private val _selectedDate = MutableStateFlow(LocalDate.now())
    val selectedDate: StateFlow<LocalDate> = _selectedDate

    val compromissosForDate: StateFlow<List<Compromisso>> = _selectedDate
        .flatMapLatest { date -> repository.getCompromissosByDate(date) }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    val allCompromissos: StateFlow<List<Compromisso>> = repository.allCompromissos
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun selectDate(date: LocalDate) {
        _selectedDate.value = date
    }

    fun insert(compromisso: Compromisso) = viewModelScope.launch {
        val id = repository.insert(compromisso)
        if (compromisso.temLembrete) {
            // Criamos uma cópia com o ID real gerado pelo Room para o alarme
            notificationScheduler.scheduleNotification(compromisso.copy(id = id.toInt()))
        }
    }

    fun update(compromisso: Compromisso) = viewModelScope.launch {
        repository.update(compromisso)
        if (compromisso.temLembrete) {
            notificationScheduler.scheduleNotification(compromisso)
        } else {
            notificationScheduler.cancelNotification(compromisso.id)
        }
    }

    fun delete(compromisso: Compromisso) = viewModelScope.launch {
        repository.delete(compromisso)
        notificationScheduler.cancelNotification(compromisso.id)
    }
}

class CompromissoViewModelFactory(
    private val repository: CompromissoRepository,
    private val notificationScheduler: NotificationScheduler
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CompromissoViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CompromissoViewModel(repository, notificationScheduler) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
