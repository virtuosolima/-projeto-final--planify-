# Plano de Desenvolvimento - Planify

## 🤖 Agentes e Responsabilidades

Este projeto é organizado através de entidades fundamentais, cada uma representando um domínio de negócio:

### 1. Agente de Clientes (Domínio: `model.Cliente`)
*   **Responsabilidade:** Gerenciar o cadastro, edição e perfil dos clientes.
*   **Campos principais:** Nome, contato, histórico.

### 2. Agente de Agendamentos (Domínio: `model.Compromisso`)
*   **Responsabilidade:** Controlar a agenda, horários e vinculação com clientes.
*   **Regra de Negócio:** Um compromisso deve obrigatoriamente estar vinculado a um cliente.

### 3. Agente Financeiro (Domínio: `model.PaymentStatus`)
*   **Responsabilidade:** Monitorar o status de pagamento dos compromissos.
*   **Estados:** `PAGO`, `PENDENTE`.

## 🛠 Tech Stack
- **Linguagem:** Kotlin
- **UI:** Jetpack Compose
- **Persistência:** Room Database
- **Navegação:** Navigation Compose
- **Assincronismo:** Coroutines & Flow
