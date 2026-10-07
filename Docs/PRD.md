# 📄 PRD — Documento de Requisitos do Produto: Planify

| Item | Detalhe |
| :--- | :--- |
| **App** | Planify |
| **Grupo** | STL + A |
| **Autores** | Thales, Abner, Sara e Leticia |
| **Versão** | 1.1 (Atualizada com 4 Entidades) |
| **Status** | ✅ Aprovado pelo Grupo |

---

## 1. Visão do Produto
O **Planify** centraliza a gestão de pequenos negócios baseados em serviços (como Petshops). Ele permite gerenciar **Clientes**, seus **Pets**, o catálogo de **Serviços** e a agenda de **Compromissos** com controle financeiro básico, tudo funcionando offline.

---

## 2. Público e Cenário de Uso
**Público:** Profissionais autônomos e donos de pequenos estabelecimentos (ex: banhistas, tosadores, veterinários autônomos).
**Cenário:** O usuário atende um cliente, cadastra o pet e o serviço realizado, define se foi pago e agenda o próximo retorno, recebendo um lembrete automático.

---

## 3. Objetivos e Não-Objetivos

**Objetivos (MVP v1.0):**
1. Gerenciar o ciclo completo: Cliente -> Pet -> Serviço -> Compromisso.
2. Controle de status de pagamento (Pago/Pendente).
3. Notificações locais para lembretes de horários.
4. Persistência de dados local (Room).

**Não-Objetivos:**
- ❌ Sincronização em nuvem ou login.
- ❌ Processamento de pagamentos bancários.
- ❌ Chat interno.

---

## 4. Requisitos Funcionais (Priorizados)

| ID | Descrição | Prioridade | Responsável |
| :--- | :--- | :--- | :--- |
| **RF01** | Gerenciar Clientes (CRUD) | Must | Thales |
| **RF02** | Gerenciar Pets vinculados a Clientes | Must | Leticia |
| **RF03** | Gerenciar Catálogo de Serviços e Preços | Must | Sara |
| **RF04** | Agendar Compromissos (Data, Hora, Pet, Serviço) | Must | Abner |
| **RF05** | Controle de Status de Pagamento (Pago/Pendente) | Must | Geral |
| **RF06** | Lembretes de notificação (1h antes) | Should | Geral |

---

## 5. Requisitos Não Funcionais
- **RNF01:** Persistência local via Room Database.
- **RNF02:** UI moderna utilizando Jetpack Compose e Material 3.
- **RNF03:** Suporte a Android 7.0 (API 24) ou superior.
- **RNF04:** Funcionamento 100% offline.

---

## 6. Estrutura de Dados (Entidades)

### A. Cliente
- `id`: Long (PK)
- `nome`: String (Obrigatório)
- `telefone`: String

### B. Pet
- `id`: Long (PK)
- `nome`: String (Obrigatório)
- `especie`: String
- `clienteId`: Long (FK)

### C. Servico
- `id`: Long (PK)
- `nome`: String (Obrigatório)
- `preco`: Double

### D. Compromisso
- `id`: Long (PK)
- `petId`: Long (FK)
- `servicoId`: Long (FK)
- `dataHora`: Long (Timestamp)
- `pago`: Boolean

---

## 7. Arquitetura e Pastas
A estrutura segue o padrão de **Clean Architecture** dentro da pasta `src` solicitada pelo docente:

```text
planify/src/src/main/java/br/edu/ifpe/planify/
├── data/           # DAOs, Database e Repositories
├── model/          # Entidades (Pet, Cliente, Servico, Compromisso)
├── navigation/     # NavHost e Rotas
├── ui/             # Temas e Componentes Globais
└── features/       # Telas divididas por funcionalidade
```

---

## 8. Identidade Visual
- **Cor Principal:** `#010736` (Azul Marinho).
- **Estilo:** Cards minimalistas com tipografia limpa.
- **Navegação:** Bottom Navigation ou Drawer para troca entre Agenda, Clientes e Serviços.

---

## 9. Plano de Testes (Resumo)
1. **T1:** Criar um Cliente e verificar se aparece na lista.
2. **T2:** Vincular um Pet ao Cliente criado.
3. **T3:** Agendar um Serviço para esse Pet e conferir se o valor total é calculado.
4. **T4:** Verificar se a notificação aparece no horário agendado.
