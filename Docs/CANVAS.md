# 🎯 Canvas do Projeto Final — App Android

| | |
|---|---|
| **Grupo nº** | 01 |
| **Integrantes (4)** | Thales, Abner, Sara, Leticia |
| **Turma** | 3º ano — Ensino Médio |
| **Repositório** | `https://github.com/virtuosolima/-projeto-final--planify-` |
| **Data de preenchimento** | 09/09/2026 |
| **Entrega final** | **10/12/2026** |

---

## 🧩 Bloco 1 — Nome e pitch do app

**Nome do app:** Planify

**Pitch em uma frase:**
> "O Planify ajuda empreendedores autônomos a organizar clientes, pets e serviços em uma agenda inteligente, eliminando a confusão de anotações manuais."

---

## 😖 Bloco 2 — Problema

Pequenos empreendedores (petshops, autônomos) gerenciam múltiplos dados espalhados: WhatsApp, papel e memória. Isso gera esquecimento de horários, sobreposição de clientes e perda de controle sobre quais pets realizaram quais serviços.

**Como esse problema é resolvido hoje (sem o app)?**
Agendas de papel, lembretes no celular sem contexto, conversas fixadas no WhatsApp e planilhas manuais que não notificam o usuário.

---

## 👥 Bloco 3 — Público-alvo

- **Perfil principal:** Pequenos empreendedores e autônomos (25-45 anos), como donos de petshops, banhistas e prestadores de serviço que atendem com hora marcada.
- **Quando/onde usam:** Uso diário no celular para consultar a agenda do dia e cadastrar novos serviços entre atendimentos.
- **Pessoa real:** Ana Cláudia, dona de um salão/petshop.

---

## 💡 Bloco 4 — Solução em uma tela

- **A tela principal lista:** Compromissos do dia ordenados por horário, exibindo o Nome do Pet, o Serviço e o Status de Pagamento.
- **A ação principal do usuário é:** Adicionar um compromisso vinculando um Cliente, um Pet e um Serviço específico.
- **Depois de agir, o usuário vê:** O compromisso na lista com um indicador visual de status e a notificação local agendada.

---

## ✅ Bloco 5 — Funcionalidades do MVP

| # | Funcionalidade | Essencial? | Quem faz |
|---|---|---|---|
| F1 | Gestão de Clientes e seus respectivos Pets | Sim | Membro D (Pet) / A (Cliente) |
| F2 | Catálogo de Serviços com preços e descrições | Sim | Membro C (Servico) |
| F3 | Agendamento de Compromissos com data/hora e valores | Sim | Membro B (Compromisso) |
| F4 | Lembrete automático e Status de Pagamento | Sim | Integrado |

---

## 🚫 Bloco 6 — Fora do escopo

- ❌ Login/Contas online (Tudo é local no Room).
- ❌ Sincronização em nuvem.
- ❌ Pagamentos via PIX/Cartão dentro do app.
- ❌ Histórico médico veterinário complexo.

---

## ⚙️ Bloco 7 — Caminho técnico

- [x] **Opção A — Room:** Dados locais para Clientes, Pets, Serviços e Compromissos.

**Bibliotecas:** Room, Jetpack Compose, Navigation, Coroutines, Flow, AlarmManager.

## Tratamento de erros — try/catch
- Falha ao salvar no banco: "Não foi possível salvar os dados."
- Campos vazios: "Preencha todos os campos obrigatórios."
- Lembrete negado: "Permissão de notificação necessária para lembretes."

---

## 🎨 Bloco 8 — Identidade visual

| Item | Definição do grupo |
|---|---|
| Nome exibido | Planify |
| Cor principal | `#010736` (Azul Marinho) |
| Ideia do ícone | Um calendário estilizado com uma pata de pet integrada |
| `applicationId` | `br.edu.ifpe.planify` |
| Versão inicial | `1.0` |

---

## 👤 Bloco 9 — Equipe e Responsabilidades

| Integrante | Entidade Responsável | Foco |
|---|---|---|
| **Thales** | **Cliente** | Cadastro e gestão de tutores |
| **Abner** | **Compromisso** | Lógica da agenda e status |
| **Sara** | **Servico** | Catálogo e precificação |
| **Letícia** | **Pet** | Cadastro e perfil dos animais |

---

## 🤖 Bloco 10 — Acordo de trabalho com IA

1. Não criar funções fora do escopo sem validar com o grupo.
2. Explicar a lógica de Flow e Coroutines em cada nova implementação.
3. Seguir rigorosamente a estrutura de pastas `src/src/main/java`.

---

## 🗓️ Bloco 11 — Marcos até 10/12

| Marco | Prazo | Entrega |
|---|---|---|
| M1 | 16/09 | Canvas e Repositório |
| M2 | 30/09 | PRD e Telas |
| M3 | 21/10 | Funcionalidade Base |
| M4 | 11/11 | Room/Persistência Completa |
| M6 | 02/12 | README e APK Final |

---

## 🏁 Bloco 12 — Definição de pronto

- [ ] App não crasha.
- [ ] CRUD completo das 4 entidades funcionando.
- [ ] Lembretes disparando localmente.
- [ ] Identidade visual azul-marinho aplicada.
