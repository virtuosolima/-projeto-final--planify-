package br.edu.ifpe.planify.ui.screens.compromisso

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import br.edu.ifpe.planify.ui.components.PlanifyButton
import br.edu.ifpe.planify.ui.components.PlanifyTextField
import br.edu.ifpe.planify.ui.theme.PrimaryBlue
import br.edu.ifpe.planify.ui.theme.TextSecondary

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CompromissoFormScreen(
    onNavigateBack: () -> Unit,
    onSave: () -> Unit
) {
    var selectedCliente by remember { mutableStateOf("") }
    var selectedServico by remember { mutableStateOf("") }
    var data by remember { mutableStateOf("") }
    var horario by remember { mutableStateOf("") }
    var valor by remember { mutableStateOf("") }
    var lembreteAtivo by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Novo Agendamento", color = Color.White, fontWeight = FontWeight.Bold) },
                navigationIcon = {
                    IconButton(onClick = onNavigateBack) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Voltar", tint = Color.White)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = PrimaryBlue)
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(Color(0xFFF8F9FA))
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // Cliente Selection (Simulated as TextField for UI prototype)
            PlanifyTextField(
                value = selectedCliente,
                onValueChange = { selectedCliente = it },
                label = "Selecionar Cliente",
                placeholder = "Busque um cliente..."
            )

            // Servico Selection
            PlanifyTextField(
                value = selectedServico,
                onValueChange = { selectedServico = it },
                label = "Selecionar Serviço",
                placeholder = "Busque um serviço..."
            )

            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                PlanifyTextField(
                    value = data,
                    onValueChange = { data = it },
                    label = "Data",
                    modifier = Modifier.weight(1f),
                    placeholder = "DD/MM/AAAA"
                )
                PlanifyTextField(
                    value = horario,
                    onValueChange = { horario = it },
                    label = "Horário",
                    modifier = Modifier.weight(1f),
                    placeholder = "00:00"
                )
            }

            PlanifyTextField(
                value = valor,
                onValueChange = { valor = it },
                label = "Valor do Atendimento (R$)",
                placeholder = "0,00"
            )

            // Lembrete Toggle
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(text = "Ativar Lembrete", fontWeight = FontWeight.SemiBold)
                    Text(text = "Notificar 1 hora antes", color = TextSecondary, style = MaterialTheme.typography.bodySmall)
                }
                Switch(
                    checked = lembreteAtivo,
                    onCheckedChange = { lembreteAtivo = it },
                    colors = SwitchDefaults.colors(checkedThumbColor = PrimaryBlue)
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            PlanifyButton(
                text = "Confirmar Agendamento",
                onClick = onSave
            )
        }
    }
}
