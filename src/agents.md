# Plano de Desenvolvimento - Planify

## 👥 Time e Responsabilidades (Entidades)

Cada membro será responsável por uma entidade core do sistema, implementando seu **Model, DAO, Repository e UI**:

1.  **Membro A: Agente de Clientes (`model/Cliente.kt`)**
    *   Foco: Cadastro de clientes e informações de contato.
2.  **Membro B: Agente de Agendamentos (`model/Compromisso.kt`)**
    *   Foco: Gestão de datas, horários e vínculo entre cliente e pet.
3.  **Membro C: Agente de Serviços (`model/Servico.kt`)**
    *   Foco: Catálogo de serviços (Banho, Tosa, etc.) e valores.
4.  **Membro D: Agente de Pets (`model/Pet.kt`)**
    *   Foco: Cadastro dos animais e histórico de saúde/raça.

## 🛠 Tech Stack
- **Interface:** Jetpack Compose + Material 3
- **Persistência:** Room Database
- **Navegação:** Navigation Compose
- **Assincronismo:** Coroutines & Flow
