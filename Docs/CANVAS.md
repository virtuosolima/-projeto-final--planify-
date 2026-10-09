# 🎯 Canvas do Projeto Final — App Android

| | |
|---|---|
| **Grupo nº** | 01 |
| **Integrantes (3 a 4)** | Thales, Abner, Sara e Leticia |
| **Turma** | 3º ano — Ensino Médio |
| **Repositório** | `https://github.com/virtuosolima/-projeto-final--planify-` |
| **Data de preenchimento** | 09/09/2026 |
| **Entrega final** | **10/12/2026** |

---

## 🧩 Bloco 1 — Nome e pitch do app

**Nome do app:** Planify

**Pitch em uma frase:**
> "O [Planify] ajuda [pequenos empreendedores e autônomos] a [organizar seus clientes, pets, serviços e compromissos] sem precisar de [agendas de papel ou vários apps soltos]."

---

## 😖 Bloco 2 — Problema

Qual dor real vocês estão resolvendo? Descrevam uma situação concreta que alguém vive hoje.
- Muitos pequenos empreendedores (donos de salão, loja, prestadores de serviço autônomo, etc.) cuidam sozinhos de vários compromissos ao mesmo tempo: atendimento a clientes, reuniões com fornecedores, horários de entrega, e tarefas pessoais. Como não têm uma secretária ou sistema de agenda profissional, esses horários ficam espalhados entre WhatsApp, papel, cabeça e lembretes soltos no celular. O resultado: compromissos esquecidos, horários que se sobrepõem (marcar dois clientes no mesmo horário, por exemplo), e tempo perdido tentando lembrar o que precisa ser feito no dia. No contexto de petshops, esse problema é agravado pela dificuldade de gerenciar o histórico de cada Pet vinculado ao seu respectivo Cliente.


**Como esse problema é resolvido hoje (sem o app)?**

- Hoje, esse problema costuma ser resolvido de formas improvisadas e pouco confiáveis. Muitos empreendedores anotam seus compromissos em cadernos ou agendas de papel, o que funciona até certo ponto, mas não oferece nenhum tipo de aviso ou lembrete automático. Outros acabam deixando a própria conversa no WhatsApp virar uma espécie de agenda, com lembretes soltos misturados ao atendimento do cliente, o que facilita perder informações importantes no meio da rotina. Também é comum recorrer a alarmes e lembretes genéricos no celular, que avisam sobre um horário, mas sem contexto nenhum sobre o compromisso em si. Algumas pessoas tentam organizar tudo em planilhas simples no Excel ou Google Sheets, mas isso exige atualização manual constante e não gera nenhum tipo de aviso quando um horário está se aproximando. E, no fim das contas, muita gente ainda depende só da própria memória — o famoso "vou lembrar" — que falha justamente quando a rotina fica mais corrida e cheia de compromissos.


---

## 👥 Bloco 3 — Público-alvo

Para quem é o app? Sejam específicos (idade, contexto, com que frequência usariam).

- **Perfil principal:** Pequenos empreendedores e autônomos, entre 25 e 45 anos, que atendem clientes ou gerenciam compromissos por conta própria e não têm equipe administrativa — como cabeleireiros, personal trainers, consultores, prestadores de serviço em geral, donos de petshops e negócios locais. 
- **Quando/onde usam:** Usam o app diariamente, principalmente pela manhã (para revisar os compromissos do dia) e ao longo do dia sempre que um novo horário é marcado ou remarcado — seja no próprio local de trabalho, entre atendimentos, ou em qualquer lugar pelo celular, já que a rotina dessas pessoas raramente é em frente a um computador. 
- **Uma pessoa real que testaria o app:**  Ana Cláudia — mãe da aluna Letícia Gabriela, possui um salão de beleza. 


---

## 💡 Bloco 4 — Solução em uma tela

Descreva o que a **tela principal** mostra e o que o usuário consegue fazer nela.

- **A tela principal lista:** os compromissos organizados por data, com foco no dia atual por padrão (podendo o usuário navegar para dias anteriores ou futuros, por exemplo por um calendário ou setas de navegação). Para cada compromisso, a lista exibe: o horário de início, o Nome do Pet, o Serviço (ex: Banho), o nome do Cliente e um indicador visual de status de pagamento (Pago ou Pendente). Os compromissos aparecem ordenados cronologicamente, do mais cedo para o mais tarde, e os que já passaram do horário (e não foram marcados como concluídos) ficam visualmente diferenciados — por exemplo, em cinza ou com um aviso de atraso. Se não houver nenhum compromisso cadastrado para o dia selecionado, a tela mostra uma mensagem simples incentivando o usuário a adicionar o primeiro compromisso.

- **A ação principal do usuário é:** adicionar um novo compromisso preenchendo um formulário que vincula: o Cliente, o Pet (vinculado ao cliente), o Serviço (do catálogo), a data e o horário.
- **Depois de agir, o usuário vê:** o retorno automático para a tela principal, onde o novo compromisso já aparece na posição correta da lista, ordenado por horário. Caso o lembrete tenha sido ativado, o sistema agenda a notificação local automaticamente, sem exigir nenhuma ação extra do usuário.

---

## ✅ Bloco 5 — Funcionalidades do MVP

Máximo de **4 funcionalidades**. Se tiver mais, corte. Lembre: *qualidade acima de complexidade*.

| # | Funcionalidade | Essencial? | Quem faz |
|---|---|---|---|
| F1 | Gestão de Clientes e Pets (Cadastro e vínculo) | Sim | Thales (Cliente) / Leticia (Pet) |
| F2 | Catálogo de Serviços com preços pré-definidos | Sim | Sara (Servico) |
| F3 | Agendamento de Compromissos vinculando Pet e Serviço | Sim | Abner (Compromisso) |
| F4 | Lembrete automático e Status de Pagamento | Sim | Todos |

---

## 🚫 Bloco 6 — Fora do escopo

O que o app ** não** vai fazer nesta entrega. Escrever isso aqui protege vocês de perder o prazo.

- ❌ Login/cadastro de usuário e múltiplas contas — o app funciona com um único usuário local.
- ❌ Sincronização em nuvem entre dispositivos — dados salvos apenas no banco de dados local (Room).
- ❌ Notificações push enviadas por servidor externo — apenas lembretes locais agendados pelo AlarmManager.
- ❌ Pagamento real via PIX/Cartão — apenas marcação visual de status.

---

## ⚙️ Bloco 7 — Caminho técnico

Marque **uma** opção (as três valem a mesma nota):

- [x] **Opção A — Room:** dados salvos no próprio celular (lista de clientes, pets, serviços e compromissos)

**Bibliotecas que o grupo vai usar:**
- Room (banco de dados local)
- ViewModel + Flow (para observação de dados)
- Jetpack Compose (Interface moderna)
- AlarmManager (para lembretes locais)
- Navigation Component (fluxo entre telas)


## Tratamento de erros — try/catch

| Pode falhar | O usuário vê a mensagem |
|---|---|
| Campo obrigatório em branco | "Preencha todos os campos obrigatórios antes de salvar." |
| Erro ao inserir/ler no banco Room | "Não foi possível salvar os dados. Tente novamente." |
| Permissão de notificação negada | "Lembrete não ativado. Verifique as permissões de notificação do app." |

---

## 🎨 Bloco 8 — Identidade visual

| Item | Definição do grupo |
|---|---|
| Nome exibido (`strings.xml`) | Planify |
| Cor principal (hex, em `Color.kt`) | `#010736` (Azul Marinho) |
| Ideia do ícone (512×512) | Um calendário estilizado com uma pata de pet integrada. |
| `applicationId` | `br.edu.ifpe.planify` |
| Versão inicial | `1.0` (versionCode `1`) |

---

## 👤 Bloco 9 — Equipe, papéis e riscos

| Integrante | Papel principal | Responsável por |
|---|---|---|
| Thales | Dev / Telas | Entidade **Cliente** |
| Abner | Dev / Dados | Entidade **Compromisso** |
| Sara | Design e Identidade | Entidade **Servico** |
| Leticia | Doc e Entrega | Entidade **Pet** |

> Todos programam. O "papel" define quem **responde** por aquela parte, não quem trabalha sozinho.

## Riscos e Plano B

| Risco — o que pode dar errado | Plano B |
|---|---|
| Lembretes não dispararem corretamente | Testar cedo em dispositivos reais e não só no emulador. |
| Atraso na camada de dados (Room) | Priorizar o CRUD de Clientes e Pets antes de avançar na agenda. |
| Conflitos frequentes no Git | Usar branches específicas (feat/) e Pull Requests rigorosos. |

---

## 🤖 Bloco 10 — Acordo de trabalho com IA

A implementação pode ser feita com o **Gemini no Android Studio**. Vocês orientam, ele digita — e cada integrante precisa saber explicar o que entrou no projeto. Regras completas em [`docs/USO_DE_IA.md`](docs/USO_DE_IA.md).

**Três regras que vamos escrever no nosso `AGENTS.md`** *(o arquivo que diz à IA como trabalhar no nosso projeto)*:

1. Seguir rigorosamente a estrutura de pastas solicitada (src/ na raiz).
2. Explicar a lógica de concorrência (Flow/Coroutines) em cada alteração.
3. Não implementar funcionalidades extras fora do escopo do PRD.

---

## 🗓️ Bloco 11 — Marcos até 10/12

| Marco | Prazo | Como se comprova no GitHub |
|---|---|---|
| M1 — Canvas preenchido | 16/09 | `CANVAS.md` no `main` |
| M2 — PRD aprovado | 30/09 | `PRD.md` aprovado |
| M3 — Funcionalidade base rodando | 21/10 | Tela principal lista dados + 1 ação |
| M4 — Dados completos (Room) | 11/11 | Commits das 4 entidades na camada de dados |
| M6 — Entrega final | 02/12 | APK final e README completo |

---

## 🏁 Bloco 12 — Definição de pronto

O grupo só considera o app pronto quando **todas** estas frases forem verdadeiras:

- [x] O app abre e não fecha sozinho depois de 5 minutos de uso.
- [x] A tela principal mostra dados reais (Pet, Serviço, Cliente).
- [x] CRUD completo das 4 entidades funcionando.
- [x] O app tem nome, ícone e cor (#010736) próprios.
- [x] O `README.md` explica o funcionamento e o build.
- [x] O `agents.md` está preenchido e refletido no projeto.

---

## ✍️ Validação do professor

| | |
|---|---|
| Data | |
| Situação | ( ) Aprovado ( ) Aprovado com ajustes ( ) Refazer |
| Observações | |
