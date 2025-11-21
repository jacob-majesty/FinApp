# Trabalho de faculdade - FinApp

## Contexto
Uma FinTech solicitou o desenvolvimento de um aplicativo Android para auxiliar usuários no controle de suas finanças pessoais. O aplicativo deve permitir o registro de gastos e ganhos, classificando as transações para melhor organização financeira.

## Requisitos Técnicos

### Activity Principal - Dashboard
- Interface com botões distribuídos equilibradamente
- Navegação para: Cadastro, Extrato e Sair
- Botão "Sair" deve fechar o aplicativo

### Activity de Cadastro
- Permitir cadastro de transações financeiras
- Campos obrigatórios:
  - Tipo da operação (débito/crédito)
  - Descrição curta
  - Valor
- Armazenamento em estruturas de dados em memória (dados não persistentes)

### Activity de Extrato
- Listar todas as operações cadastradas
- Cada item da lista deve conter:
  - Tipo da transação (débito/crédito)
  - Descrição
  - Valor
- Usar template padrão do Android para listas
- Estilização dos textos
- Não é necessário capturar clique nas células

## Especificações Técnicas
- API 28 do Android
- Desenvolvimento em Kotlin
- Validações sob responsabilidade dos desenvolvedores
- Dados armazenados apenas em memória

## Exemplos de Transações
- Débito: Lazer - R$20,50
- Débito: Moradia - R$1.200,00  
- Crédito: Salário - R$10.000,00

## Layout em Duas Colunas
| Tipo    | Descrição | Valor       |
|---------|-----------|-------------|
| Débito  | Lazer     | R$ 20,50    |
| Crédito | Salário   | R$ 10.000,00|
| Débito  | Moradia   | R$ 1.200,00 |
