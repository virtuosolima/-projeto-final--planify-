# 📄 PRD — Documento de Requisitos do Produto

> **O que é um PRD?** É o documento que responde **o quê** o app faz e **por quê** — não *como* ele é programado.
> Quem lê o PRD deve conseguir entender o app inteiro sem abrir o código.
>
> **Regra do PRD:** todo requisito precisa ser verificável. "O app tem que ser rápido" não é requisito. "A lista abre em menos de 2 segundos" é.
>
> Preencha depois do [`CANVAS.md`](CANVAS.md) aprovado. Substitua todo texto em _itálico_ e apague os exemplos.

| | |
|---|---|
| **App** | |
| **Grupo** | |
| **Autores** | |
| **Versão do documento** | 1.0 |
| **Última atualização** | ___/___/2026 |
| **Status** | ( ) Rascunho ( ) Em revisão ( ) Aprovado |

---

## 1. Visão do produto

**Pitch:** _(copie do Bloco 1 do Canvas)_

**Problema:** _(2 a 4 linhas — copie e melhore o Bloco 2)_

**Por que vale a pena fazer isso:** _(o que muda na vida de quem usa)_

---

## 2. Público e cenário de uso

**Usuário-alvo:**

**História de uso (conte como uma cena real):**
> _"São 19h, o [usuário] acabou de [situação]. Ele abre o app e [o que faz]. Em menos de 30 segundos, ele [resultado]."_

---

## 3. Objetivos e não-objetivos

**Objetivos desta versão (v1.0):**

1.
2.
3.

**Não-objetivos (fora do escopo — copie o Bloco 6 do Canvas):**

- ❌
- ❌
- ❌

---

## 4. Requisitos funcionais

Escreva no formato de história de usuário + critério de aceite. Prioridade: **Must** (sem isso não entrega), **Should** (importante), **Could** (se sobrar tempo).

| ID | História de usuário | Critério de aceite | Prioridade |
|---|---|---|---|
| RF01 | Como _usuário_, quero _ver a lista de ___ _ para _____. | Ao abrir o app, a lista aparece com os itens salvos; se não houver nenhum, aparece a mensagem "____". | Must |
| RF02 | Como _usuário_, quero _adicionar ____ _ para _____. | Ao tocar em "+", preencher ____ e confirmar, o item aparece no topo da lista. | Must |
| RF03 | | | Must |
| RF04 | | | Should |
| RF05 | | | Could |

---

## 5. Requisitos não funcionais

| ID | Requisito | Como será verificado |
|---|---|---|
| RNF01 | O app não pode fechar sozinho durante o uso normal | 5 minutos de uso contínuo sem crash, em 2 celulares diferentes |
| RNF02 | Toda operação que pode falhar está dentro de `try/catch` | Revisão do código: banco, rede e entradas do usuário |
| RNF03 | Nenhuma falha mostra tela branca ou fecha o app — sempre há mensagem ao usuário | Testes de falha da seção 9 |
| RNF04 | O app roda a partir do Android ___ (minSdk) | Instalação em dispositivo real |
| RNF05 | Textos visíveis ficam em `strings.xml`, não escritos direto no código | Revisão do código |
| RNF06 | Todo arquivo do pacote do app tem comentário de fronteira escrito pelo grupo | Revisão do código |
| RNF07 | Qualquer integrante consegue localizar e alterar qualquer parte do app | Teste de mudança ao vivo (rubrica) |
| RNF08 | | |

---

## 6. Telas e navegação

**Mapa de navegação:**

```
[Tela Principal — lista]
      │
      ├── toca no "+"      → [Tela de Cadastro/Detalhe]
      ├── toca em um item  → [Tela de Detalhe]
      └── (estado vazio)   → mensagem "____"
```

| Tela | O que mostra | Ações disponíveis |
|---|---|---|
| Principal | | |
| Detalhe/Cadastro | | |

**Rascunhos das telas:** coloque as imagens ou fotos dos desenhos em `docs/telas/` e liste os arquivos aqui.

- `docs/telas/01-principal.png`
- `docs/telas/02-detalhe.png`

---

## 7. Dados

### Se Opção A ou C (Room)

**Entidade principal:** `_____`

| Campo | Tipo | Obrigatório | Observação |
|---|---|---|---|
| `id` | Long | sim | chave primária, autogerada |
| | | | |
| | | | |

**Operações necessárias:** ( ) inserir ( ) listar ( ) atualizar ( ) excluir

### Se Opção B ou C (Retrofit)

| Item | Definição |
|---|---|
| API utilizada | |
| Documentação | |
| Endpoint principal | `GET https://...` |
| Precisa de chave? | ( ) não ( ) sim — onde ela fica guardada: |
| Limite de requisições | |
| Campos usados na tela | |

**Exemplo de resposta da API** _(cole um trecho real do JSON)_:

```json

```

---

## 8. Arquitetura e tecnologias

| Item | Escolha |
|---|---|
| Linguagem | Kotlin |
| Interface | ( ) Jetpack Compose ( ) XML/Views |
| Persistência | ( ) Room ( ) — |
| Rede | ( ) Retrofit ( ) — |
| Outras bibliotecas | |
| `minSdk` / `targetSdk` | / |

**Organização de pastas do projeto:**

```
app/src/main/java/br/edu/ifpe/<app>/
├── ui/        # telas
├── data/      # Room (entidade, DAO, database) ou Retrofit (service, modelos)
└── MainActivity.kt
```

---

## 9. Tratamento de erros

Liste o que pode dar errado e **o que o usuário vê** em cada caso. Cada linha aqui deve virar um `try/catch` no código.

| Situação de falha | O que o app faz | Mensagem para o usuário |
|---|---|---|
| Sem internet (Opção B/C) | Mantém a tela e mostra aviso + botão "Tentar de novo" | "Sem conexão. Verifique a internet e tente novamente." |
| API fora do ar / erro 500 | | |
| Lista vazia (nenhum dado ainda) | | |
| Campo obrigatório em branco | | |
| Erro ao salvar no banco | | |

---

## 10. Identidade visual e publicação

| Item | Definição | Onde fica |
|---|---|---|
| Nome do app | | `strings.xml` |
| Cor principal | `#______` | `Color.kt` |
| Cor secundária | `#______` | `Color.kt` |
| Ícone 512×512 | | `loja/icone-512.png` |
| `applicationId` | `br.edu.ifpe.______` | `build.gradle.kts` |
| `versionName` / `versionCode` | `1.0` / `1` | `build.gradle.kts` |

**Material da loja** (Etapa 4 do projeto):

| Artefato | Limite | Conteúdo |
|---|---|---|
| Título | 30 caracteres | |
| Descrição curta | 80 caracteres | |
| Descrição completa | — | _(escreva em `loja/descricao.md`)_ |
| Imagem de destaque | 1024×500 | `loja/destaque-1024x500.png` |
| Screenshots | mín. 2 | `loja/screenshots/` |
| Esboço de privacidade | — | `loja/privacidade.md` — o app coleta algum dado? Sai do celular? |
| Arquivo `.aab` | — | `loja/app-release.aab` |

---

## 11. Plano de testes

| # | O que testar | Passos | Resultado esperado | OK? |
|---|---|---|---|---|
| T1 | Abrir o app pela primeira vez | Instalar e abrir | Tela principal aparece com estado vazio explicado | |
| T2 | Ação principal | | | |
| T3 | Falha de rede/banco | Ativar modo avião e repetir T2 | Mensagem clara, app não fecha | |
| T4 | Reabrir o app | Fechar e abrir de novo | Dados continuam lá (Opção A/C) | |
| T5 | Teste com usuário externo | Pessoa de fora usa sem explicação | Consegue completar a ação principal | |

**Testado em:** _(modelo do celular e versão do Android — pelo menos 2 aparelhos)_

---

## 12. Cronograma

| Marco | Prazo | Responsável | Status |
|---|---|---|---|
| M1 — Canvas + repositório | 16/09 | | |
| M2 — PRD aprovado + telas | 30/09 | | |
| M3 — Funcionalidade base | 21/10 | | |
| M4 — Dados e erros tratados | 11/11 | | |
| M5 — Identidade + `.apk` testado | 25/11 | | |
| M6 — `.aab` + loja + README | 02/12 | | |
| **Entrega e apresentação** | **10/12** | grupo | |

---

## 13. Riscos

| Risco | Impacto | Plano B |
|---|---|---|
| A API escolhida sai do ar ou passa a exigir pagamento | Alto | Trocar para ____ ou usar dados locais |
| Integrante fica sem computador | | |
| | | |

---

## 14. Como vamos orientar a implementação com IA

A implementação usa o **Gemini no Android Studio**. Este PRD é o documento que diz à IA o que construir — quanto mais preciso ele estiver, menos a IA inventa. Regras completas em [`docs/USO_DE_IA.md`](docs/USO_DE_IA.md).

**Recursos que vamos usar:** ( ) Chat ( ) Agent Mode ( ) Explain Code ( ) Ask Gemini no Logcat ( ) Generate Unit Tests ( ) Transform UI

**Regras que colocamos no `AGENTS.md`** _(resumo — o arquivo fica na raiz do repositório)_:

-
-
-

**Divisão do perímetro explicável** — quem responde por explicar o quê na apresentação:

| Parte do código | Responsável |
|---|---|
| Telas (`ui/`) | |
| Dados (`data/`) | |
| Identidade visual e recursos | |
| Build e artefatos de loja | |

**Decisões que o grupo tomou contra a sugestão da IA** _(preencher ao longo do projeto — isso conta a favor na avaliação)_:

-

---

## 15. Histórico de versões deste documento

| Versão | Data | Autor | O que mudou |
|---|---|---|---|
| 1.0 | | | Versão inicial |
| | | | |
