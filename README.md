# 💰 FinApp: Controle de Finanças Pessoais

## 📝 Descrição do Projeto - Faculdade

O FinApp é um aplicativo Android desenvolvido para atender à solicitação de uma FinTech, com o objetivo de auxiliar usuários no controle de suas finanças pessoais. O aplicativo permite o registro organizado de gastos (débitos) e ganhos (créditos), oferecendo uma visão clara das transações através de um dashboard intuitivo.

## ✨ Funcionalidades

O aplicativo é estruturado em três telas principais, acessíveis a partir do Dashboard:

* **Dashboard Principal**: Interface inicial com botões distribuídos equilibradamente para navegação entre as funcionalidades (Cadastro, Extrato e Sair).
* **Cadastro de Operações**: Tela para registrar novas transações financeiras (débitos ou créditos).
    * Campos obrigatórios: Tipo da operação, Descrição curta e Valor.
* **Extrato Financeiro**: Listagem de todas as operações cadastradas.
    * Cada item exibe: Tipo da transação, Descrição e Valor.
    * Utiliza template padrão do Android para listas, com estilização dos textos.
* **Encerramento**: Botão "Sair" na Activity Principal, que finaliza o aplicativo.

---

## 🛠️ Requisitos e Especificações Técnicas

| Especificação | Detalhe |
| :--- | :--- |
| **Linguagem** | Kotlin |
| **API Alvo** | API 28 do Android |
| **Armazenamento** | Dados armazenados exclusivamente em estruturas de dados **em memória** (não persistentes). |
| **Validações** | Sob responsabilidade do desenvolvedor. |
| **Tecnologias Adicionais** | Android SDK, Estruturas de dados em memória. |

### Exemplo de Estrutura de Transação

| Tipo    | Descrição | Valor       |
|---------|-----------|-------------|
| Débito  | Lazer     | R$ 20,50    |
| Crédito | Salário   | R$ 10.000,00|
| Débito  | Moradia   | R$ 1.200,00 |

---

## 📂 Estrutura de Diretórios e Camadas

O projeto segue uma organização padrão Android, focando na separação de responsabilidades (Modelos, UI e Recursos).

```
FinApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── kotlin/com/finapp/android/
│   │       │   ├── model/             # Classes de dados (Ex: Transaction.kt)
│   │       │   ├── data/              # Lógica de manipulação dos dados em memória
│   │       │   └── ui/                # Activities e Adapters da interface
│   │       │       ├── activity/      # (DashboardActivity.kt, CadastroActivity.kt, ExtratoActivity.kt)
│   │       │       └── adapter/       # (TransactionAdapter.kt)
│   │       └── res/                   # Recursos do App
│   │           ├── layout/            # Layouts XML (activity_dashboard.xml, etc.)
│   │           └── values/            # Strings, Cores, Estilos
├── build.gradle.kts (Module: :app)    # Configurações do SDK e dependências
└── AndroidManifest.xml                # Definição de Activities e Permissões
```

---

## 🚀 Como Executar o Projeto

## Pré-requisitos
- Android Studio
- Emulador ou dispositivo com API 28 (Android 9.0)

## Passos Rápidos

1. **Clone e abra** o projeto no Android Studio
   ```bash
   git clone https://github.com/jacob-majesty/FinApp.git
   ```
2. **Configure o emulador** com API 28 (Pixel 4 recomendado)
3. **Execute** ▶️ o projeto (Shift + F10)
4. **Teste as funcionalidades**:
    - **Cadastro**: Adicione transações (valida campos obrigatórios)
    - **Extrato**: Veja todas as transações em memória
    - **Sair**: Encerre o aplicativo

## Dicas
- Use **Build → Clean Project** se houver erros de compilação
- Dispositivo físico é mais rápido que emulador
- Dados são voláteis (em memória) - reinicie o app para limpar

 #### O app iniciará na **tela principal** com os 3 botões de navegação.
---

## 🎓 Disciplina

Este projeto foi desenvolvido como parte dos requisitos da disciplina de **Desenvolvimento Mobile I**.
