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
