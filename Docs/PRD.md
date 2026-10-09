# 📄 PRD — Documento de Requisitos do Produto

> **O que é um PRD?** É o documento que responde **o quê** o app faz e **por quê** — não *como* ele é programado.
> Quem lê o PRD deve conseguir entender o app inteiro sem abrir o código.

| <br>                    | <br>                                     |
| ----------------------- | ---------------------------------------- |
| **App**                 | Planify                                  |
| **Grupo**               | STL + A (Grupo 01)                       |
| **Autores**             | Thales, Abner, Sara e Letícia            |
| **Versão do documento** | 1.2                                      |
| **Última atualização**  | 09/10/2026                               |
| **Status**              | ( ) Rascunho (X) Em revisão ( ) Aprovado |

---

## 1. Visão do produto

**Pitch:**
O Planify ajuda empreendedores e profissionais autônomos a organizar seus clientes, serviços, horários e resultados financeiros em um único aplicativo, sem depender de agendas de papel, conversas espalhadas ou vários aplicativos diferentes.

**Problema:**
Pequenos empreendedores e profissionais autônomos frequentemente precisam administrar sozinhos clientes, horários, serviços e valores recebidos. Essas informações ficam espalhadas entre WhatsApp, agendas de papel, anotações e alarmes genéricos, causando esquecimento de compromissos, horários sobrepostos e dificuldade para acompanhar quanto realmente foi recebido no mês.

**Por que vale a pena fazer isso:**
O Planify centraliza clientes, serviços, compromissos, valores e lembretes em um único aplicativo, permitindo que o usuário organize sua agenda e acompanhe seu faturamento de forma simples e eficiente, utilizando a persistência local (Room) para garantir o funcionamento offline.

---

## 2. Público e cenário de uso

**Usuário-alvo:**
Pequenos empreendedores e profissionais autônomos, principalmente pessoas entre 25 e 45 anos que atendem clientes ou administram compromissos por conta própria, sem equipe administrativa.

**Exemplos:**
- cabeleireiros;
- manicures;
- barbeiros;
- personal trainers;
- consultores;
- prestadores de serviços em geral;
- donos de pequenos negócios locais.

**Usuário de referência:**
Ana Cláudia, dona de um salão de beleza.

**História de uso:**
> "São 19h, Ana Cláudia terminou um atendimento e precisa organizar seus compromissos. Ela abre o Planify e visualiza o resumo do mês, conferindo a quantidade de atendimentos e o faturamento acumulado. Em seguida, acessa a área de clientes e cadastra um novo cliente que acabou de agendar. Ela então seleciona um serviço do catálogo (ex: Corte de Cabelo) e adiciona um novo compromisso informando o horário e o valor acertado. Ao finalizar, o compromisso fica registrado na agenda e um lembrete automático é programado para avisá-la minutos antes do atendimento."

---

## 3. Objetivos e não-objetivos

**Objetivos desta versão (v1.0):**
1. Permitir o cadastro e consulta de clientes para facilitar o contato.
2. Permitir a gestão de um catálogo de serviços com nomes e preços definidos.
3. Permitir a criação, edição, exclusão e acompanhamento de compromissos vinculando cliente e serviço.
4. Permitir o registro de valores e lembretes automáticos para cada compromisso.
5. Apresentar um resumo mensal com indicadores de faturamento e quantidade de atendimentos.

**Não-objetivos (fora do escopo):**
- ❌ Sincronização em nuvem ou múltiplos dispositivos.
- ❌ Pagamentos online reais (apenas registro de valor recebido).
- ❌ Chat ou comunicação direta com clientes via app.
- ❌ Mapa ou geolocalização.

---

## 4. Requisitos funcionais

| **ID** | **História de usuário** | **Critério de aceite** | **Prioridade** |
| ------ | ----------------------- | ---------------------- | -------------- |
| RF01   | Como usuário, quero visualizar um resumo dos meus compromissos e resultados financeiros. | Ao abrir a tela principal, o mês selecionado apresenta os compromissos registrados e indicadores de faturamento total. | Must |
| RF02   | Como usuário, quero cadastrar clientes para ter seus contatos organizados. | Ao salvar nome e telefone, o cliente aparece na lista e pode ser selecionado ao criar um compromisso. | Must |
| RF03   | Como usuário, quero gerenciar um catálogo de serviços e preços. | Possibilidade de cadastrar serviços com nome e valor padrão para uso rápido nos agendamentos. | Must |
| RF04   | Como usuário, quero adicionar um compromisso vinculado a um cliente e serviço. | O usuário preenche os campos, vincula o Cliente e o Serviço, e o item aparece na agenda do dia correspondente. | Must |
| RF05   | Como usuário, quero editar ou excluir registros para manter os dados atualizados. | Possibilidade de alterar ou remover qualquer cadastro de cliente, serviço ou compromisso. | Must |
| RF06   | Como usuário, quero ativar lembretes automáticos para não perder horários. | O aplicativo deve disparar uma notificação local com antecedência pré-definida antes do compromisso. | Should |
| RF07   | Como usuário, quero adicionar observações aos compromissos. | Campo de texto livre para detalhes adicionais sobre o atendimento realizado. | Could |

---

## 5. Requisitos não funcionais

| **ID** | **Requisito** | **Como será verificado** |
| ------ | ------------- | ------------------------ |
| RNF01  | O app não pode fechar sozinho durante o uso normal. | Teste de 5 minutos de uso contínuo sem crash em dispositivo real. |
| RNF02  | Persistência de dados offline via Room Database. | Os dados devem permanecer salvos após fechar e abrir o aplicativo novamente. |
| RNF03  | Toda operação que pode falhar deverá possuir tratamento de exceção (try/catch). | Revisão do código e testes provocando erros de entrada de dados. |
| RNF04  | O app deverá rodar a partir do Android 7.0 (API 24). | Instalação em dispositivo real compatível. |
| RNF05  | O projeto deverá estar organizado na pasta src/ conforme solicitado. | Verificação da estrutura de diretórios no repositório. |

---

## 6. Telas e navegação

**Mapa de navegação:**
```text
[Tela Principal — Agenda e Resumo Mensal]
        │
        ├── Acessa Clientes → [Lista de Clientes]
        │       └── Adicionar → [Cadastro de Cliente]
        │
        ├── Acessa Serviços → [Catálogo de Serviços]
        │       └── Adicionar → [Cadastro de Serviço]
        │
        └── Novo Agendamento → [Formulário de Compromisso]
```

| **Tela** | **O que mostra** | **Ações disponíveis** |
| ----------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| Principal (Home) | Resumo do faturamento mensal e lista de compromissos do dia. | Navegar entre datas, visualizar detalhes, excluir compromisso. |
| Cadastro de Cliente | Campos para inserção de nome, telefone e observações. | Preencher dados e salvar no banco local. |
| Catálogo de Serviços | Lista de serviços cadastrados e seus respectivos preços. | Adicionar, editar ou excluir serviços do catálogo. |
| Formulário de Compromisso| Seleção de Cliente, Serviço, Data e Hora do atendimento. | Vincular as entidades, definir horário e salvar. |

**Estado vazio da tela principal:**
> "Nenhum compromisso registrado para este dia."

---

## 7. Dados

### Entidade: `Cliente`
| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| nome | String | sim | Nome completo do cliente. |
| telefone | String | sim | Contato principal. |

### Entidade: `Servico`
| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| nome | String | sim | Nome do serviço prestado. |
| preco | Double | sim | Valor base cobrado pelo serviço. |

### Entidade: `Compromisso`
| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| clienteId | Long | sim | FK vinculando ao cliente atendido. |
| servicoId | Long | sim | FK vinculando ao serviço realizado. |
| dataHora | Long | sim | Data e Hora do atendimento (Timestamp). |
| valorCobrado| Double | sim | Valor final registrado para este agendamento. |

### Entidade: `Lembrete`
| **Campo** | **Tipo** | **Obrigatório** | **Observação** |
| --------- | -------- | --------------- | -------------- |
| id | Long | sim | Chave primária (PK), autogerada. |
| compromissoId| Long | sim | FK vinculando ao compromisso específico. |
| antecedencia | Int | sim | Minutos de antecedência da notificação. |
| ativo | Boolean | sim | Define se o lembrete será disparado. |

---

## 8. Arquitetura e tecnologias

| **Item** | **Escolha** |
| ---------------------- | -------------------------------------------------------------------------------------- |
| Linguagem | Kotlin |
| Interface | (X) Jetpack Compose |
| Persistência | (X) Room Database |
| Outras bibliotecas | Material 3, Navigation Compose, Coroutines, Flow, AlarmManager |
| `minSdk` / `targetSdk` | 24 (Android 7.0) / 35 (Android 15) |

---

## 9. Tratamento de erros

| **Situação de falha** | **O que o app faz** | **Mensagem para o usuário** |
| --------------------------- | --------------------------------------------------------- | ----------------------------------------------------------------------------- |
| Campo obrigatório vazio | Impede o salvamento e sinaliza o campo. | "Preencha os campos obrigatórios antes de salvar." |
| Erro ao salvar no banco | Mantém o usuário na tela de edição e informa a falha. | "Não foi possível salvar os dados. Tente novamente." |
| Falha ao agendar lembrete | Salva o compromisso, mas informa falha na notificação. | "Agendamento salvo, mas o lembrete não pôde ser ativado." |
| Confirmação de exclusão | Apresenta um diálogo de confirmação antes de remover. | "Tem certeza que deseja excluir este registro?" |

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
| T1 | Cadastrar Cliente | Adicionar nome e telefone e salvar. | O cliente aparece na lista de clientes cadastrados. |
| T2 | Criar Compromisso | Selecionar cliente, serviço e data e salvar. | O item aparece na agenda e atualiza o resumo do mês. |
| T3 | Testar Lembrete | Criar compromisso com lembrete para 1h antes. | Notificação do sistema aparece no celular no horário correto. |
| T4 | Persistência de Dados | Fechar o app após cadastrar dados e abrir novamente. | Todos os dados continuam disponíveis (salvos no Room). |

---

## 12. Cronograma

| **Marco** | **Prazo** | **Responsável** | **Status** |
| -------------------------------- | --------- | --------------- | ----------- |
| M1 — Canvas + repositório | 16/09 | Grupo | Concluído |
| M2 — PRD aprovado | 30/09 | Grupo | Concluído |
| M3 — Funcionalidade base | 21/10 | Grupo | [EM ABERTO] |
| **Entrega Final** | **10/12** | Grupo | [EM ABERTO] |

---

## 13. Riscos

| **Risco** | **Impacto** | **Plano B** |
| --------------------------------------- | ----------- | --------------------------------------------------------------------------------------------------------------------- |
| Problemas com persistência (Room) | Alto | Testar esquemas de banco isoladamente e simplificar relacionamentos se necessário. |
| Falha nos lembretes (AlarmManager) | Médio | Validar permissões de notificação e testar em dispositivos físicos. |

---

## 14. Como vamos orientar a implementação com IA

> A implementação usa o **Gemini no Android Studio**. Este PRD é o documento que diz à IA o que construir.

**Regras que colocamos no `AGENTS.md`:**
- Respeitar rigorosamente a estrutura de pastas `src/src/main/java`.
- Não implementar funções fora deste PRD sem aprovação expressa do grupo.
- Explicar o funcionamento de Flow, Room e Coroutines em cada alteração de código.

**Divisão do perímetro explicável:**

| **Parte do código** | **Responsável** |
| ------------------- | --------------- |
| Cliente | Thales |
| Compromisso | Abner |
| Serviço | Sara |
| Lembrete | Letícia |

---

## 15. Histórico de versões deste documento

| **Versão** | **Data**   | **Autor**     | **O que mudou**                                      |
| ---------- | ---------- | ------------- | ---------------------------------------------------- |
| 1.0        | 23/09/2026 | Grupo         | Estrutura inicial conforme modelo oficial. |
| 1.1        | 09/10/2026 | Grupo         | Ajuste de entidades e escopo geral. |
| 1.2        | 09/10/2026 | Grupo         | Remoção total do contexto de Pet Shop e alinhamento com 4 entidades oficiais. |
