Canvas do Projeto Final — App Android





Grupo nº
STL + A
Integrantes (3 a 4)
4
Turma
3º ano B — EMI IPI
Repositório
https://github.com/virtuosolima/-projeto-final--planify-
Data de preenchimento
09/09/2026
Entrega final
10/12/2026



Bloco 1 — Nome e pitch do app
Nome do app: Planify

Pitch em uma frase:

"O [Planify] ajuda [empreendedores] a [organizar seus horários e compromissos ] sem precisar de [agendas de papel ou vários apps soltos ]."


Bloco 2 — Problema
Muitos pequenos empreendedores (donos de salão, loja, prestadores de serviço autônomo, etc.) cuidam sozinhos de vários compromissos ao mesmo tempo: atendimento a clientes, reuniões com fornecedores, horários de entrega, e tarefas pessoais. Como não têm uma secretária ou sistema de agenda profissional, esses horários ficam espalhados entre WhatsApp, papel, cabeça e lembretes soltos no celular. O resultado: compromissos esquecidos, horários que se sobrepõem (marcar dois clientes no mesmo horário, por exemplo), e tempo perdido tentando lembrar o que precisa ser feito no dia.
Como esse problema é resolvido hoje (sem o app)?
Hoje, esse problema costuma ser resolvido de formas improvisadas e pouco confiáveis. Muitos empreendedores anotam seus compromissos em cadernos ou agendas de papel, o que funciona até certo ponto, mas não oferece nenhum tipo de aviso ou lembrete automático. Outros acabam deixando a própria conversa no WhatsApp virar uma espécie de agenda, com lembretes soltos misturados ao atendimento do cliente, o que facilita perder informações importantes no meio da rotina. Também é comum recorrer a alarmes e lembretes genéricos no celular, que avisam sobre um horário, mas sem contexto nenhum sobre o compromisso em si. Algumas pessoas tentam organizar tudo em planilhas simples no Excel ou Google Sheets, mas isso exige atualização manual constante e não gera nenhum tipo de aviso quando um horário está se aproximando. E, no fim das contas, muita gente ainda depende só da própria memória — o famoso "vou lembrar" — que falha justamente quando a rotina fica mais corrida e cheia de compromissos.



Bloco 3 — Público-alvo
Para quem é o app? 
Perfil principal: Pequenos empreendedores e autônomos, entre 25 e 45 anos, que atendem clientes ou gerenciam compromissos por conta própria e não têm equipe administrativa — como cabeleireiros, personal trainers, consultores, prestadores de serviço em geral e donos de pequenos negócios locais. 
Quando/onde usam: Usam o app diariamente, principalmente pela manhã (para revisar os compromissos do dia) e ao longo do dia sempre que um novo horário é marcado ou remarcado — seja no próprio local de trabalho, entre atendimentos, ou em qualquer lugar pelo celular, já que a rotina dessas pessoas raramente é em frente a um computador. 
Uma pessoa real que testaria o app: Ana Cláudia — mãe da aluna Letícia Gabriela, possui um salão de beleza. 

Bloco 4 — Solução em uma tela
A tela principal lista: os compromissos organizados por data, com foco no dia atual por padrão (podendo o usuário navegar para dias anteriores ou futuros, por exemplo por um calendário ou setas de navegação). Para cada compromisso, a lista exibe: o horário de início (e término, se preenchido), o título/nome do cliente, um indicador visual de status (pendente, em andamento, concluído ou cancelado) e um ícone pequeno indicando se há lembrete ativo. Os compromissos aparecem ordenados cronologicamente, do mais cedo para o mais tarde, e os que já passaram do horário (e não foram marcados como concluídos) ficam visualmente diferenciados — por exemplo, em cinza ou com um aviso de atraso. Se não houver nenhum compromisso cadastrado para o dia selecionado, a tela mostra uma mensagem simples incentivando o usuário a adicionar o primeiro compromisso.
A ação principal do usuário é: adicionar um novo compromisso preenchendo um formulário simples com os seguintes campos: nome do cliente (ou descrição do compromisso, para quem não atende cliente diretamente), data, horário de início (e opcionalmente horário de término), um campo de observações livres (ex: "levar orçamento", "primeira consulta") e a opção de ativar um lembrete, escolhendo com quanto tempo de antecedência quer ser avisado (ex: 15 min, 1h, 1 dia antes).
Depois de agir, o usuário vê: o retorno automático para a tela principal, onde o novo compromisso já aparece na posição correta da lista, ordenado por horário, com um aviso curto e discreto (toast ou snackbar) confirmando que foi salvo. Se o compromisso for para o dia atual, ele aparece destacado visualmente (ex: cor diferente ou ícone de "próximo"). Caso o lembrete tenha sido ativado, o sistema agenda a notificação local automaticamente, sem exigir nenhuma ação extra do usuário.
Observação: a recorrência de compromissos e a detecção automática de conflito de horário ficaram fora do MVP (ver Bloco 6) — podem entrar como evolução futura. 


Bloco 5 — Funcionalidades do MVP
Máximo de 4 funcionalidades. Se tiver mais, corte. Lembre: qualidade acima de complexidade.

#
Funcionalidade
Essencial?
Quem faz
F1
Adicionar compromisso (cliente/descrição, data, horário, lembrete opcional) 
Sim
Leticia
F2
Listar compromissos do dia, ordenados por horário, com status visual 
Sim
Sara
F3
Editar ou excluir um compromisso já cadastrado 
Sim
Thales
F4
Notificação/lembrete automático no horário definido  
Sim/Não
Abner



Bloco 6 — Fora do escopo
❌ Login/cadastro de usuário e múltiplas contas — o app funciona com um único usuário local, sem necessidade de criar conta.
❌ Sincronização em nuvem entre dispositivos — os compromissos ficam salvos apenas no banco de dados local do aparelho (Room), sem backup automático.
❌ Notificações push enviadas por servidor externo — apenas lembretes locais agendados pelo próprio app (AlarmManager/WorkManager) estão no escopo.
❌ Detecção automática de conflito de horários, chat, mapa e pagamento — não fazem parte desta entrega.


Bloco 7 — Caminho técnico
Marque uma opção (as três valem a mesma nota):

Opção A — Room: dados salvos no próprio celular (lista de compras, agenda, diário de treino, controle financeiro)

Opção escolhida: A — Room (dados salvos no próprio celular).
Faz sentido para o Planify porque os compromissos são dados pessoais do usuário, não precisam vir de uma API externa, e o app já foi definido (Bloco 6) como local, sem sincronização em nuvem.
Bibliotecas que o grupo vai usar:
Room (banco de dados local — tabela de compromissos)
ViewModel + LiveData (ou Flow) para observar a lista de compromissos na tela
RecyclerView (ou Jetpack Compose, se o grupo optar por Compose) para exibir a lista
AlarmManager ou WorkManager para agendar os lembretes/notificações locais
Navigation Component para navegar entre a tela principal e a tela de "novo compromisso"
Onde entra o try/catch?
Pode falhar
O usuário vê a mensagem
Campo obrigatório em branco (ex: horário não preenchido)
"Preencha o horário do compromisso antes de salvar."
Erro ao inserir/ler no banco Room
"Não foi possível salvar o compromisso. Tente novamente."
Lista de compromissos vazia (não é bem um erro, mas precisa de tratamento)
Mensagem incentivando a cadastrar o primeiro compromisso
Falha ao agendar o lembrete (permissão de notificação negada)
"Não foi possível ativar o lembrete. Verifique as permissões de notificação do app."



Bloco 8 — Identidade visual
Item
Definição do grupo
Nome exibido (strings.xml)
Planify 
Cor principal (hex, em Color.kt)
#______
Ideia do ícone (512×512)


applicationId
br.edu.ifpe.______
Versão inicial
1.0 (versionCode 1)



Bloco 9 — Equipe, papéis e riscos
Integrante
Papel principal
Responsável por
Thales
Dev / telas
Desenvolver a estrutura das telas de forma coerente e organizada.
Abner
Dev / dados (Room ou Retrofit)
Desenvolver e organizar os dados dentro do app em processo de desenvolvimento.
Sara
Design e identidade visual
Desenvolve a identidade visual do aplicativo.
Leticia
Documentação, build e entrega
Documenta e cataloga o que está sendo desenvolvido.


Todos programam. O "papel" define quem responde por aquela parte, não quem trabalha sozinho.

Riscos — o que pode dar errado e o plano B:


Risco
Plano B
Lembretes não dispararem corretamente (limitações do Android com AlarmManager em segundo plano)
Testar cedo (a partir do M3) em um celular real, não só no emulador
Atraso na conclusão da camada de dados (Room)
Priorizar F1/F2/F3 antes de qualquer funcionalidade extra; F4 é a primeira a ser cortada
Um integrante ficar sobrecarregado por causa de faltas de outro
Revisar semanalmente quem está travado e redistribuir tarefas pequenas
Conflitos ao subir código pro mesmo arquivo no Git
Cada um trabalha em branch própria e faz pull request antes de mesclar no main



Bloco 10 — Acordo de trabalho com IA

Combinados do grupo:

Ninguém clica Accept no Agent Mode sem ler a mudança inteira.
Quem aceitou o código escreve o comentário de fronteira do arquivo.
Antes de cada marco, revisamos juntos: alguém aqui não entende alguma parte?
Nenhuma chave de API ou senha vai para o prompt.
Outro combinado nosso:

Como vamos garantir que todos entendem tudo (ex.: quem implementa apresenta o arquivo aos outros; revezar as partes; revisar o pull request do colega):


Bloco 11 — Marcos até 10/12
Marco
Prazo
Como se comprova no GitHub
M1 — Canvas preenchido + repositório criado
16/09
CANVAS.md no main
M2 — PRD aprovado + telas rascunhadas
30/09
PRD.md + imagens em docs/
M3 — Funcionalidade base rodando
21/10
tela principal lista dados + 1 ação + try/catch
M4 — Dados completos (Room/Retrofit) e erros tratados
11/11
commits da camada de dados
M5 — Identidade visual + .apk de release testado
25/11
ícone, cores, .apk testado por 2 pessoas de fora
M6 — .aab + material de loja + README.md
02/12
pasta loja/ + README.md completo
Entrega e apresentação
10/12
tag v1.0 no repositório



Bloco 12 — Definição de pronto
O grupo só considera o app pronto quando todas estas frases forem verdadeiras:

O app abre e não fecha sozinho depois de 5 minutos de uso.
A tela principal mostra dados reais (não texto de exemplo fixo no código).
A ação principal funciona e o resultado aparece na tela.
Quando algo falha, aparece uma mensagem clara — o app não quebra.
O app tem nome, ícone e cor próprios (nada de ícone padrão do Android).
Duas pessoas de fora do grupo instalaram o .apk e conseguiram usar sem explicação.
O README.md explica o que o app faz, com o que foi feito e como gerar o build.
O docs/USO_DE_IA.md e o AGENTS.md estão preenchidos.
Cada integrante consegue abrir o projeto e fazer uma mudança pequena sozinho — trocar um texto, acrescentar um campo, mudar a ordem da lista.
Todo arquivo nosso tem o comentário de fronteira escrito por nós.


Validação do professor




Data


Situação
( ) Aprovado ( ) Aprovado com ajustes ( ) Refazer
Observações




