# 📄 PRD — Documento de Requisitos do Produto

> **O que é um PRD?** É o documento que responde **o quê** o app faz e **por quê** — não *como* ele é programado.
> Quem lê o PRD deve conseguir entender o app inteiro sem abrir o código.

| <br>                    | <br>                                     |
| ----------------------- | ---------------------------------------- |
| **App**                 | Planify                                  |
| **Grupo**               | STL + A                                  |
| **Autores**             | Thales, Abner, Sara e Leticia            |
| **Versão do documento** | 1.0                                      |
| **Última atualização**  | 23/09/2026                               |
| **Status**              | ( ) Rascunho (X) Em revisão ( ) Aprovado |

---

## 1. Visão do produto

**Pitch:**
O Planify ajuda empreendedores e profissionais autônomos a organizar seus clientes, horários e pagamentos em um único aplicativo, sem depender de agendas de papel, conversas espalhadas ou vários aplicativos diferentes.

**Problema:**
Pequenos empreendedores e profissionais autônomos frequentemente precisam administrar sozinhos clientes, horários, serviços e pagamentos. Essas informações podem ficar espalhadas entre WhatsApp, agendas de papel, anotações, alarmes e planilhas, causando esquecimento de compromissos, dificuldade para acompanhar pagamentos e perda de informações.

**Por que vale a pena fazer isso:**
O Planify centraliza clientes, compromissos, valores, pagamentos e lembretes em um único aplicativo, permitindo que o usuário organize seus atendimentos e acompanhe seus resultados mensais de forma simples.

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
- profissionais autônomos;
- donos de pequenos negócios locais.

**Usuário de referência:**
Ana Cláudia, dona de um salão de beleza.

**História de uso:**

> "São 19h, Ana Cláudia terminou um atendimento e precisa organizar seus compromissos. Ela abre o Planify e visualiza o resumo mensal, conferindo a quantidade de atendimentos, faturamento, clientes, média e as estatísticas do período. Em seguida, acessa os compromissos e adiciona um novo atendimento informando o cliente, horário, valor e status do pagamento. Ao finalizar, o compromisso fica registrado no mês e o lembrete pode ser programado para uma hora antes do atendimento."

---

## 3. Objetivos e não-objetivos

**Objetivos desta versão (v1.0):**

1. Permitir o cadastro e consulta de clientes.
2. Permitir a criação, edição, exclusão e acompanhamento de compromissos vinculados a clientes.
3. Permitir o registro de valores, pagamentos e lembretes dos compromissos.
4. Apresentar um resumo mensal com indicadores e estatísticas dos atendimentos.

**Não-objetivos (fora do escopo):**

- ❌ Login e cadastro de contas.
- ❌ Sincronização em nuvem ou múltiplos dispositivos.
- ❌ Pagamentos online.
- ❌ Chat ou comunicação com clientes.
- ❌ Mapa ou localização.
- ❌ Notificações push por servidor.
- ❌ Backup automático.
- ❌ Recorrência automática de compromissos.

---

## 4. Requisitos funcionais

| **ID** | **História de usuário**                                                                                             | **Critério de aceite**                                                                                                                                                               | **Prioridade** |
| ------ | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | -------------- |
| RF01   | Como usuário, quero visualizar um resumo dos meus compromissos e resultados do mês para acompanhar minha atividade. | Ao abrir a tela principal, o mês selecionado apresenta os compromissos registrados, os indicadores de atendimentos, faturamento, clientes e média, além das estatísticas do período. | Must           |
| RF02   | Como usuário, quero adicionar um compromisso vinculado a um cliente para registrar um atendimento ou atividade.     | O usuário deve selecionar um cliente, preencher os campos obrigatórios e confirmar para salvar o compromisso. O compromisso passa a aparecer nos compromissos do mês correspondente. | Must           |
| RF03   | Como usuário, quero cadastrar clientes para reutilizar seus dados nos compromissos.                                 | Ao cadastrar nome e telefone e confirmar, o cliente aparece na lista de clientes e pode ser associado a um compromisso.                                                              | Must           |
| RF04   | Como usuário, quero editar um compromisso para corrigir ou atualizar suas informações.                              | Ao selecionar um compromisso e tocar em editar, os dados podem ser alterados e, após salvar, as informações atualizadas ficam disponíveis.                                           | Must           |
| RF05   | Como usuário, quero excluir um compromisso para removê-lo do aplicativo.                                            | Ao selecionar um compromisso e confirmar a exclusão, ele deixa de aparecer nos registros do mês.                                                                                     | Must           |
| RF06   | Como usuário, quero marcar um compromisso como concluído para indicar que o atendimento foi finalizado.             | Ao marcar um compromisso como concluído, seu status é atualizado e permanece salvo.                                                                                                  | Must           |
| RF07   | Como usuário, quero informar o valor e o status do pagamento de um compromisso para acompanhar meus recebimentos.   | Ao cadastrar ou editar um compromisso, o usuário pode informar o valor e selecionar entre "Pago" e "Pendente".                                                                       | Must           |
| RF08   | Como usuário, quero ativar um lembrete para ser avisado antes de um compromisso.                                    | Ao ativar o lembrete, o aplicativo agenda uma notificação para uma hora antes do horário do compromisso.                                                                             | Should         |
| RF09   | Como usuário, quero excluir um cliente para remover um cadastro que não utilizo mais.                               | Ao confirmar a exclusão, o cliente e seus compromissos vinculados são removidos do aplicativo.                                                                                       | Should         |
| RF10   | Como usuário, quero adicionar observações ao compromisso para registrar informações adicionais.                     | Ao salvar uma observação, ela fica disponível nos detalhes do compromisso.                                                                                                           | Could          |

### Definição dos indicadores do resumo mensal

- **Atendimentos:** quantidade de compromissos registrados no mês.
- **Faturamento:** soma dos valores dos compromissos registrados no mês.
- **Clientes:** quantidade de clientes únicos atendidos no mês.
- **Média:** faturamento dividido pela quantidade de atendimentos do mês.
- **Total de horas trabalhadas:** soma da duração dos compromissos que possuem horário inicial e final informados.
- **Total de clientes atendidos:** corresponde à quantidade de clientes únicos atendidos no mês.
- **Gráfico:** apresenta a distribuição dos atendimentos ao longo dos dias da semana, com eixo vertical de 0 a 100 e eixo horizontal de segunda-feira a domingo.

---

## 5. Requisitos não funcionais

| **ID** | **Requisito**                                                                                                                   | **Como será verificado**                                                        |
| ------ | ------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------- |
| RNF01  | O app não pode fechar sozinho durante o uso normal.                                                                             | 5 minutos de uso contínuo sem crash, em 2 celulares diferentes.                 |
| RNF02  | Toda operação que pode falhar deverá possuir tratamento de exceção adequado.                                                    | Revisão do código, principalmente nas operações de banco e entradas do usuário. |
| RNF03  | Nenhuma falha deverá mostrar tela branca ou fechar o app sem informação ao usuário.                                             | Testes de falha da seção 9.                                                     |
| RNF04  | O app deverá rodar a partir do Android [EM ABERTO].                                                                             | Instalação em dispositivo real compatível.                                      |
| RNF05  | Os textos visíveis do aplicativo deverão ficar centralizados nos recursos de texto do Android.                                  | Revisão do código.                                                              |
| RNF06  | O projeto deverá possuir organização de código que permita que qualquer integrante localize as principais partes do aplicativo. | Revisão do projeto pelos integrantes.                                           |
| RNF07  | Os dados cadastrados deverão permanecer disponíveis após fechar e abrir novamente o aplicativo.                                 | Cadastrar dados, fechar o app, abrir novamente e verificar os dados.            |
| RNF08  | O aplicativo deverá funcionar sem depender de conexão com a internet.                                                           | Testar as principais funcionalidades com o dispositivo em modo avião.           |

---

## 6. Telas e navegação

**Mapa de navegação:**

```text
[Tela Principal — Resumo Mensal]
        │
        ├── navega entre os meses
        │
        ├── visualiza visão geral do mês
        │       ├── Atendimentos
        │       ├── Faturamento
        │       ├── Clientes
        │       └── Média por atendimento
        │
        ├── visualiza estatísticas
        │       ├── gráfico de atendimentos por dia da semana
        │       ├── total de horas trabalhadas
        │       └── total de clientes atendidos
        │
        ├── acessa um compromisso → [Detalhes do Compromisso]
        │                                      │
        │                                      ├── Editar
        │                                      └── Excluir
        │
        └── acessa Clientes → [Lista de Clientes]
                                      │
                                      └── Adicionar → [Cadastro de Cliente]
```
| **Tela**                | **O que mostra**                                                                                                              | **Ações disponíveis**                                                                 |
| ----------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| Principal               | Resumo mensal, atendimentos, faturamento, clientes, média, gráfico por dia da semana, horas trabalhadas e clientes atendidos. | Navegar entre meses, visualizar estatísticas, acessar compromisso e acessar clientes. |
| Cadastro de Compromisso | Cliente, descrição, data, horário, valor, pagamento, observações e lembrete.                                                  | Selecionar cliente, preencher dados e salvar.                                         |
| Detalhe do Compromisso  | Todas as informações do compromisso, incluindo o cliente relacionado.                                                         | Editar, excluir e marcar como concluído.                                              |
| Lista de Clientes       | Clientes cadastrados com nome e telefone.                                                                                     | Visualizar, adicionar e excluir cliente.                                              |
| Cadastro de Cliente     | Nome, telefone e observações.                                                                                                 | Preencher dados e salvar.                                                             |

**Estado vazio da tela principal:**

> "Nenhum compromisso registrado neste mês."

**Rascunhos das telas:**

- docs/telas/01-principal.png
- docs/telas/02-compromisso.png
- docs/telas/03-detalhe-compromisso.png
- docs/telas/04-clientes.png
- docs/telas/05-cadastro-cliente.png

---

## 7. Dados

### Entidade principal: `Compromisso`

| **Campo**            | **Tipo**   | **Obrigatório** | **Observação**                                            |
| -------------------- | ---------- | --------------- | --------------------------------------------------------- |
| id                   | Long       | sim             | Chave primária, autogerada.                               |
| clienteId            | Long       | sim             | Referência obrigatória ao cliente relacionado.            |
| descricao            | String     | sim             | Nome ou descrição do compromisso.                         |
| data                 | LocalDate  | sim             | Data do compromisso.                                      |
| horarioInicio        | LocalTime  | sim             | Horário inicial.                                          |
| horarioFim           | LocalTime? | não             | Horário final, quando informado.                          |
| observacoes          | String?    | não             | Informações adicionais.                                   |
| valor                | Double     | sim             | Valor do serviço em reais.                                |
| statusPagamento      | String     | sim             | "Pago" ou "Pendente".                                     |
| statusCompromisso    | String     | sim             | "Pendente", "Em andamento", "Concluído" ou "Cancelado".   |
| lembreteAtivo        | Boolean    | não             | Indica se existe lembrete.                                |
| antecedenciaLembrete | Int?       | não             | Definida como 60 minutos quando o lembrete estiver ativo. |

### Entidade: `Cliente`

| **Campo**   | **Tipo** | **Obrigatório** | **Observação**                          |
| ----------- | -------- | --------------- | --------------------------------------- |
| id          | Long     | sim             | Chave primária, autogerada.             |
| nome        | String   | sim             | Nome do cliente.                        |
| telefone    | String   | sim             | Telefone para contato.                  |
| observacoes | String?  | não             | Informações adicionais sobre o cliente. |

**Operações necessárias para `Compromisso`:**

- (X) inserir
- (X) listar
- (X) atualizar
- (X) excluir

**Operações necessárias para `Cliente`:**

- (X) inserir
- (X) listar
- (X) atualizar
- (X) excluir

### Relacionamento

Um cliente poderá possuir vários compromissos.
Todo compromisso deverá estar obrigatoriamente vinculado a um cliente.
Ao excluir um cliente, os compromissos vinculados a ele também serão excluídos no MVP, após confirmação do usuário.

### Rede

O MVP não utilizará API externa.
Retrofit + Gson poderão permanecer configurados na infraestrutura inicial do projeto, conforme orientação do projeto, mas não serão necessários para as funcionalidades da primeira versão.

---

## 8. Arquitetura e tecnologias

| **Item**               | **Escolha**                                                                            |
| ---------------------- | -------------------------------------------------------------------------------------- |
| Linguagem              | Kotlin                                                                                 |
| Interface              | (X) Jetpack Compose ( ) XML/Views                                                      |
| Persistência           | (X) Room ( ) —                                                                         |
| Rede                   | ( ) Retrofit (X) —                                                                     |
| Outras bibliotecas     | Material 3, Navigation Compose, KSP, Kotlin Coroutines, Flow, ViewModel e AlarmManager |
| `minSdk` / `targetSdk` | 24 (Android 7.0 - Nougat) / 35 (Android 15)                                            |

**Organização de pastas do projeto:**
app/src/main/java/br/edu/ifpe/planify/
├── ui/
│   ├── theme/
│   ├── navigation/
│   └── features/
├── data/
│   ├── local/
│   └── repository/
├── model/
└── MainActivity.kt

**Persistência:**
Os dados serão armazenados localmente utilizando Room Database.
**Lembretes:**
Os lembretes serão realizados localmente pelo dispositivo utilizando AlarmManager. O aplicativo não dependerá de servidor externo para enviar notificações.

---

## 9. Tratamento de erros

| **Situação de falha**       | **O que o app faz**                                       | **Mensagem para o usuário**                                                   |
| --------------------------- | --------------------------------------------------------- | ----------------------------------------------------------------------------- |
| Lista vazia                 | Mantém a tela normalmente e apresenta o estado vazio.     | "Nenhum compromisso registrado neste mês."                                    |
| Campo obrigatório em branco | Impede o salvamento e destaca os campos necessários.      | "Preencha os campos obrigatórios antes de salvar."                            |
| Cliente não selecionado     | Impede o salvamento do compromisso.                       | "Selecione um cliente antes de salvar."                                       |
| Horário não preenchido      | Impede o salvamento do compromisso.                       | "Preencha o horário do compromisso antes de salvar."                          |
| Valor inválido              | Impede o salvamento e solicita correção.                  | "Informe um valor válido."                                                    |
| Erro ao salvar no banco     | Mantém o usuário na tela e informa a falha.               | "Não foi possível salvar os dados. Tente novamente."                          |
| Erro ao carregar dados      | Mantém a tela e informa a falha.                          | "Não foi possível carregar os dados."                                         |
| Erro ao excluir             | Mantém o item e informa a falha.                          | "Não foi possível excluir. Tente novamente."                                  |
| Falha ao agendar lembrete   | Mantém o compromisso salvo e informa a falha no lembrete. | "Não foi possível ativar o lembrete. Verifique as permissões de notificação." |
| Confirmação de exclusão     | Apresenta uma caixa de confirmação antes da exclusão.     | "Tem certeza que deseja excluir?"                                             |

Como o MVP não utiliza internet, situações de API fora do ar ou falta de conexão não se aplicam às funcionalidades principais.

---

## 10. Identidade visual e publicação

| **Item**                      | **Definição**          | **Onde fica**      |
| ----------------------------- | ---------------------- | ------------------ |
| Nome do app                   | Planify                | strings.xml        |
| Cor principal                 | Azul-marinho — #010736 | Color.kt           |
| Cor secundária                | [EM ABERTO]            | Color.kt           |
| Ícone 512×512                 | Logo do Planify        | loja/icone-512.png |
| applicationId                 | br.edu.ifpe.planify    | build.gradle.kts   |
| `versionName` / `versionCode` | `1.0` / `1`            | build.gradle.kts   |

**Estilo visual previsto:**

- moderno;
- simples;
- minimalista;
- fundo claro;
- azul-marinho como cor principal;
- cards para apresentação dos compromissos;
- ícones simples;
- poucos elementos por tela.

**Material da loja:**

| **Artefato**          | **Limite**    | **Conteúdo**                    |
| --------------------- | ------------- | ------------------------------- |
| Título                | 30 caracteres | Planify                         |
| Descrição curta       | 80 caracteres | [EM ABERTO]                     |
| Descrição completa    | —             | Escrever em `loja/descricao.md` |
| Imagem de destaque    | 1024×500      | loja/destaque-1024x500.png      |
| Screenshots           | mín. 2        | loja/screenshots/               |
| Esboço de privacidade | —             | loja/privacidade.md             |
| Arquivo `.aab`        | —             | loja/app-release.aab            |

**Privacidade:**
O MVP não terá conta de usuário nem servidor externo. Os dados de clientes e compromissos serão armazenados localmente no dispositivo.

---

## 11. Plano de testes

| **#** | **O que testar**                | **Passos**                                                                | **Resultado esperado**                                                                     | **OK?** |
| ----- | ------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------ | ------- |
| T1    | Abrir o app pela primeira vez   | Instalar e abrir                                                          | Tela principal apresenta o resumo mensal e, sem compromissos, mostra o estado vazio.       | <br>    |
| T2    | Navegar entre meses             | Utilizar os controles de navegação da tela principal.                     | O mês exibido é alterado e os dados apresentados correspondem ao mês selecionado.          | <br>    |
| T3    | Cadastrar cliente               | Abrir Clientes, adicionar cliente, preencher dados e salvar.              | Cliente aparece na lista.                                                                  | <br>    |
| T4    | Criar compromisso               | Adicionar compromisso, selecionar cliente, preencher os dados e salvar.   | Compromisso aparece nos registros do mês correspondente.                                   | <br>    |
| T5    | Impedir compromisso sem cliente | Tentar salvar um compromisso sem selecionar cliente.                      | Salvamento é impedido e uma mensagem é apresentada.                                        | <br>    |
| T6    | Editar compromisso              | Abrir um compromisso, alterar um dado e salvar.                           | Informação atualizada aparece nos dados do compromisso e nos indicadores quando aplicável. | <br>    |
| T7    | Excluir compromisso             | Abrir um compromisso, selecionar excluir e confirmar.                     | Compromisso deixa de aparecer nos registros do mês.                                        | <br>    |
| T8    | Marcar como concluído           | Abrir compromisso e alterar o status.                                     | Status passa para "Concluído".                                                             | <br>    |
| T9    | Testar pagamento                | Criar compromisso e selecionar "Pago" ou "Pendente".                      | Status selecionado permanece salvo.                                                        | <br>    |
| T10   | Testar lembrete                 | Criar compromisso com lembrete ativo.                                     | Notificação é apresentada no horário programado.                                           | <br>    |
| T11   | Testar indicadores mensais      | Criar diferentes compromissos no mesmo mês.                               | Atendimentos, faturamento, clientes e média são calculados corretamente.                   | <br>    |
| T12   | Testar estatísticas             | Criar compromissos em diferentes dias da semana e com horários definidos. | Gráfico, total de horas e clientes atendidos apresentam os dados correspondentes.          | <br>    |
| T13   | Reabrir o app                   | Cadastrar dados, fechar e abrir novamente.                                | Dados continuam disponíveis.                                                               | <br>    |
| T14   | Falha de banco                  | Provocar uma situação de erro durante uma operação de banco.              | Aplicativo não fecha e apresenta mensagem clara.                                           | <br>    |
| T15   | Campos obrigatórios             | Tentar salvar sem preencher campos obrigatórios.                          | Salvamento é impedido e mensagem é apresentada.                                            | <br>    |
| T16   | Teste com usuário externo       | Pessoa de fora do grupo utiliza o aplicativo sem explicação.              | Consegue realizar a ação principal.                                                        | <br>    |

**Testado em:**
[EM ABERTO] Informar modelo dos celulares e versão do Android utilizados nos testes.

---

## 12. Cronograma

| **Marco**                        | **Prazo** | **Responsável** | **Status**  |
| -------------------------------- | --------- | --------------- | ----------- |
| M1 — Canvas + repositório        | 16/09     | Grupo           | Concluído   |
| M2 — PRD aprovado + telas        | 30/09     | Grupo           | Concluído   |
| M3 — Funcionalidade base         | 21/10     | Grupo           | [EM ABERTO] |
| M4 — Dados e erros tratados      | 11/11     | Grupo           | [EM ABERTO] |
| M5 — Identidade + `.apk` testado | 25/11     | Grupo           | [EM ABERTO] |
| M6 — `.aab` + loja + README      | 02/12     | Grupo           | [EM ABERTO] |
| **Entrega e apresentação**       | **10/12** | Grupo           | [EM ABERTO] |

---

## 13. Riscos

| **Risco**                                            | **Impacto** | **Plano B**                                                                                                           |
| ---------------------------------------------------- | ----------- | --------------------------------------------------------------------------------------------------------------------- |
| Integrante fica sem computador                       | Médio       | Reorganizar temporariamente as tarefas entre os integrantes e utilizar outro equipamento disponível.                  |
| Problemas com Room ou persistência                   | Alto        | Simplificar as operações de banco e revisar a implementação com testes isolados.                                      |
| Problemas na implementação dos lembretes             | Médio       | Implementar primeiro o cadastro e gerenciamento dos compromissos e deixar o lembrete para uma etapa posterior do MVP. |
| Dificuldade de integração entre as partes do projeto | Alto        | Manter a estrutura de pastas e responsabilidades definidas e integrar as funcionalidades gradualmente.                |
| Prazo insuficiente para funcionalidades adicionais   | Médio       | Priorizar os requisitos classificados como Must e deixar os requisitos Could para depois.                             |

---

## 14. Como vamos orientar a implementação com IA

A implementação usa o **Gemini no Android Studio**. Este PRD é o documento que diz à IA o que construir. Quanto mais preciso ele estiver, menos a IA deverá inventar funcionalidades ou estruturas que não foram definidas pelo grupo.
**Recursos que vamos usar:**

- (X) Chat
- (X) Agent Mode
- (X) Explain Code
- (X) Ask Gemini no Logcat
- (X) Generate Unit Tests
- (X) Transform UI

**Regras que colocamos no `AGENTS.md`:**

- Não criar funcionalidades que não estejam definidas no PRD sem autorização do grupo.
- Explicar alterações importantes antes de modificar partes estruturais do projeto.
- Manter a arquitetura, organização de pastas e tecnologias definidas pelo grupo.
- Priorizar código simples e compatível com o nível de conhecimento dos integrantes.
- Não substituir uma tecnologia ou biblioteca definida no PRD sem justificar a alteração.
- Testar as funcionalidades antes de considerar uma tarefa concluída.

**Divisão do perímetro explicável — quem responde por explicar o quê na apresentação:**

| **Parte do código**                             | **Responsável** |
| ----------------------------------------------- | --------------- |
| Telas (`ui/`)                                   | Thales          |
| Dados (`data/`)                                 | Abner           |
| Identidade visual e recursos                    | Sara            |
| Build, testes, documentação e artefatos de loja | Leticia         |

Todos os integrantes poderão contribuir com código. A divisão representa principalmente a responsabilidade de acompanhamento e explicação de cada área.
**Decisões que o grupo tomou contra a sugestão da IA:**

- Paleta de cores proposta. 

---

## 15. Histórico de versões deste documento

| **Versão** | **Data**   | **Autor**     | **O que mudou**                                      |
| ---------- | ---------- | ------------- | ---------------------------------------------------- |
| 1.0        | 23/09/2026 | Grupo STL + A | Estrutura inicial do PRD adaptada ao modelo oficial. |
| <br>       | <br>       | <br>          | <br>                                                 |
