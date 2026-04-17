# Desafio de Controle de Fluxo - DIO

Este projeto foi desenvolvido como parte do currículo da **DIO (Digital Innovation One)**, com o objetivo de exercitar conceitos fundamentais de controle de fluxo, tratamento de exceções e entrada de dados em Java.

## 🎯 Objetivo
O sistema recebe dois números inteiros via terminal. Com base nesses números, o programa realiza uma contagem (utilizando um laço `for`) e imprime as ocorrências no console.

**Regras de Negócio:**
* Se o primeiro parâmetro for **maior** que o segundo, o sistema lança uma exceção customizada chamada `ParametrosInvalidosException`.
* Caso contrário, o sistema imprime a sequência de números com base na diferença entre os dois parâmetros.

## 🚀 Diferenciais Implementados
Além dos requisitos básicos do desafio, adicionei:
* **Loop de Resiliência:** Utilizei uma estrutura `do-while` no `main` para que o programa não feche em caso de erro, permitindo que o usuário tente digitar os números novamente até que sejam válidos.
* **Tratamento de Exceção:** Implementação de classe de exceção personalizada para regras de negócio.

## 🛠️ Tecnologias Utilizadas
* **Java 17**
* **Scanner API** para interação via console
* **Lógica de Programação:** Laços de repetição e estruturas condicionais

## 🏗️ Como Executar
1. **Clone o repositório:**
```bash
git clone https://github.com/seu-usuario/DesafioControleFluxo.git
