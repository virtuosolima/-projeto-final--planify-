# 📄 PRD — Documento de Requisitos do Produto

> **O que é um PRD?** É o documento que responde **o quê** o app faz e **por quê** — não *como* ele é programado.
> Quem lê o PRD deve conseguir entender o app inteiro sem abrir o código.

| <br>                    | <br>                                     |
| ----------------------- | ---------------------------------------- |
| **App**                 | Planify                                  |
| **Grupo**               | STL + A (Grupo 01)                       |
| **Autores**             | Thales, Abner, Sara e Leticia            |
| **Versão do documento** | 1.1                                      |
| **Última atualização**  | 09/10/2026                               |
| **Status**              | ( ) Rascunho (X) Em revisão ( ) Aprovado |

---

## 1. Visão do produto

**Pitch:**
O Planify ajuda empreendedores e profissionais autônomos a organizar seus clientes, pets, serviços e compromissos em um único aplicativo, sem depender de agendas de papel, conversas espalhadas ou vários aplicativos diferentes.

**Problema:**
Pequenos empreendedores e profissionais autônomos frequentemente precisam administrar sozinhos clientes, horários, serviços e pagamentos. Essas informações podem ficar espalhadas entre WhatsApp, agendas de papel, anotações, alarmes e planilhas, causando esquecimento de compromissos, dificuldade para acompanhar pagamentos e perda de informações. No caso de petshops, a falta de vínculo entre o dono, o animal e o serviço prestado agrava o problema.

**Por que vale a pena fazer isso:**
O Planify centraliza clientes, pets, serviços, compromissos, valores, pagamentos e lembretes em um único aplicativo, permitindo que o usuário organize seus atendimentos e acompanhe seus resultados de forma simples e eficiente, utilizando a persistência local (Room) para garantir o funcionamento offline.

---

## 2. Público e cenário de uso

**Usuário-alvo:**
Pequenos empreendedores e profissionais autônomos, principalmente pessoas entre 25 e 45 anos que atendem clientes ou administram compromissos por conta própria.

**Exemplos:**

- cabeleireiros;
- manicures;
- barbeiros;
- personal trainers;
- consultores;
- prestadores de serviços;
- donos de petshops;
- profissionais autônomos;
- donos de pequenos negócios locais.

**Usuário de referência:**
Ana Cláudia, dona de um salão de beleza e petshop.

**História de uso:**

> "São 19h, Ana Cláudia terminou um atendimento e precisa organizar seus compromissos. Ela abre o Planify e visualiza o resumo mensal, conferindo a quantidade de atendimentos e faturamento. Em seguida, acessa a área de clientes e cadastra um novo cliente e seu respectivo pet. Ela então seleciona um serviço do catálogo (ex: Tosa) e adiciona um novo compromisso informando o horário, valor e status do pagamento. Ao finalizar, o compromisso fica registrado e o lembrete automático é programado para uma hora antes do atendimento."

---

## 3. Objetivos e não-objetivos

**Objetivos desta versão (v1.0):**

1. Permitir o cadastro e consulta de clientes e seus respectivos pets.
2. Permitir a gestão de um catálogo de serviços com nomes e preços fixos.
3. Permitir a criação, edição, exclusão e acompanhamento de compromissos vinculando cliente, pet e serviço.
4. Permitir o registro de valores, pagamentos (Pago/Pendente) e lembretes dos compromissos.
5. Apresentar um resumo mensal com indicadores e estatísticas dos atendimentos.

**Não-objetivos (fora do escopo):**

- ❌ Login e cadastro de contas.
- ❌ Sincronização em nuvem ou múltiplos dispositivos.
- ❌ Pagamentos online reais (apenas marcação de status).
- ❌ Chat ou comunicação com clientes.
- ❌ Mapa ou localização.
- ❌ Notificações push por servidor.
- ❌ Backup automático.
- ❌ Recorrência automática de compromissos.

---

## 4. Requisitos funcionais

| **ID** | **História de usuário** | **Critério de aceite** | **Prioridade** |
| ------ | ----------------------- | ---------------------- | -------------- |
| RF01   | Como usuário, quero visualizar um resumo dos meus compromissos e resultados do mês. | Ao abrir a tela principal, o mês selecionado apresenta os compromissos registrados e indicadores de faturamento e média. | Must |
| RF02   | Como usuário, quero cadastrar clientes para ter seus contatos. | Ao salvar nome e telefone, o cliente aparece na lista e pode ser associado a um pet. | Must |
| RF03   | Como usuário, quero cadastrar pets vinculados a clientes. | O pet deve estar associado a um dono e ser selecionável no momento do agendamento. | Must |
| RF04   | Como usuário, quero gerenciar serviços e preços no catálogo. | Cadastro de serviços com nome e valor padrão para uso rápido nos compromissos. | Must |
| RF05   | Como usuário, quero adicionar um compromisso vinculado a um pet e serviço. | O usuário preenche os campos, vincula o Pet e o Serviço, e o item aparece na agenda do dia. | Must |
| RF06   | Como usuário, quero marcar status de pagamento. | Opção de marcar "Pago" ou "Pendente" em cada atendimento registrado. | Must |
| RF07   | Como usuário, quero editar ou excluir registros para corrigir informações. | Possibilidade de alterar ou remover clientes, pets, serviços ou compromissos. | Must |
| RF08   | Como usuário, quero ativar lembretes automáticos para não esquecer os horários. | O aplicativo deve disparar uma notificação local 1h antes do horário do compromisso. | Should |

### Definição dos indicadores do resumo mensal

- **Atendimentos:** quantidade de compromissos registrados no mês.
- **Faturamento:** soma dos valores dos compromissos registrados no mês.
- **Clientes:** quantidade de clientes únicos atendidos no mês.
- **Média:** faturamento dividido pela quantidade de atendimentos do mês.
- **Total de horas trabalhadas:** soma da duração dos compromissos (opcional).

---

## 5. Requisitos não funcionais

| **ID** | **Requisito**                                                                                                                   | **Como será verificado**                                                        |
| ------ | ------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| RNF01  | O app não pode fechar sozinho durante o uso normal.                                                                             | 5 minutos de uso contínuo sem crash, em dispositivo real.                        |
| RNF02  | Persistência de dados offline via Room.                                                                                         | Os dados devem permanecer salvos após fechar e abrir o aplicativo.               |
| RNF03  | Toda operação que pode falhar deverá possuir tratamento de exceção adequado.                                                    | Revisão do código e testes de erro (try/catch).                                  |
| RNF04  | O app deverá rodar a partir do Android 7.0 (API 24).                                                                            | Instalação em dispositivo real compatível.                                       |
| RNF05  | O projeto deverá possuir organização de código profissional na pasta src/.                                                      | Verificação da estrutura de diretórios conforme solicitado pelo professor.       |

---

## 6. Telas e navegação

**Mapa de navegação:**

```text
[Tela Principal — Agenda/Resumo]
        │
        ├── Acessa Clientes → [Lista de Clientes/Pets]
        │       └── Adicionar → [Cadastro Cliente/Pet]
        │
        ├── Acessa Serviços → [Catálogo de Serviços]
        │       └── Adicionar → [Cadastro Serviço]
        │
        └── Novo Agendamento → [Formulário de Compromisso]
```

| **Tela**                | **O que mostra**                                                                                                              | **Ações disponíveis**                                                                 |
| ----------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| Principal               | Resumo mensal, indicadores e lista de compromissos do dia. | Navegar entre dias, visualizar detalhes, adicionar novo. |
| Cadastro de Cliente/Pet | Campos para nome do dono, telefone e dados básicos do animal. | Preencher dados e salvar o vínculo. |
| Catálogo de Serviços    | Lista de serviços cadastrados e seus respectivos preços. | Adicionar, editar ou excluir serviços do catálogo. |
| Cadastro de Compromisso | Seleção de Pet, Serviço, Data e Hora, e Status de Pagamento. | Vincular as entidades, preencher horários e salvar. |

**Estado vazio da tela principal:**

> "Nenhum compromisso registrado para este dia."

**Rascunhos das telas:**

- docs/telas/01-principal.png
- docs/telas/02-compromisso.png
- docs/telas/03-detalhe-compromisso.png
- docs/telas/04-clientes.png
- docs/telas/05-cadastro-cliente.png

---

## 7. Dados

### Entidade: `Cliente`

| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| nome | String | sim | Nome completo do tutor. |
| telefone | String | sim | Contato para avisos. |

### Entidade: `Pet`

| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| nome | String | sim | Nome do animal. |
| especie | String | sim | Cão, Gato, etc. |
| clienteId | Long | sim | Chave estrangeira (FK) vinculada ao Cliente. |

### Entidade: `Servico`

| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| nome | String | sim | Nome do serviço (ex: Banho). |
| preco | Double | sim | Valor base do serviço. |

### Entidade: `Compromisso`

| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| petId | Long | sim | FK vinculando ao pet atendido. |
| servicoId | Long | sim | FK vinculando ao serviço realizado. |
| dataHora | Long | sim | Data e Hora do atendimento (Timestamp). |
| pago | Boolean | sim | Status: Pago ou Pendente. |

**Operações necessárias:**

- (X) inserir
- (X) listar
- (X) atualizar
- (X) excluir

---

## 8. Arquitetura e tecnologias

| **Item**               | **Escolha**                                                                            |
| ---------------------- | -------------------------------------------------------------------------------------- |
| Linguagem              | Kotlin                                                                                 |
| Interface              | (X) Jetpack Compose ( ) XML/Views                                                      |
| Persistência           | (X) Room ( ) —                                                                         |
| Outras bibliotecas     | Material 3, Navigation Compose, Coroutines, Flow, AlarmManager                         |
| `minSdk` / `targetSdk` | 24 (Android 7.0) / 35 (Android 15)                                                     |

---

## 9. Tratamento de erros

| **Situação de falha** | **O que o app faz** | **Mensagem para o usuário** |
| --------------------------- | --------------------------------------------------------- | ----------------------------------------------------------------------------- |
| Campo obrigatório em branco | Impede o salvamento e destaca os campos necessários. | "Preencha os campos obrigatórios antes de salvar." |
| Erro ao salvar no banco | Mantém o usuário na tela e informa a falha. | "Não foi possível salvar os dados. Tente novamente." |
| Falha ao agendar lembrete | Salva o compromisso mas avisa sobre a notificação. | "Compromisso salvo, mas o lembrete não pôde ser ativado." |
| Confirmação de exclusão | Apresenta uma caixa de diálogo de confirmação. | "Tem certeza que deseja excluir este registro?" |

---

## 10. Identidade visual e publicação

| **Item** | **Definição** | **Onde fica** |
| ----------------------------- | ---------------------- | ------------------ |
| Nome do app | Planify | strings.xml |
| Cor principal | Azul-marinho (#010736) | Color.kt |
| applicationId | br.edu.ifpe.planify | build.gradle.kts |
| `versionName` / `versionCode` | `1.0` / `1` | build.gradle.kts |

---

## 11. Plano de testes

| **#** | **O que testar** | **Passos** | **Resultado esperado** |
| ----- | ------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ |
| T1 | Cadastrar Cliente e Pet | Adicionar tutor e animal e salvar. | Ambos aparecem vinculados na lista de clientes. |
| T2 | Criar Compromisso | Selecionar pet, serviço e data. | Aparece na agenda do dia e atualiza indicadores. |
| T3 | Testar Lembrete | Criar compromisso com lembrete ativo. | Notificação disparada no horário programado. |
| T4 | Reabrir o app | Cadastrar dados, fechar e abrir. | Todos os dados continuam disponíveis (persistência). |

---

## 12. Cronograma

| **Marco**                        | **Prazo** | **Responsável** | **Status**  |
| -------------------------------- | --------- | --------------- | ----------- |
| M1 — Canvas + repositório        | 16/09     | Grupo           | Concluído   |
| M2 — PRD aprovado                | 30/09     | Grupo           | Concluído   |
| M3 — Funcionalidade base funcional | 21/10     | Grupo           | [EM ABERTO] |
| M4 — Room completo (4 entidades) | 11/11     | Grupo           | [EM ABERTO] |
| **Entrega e apresentação final** | **10/12** | Grupo           | [EM ABERTO] |

---

## 13. Riscos

| **Risco** | **Impacto** | **Plano B** |
| --------------------------------------- | ----------- | --------------------------------------------------------------------------------------------------------------------- |
| Problemas com persistência (Room) | Alto | Simplificar os relacionamentos e testar migrações precocemente. |
| Falha nos lembretes (AlarmManager) | Médio | Validar permissões e testar em dispositivos físicos. |

---

## 14. Como vamos orientar a implementação com IA

> A implementação usa o **Gemini no Android Studio**. Este PRD é o documento que diz à IA o que construir.

**Regras que colocamos no `AGENTS.md`:**
- Respeitar rigorosamente a estrutura de pastas src/src/main/java.
- Não implementar funções fora deste PRD sem aprovação do grupo.
- Explicar o funcionamento de Flow, Room e Coroutines em cada alteração.

**Divisão do perímetro explicável:**

| **Parte do código** | **Responsável** |
| ------------------- | --------------- |
| Cliente | Thales |
| Compromisso | Abner |
| Serviço | Sara |
| Pet | Leticia |

---

## 15. Histórico de versões deste documento

| **Versão** | **Data**   | **Autor**     | **O que mudou**                                      |
| ---------- | ---------- | ------------- | ---------------------------------------------------- |
| 1.0        | 23/09/2026 | Grupo         | Estrutura inicial conforme modelo oficial. |
| 1.1        | 09/10/2026 | Grupo         | Atualização com 4 entidades e ajuste de escopo. |
