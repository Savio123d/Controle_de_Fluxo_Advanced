# Desafios de Controle de Fluxo em Java

## 📝 Descrição
Este repositório contém uma coleção de exercícios práticos em Java, focados em aprofundar o conhecimento sobre estruturas de controle de fluxo. Os desafios abordam desde `loops` e condicionais simples até o tratamento de exceções e o uso de comandos como `break` e `continue` em cenários diversos.

## ⚙️ Principais Funcionalidades e Conceitos Abordados
O projeto é dividido em vários exercícios, cada um explorando um aspecto específico do controle de fluxo em Java:
- **`ex2` e `ex5`**: Criação de menus interativos com `switch-case` para simular operações bancárias e de cadastro de usuários.
- **`ex3`, `ex4`, `ex6` e `ex7`**: Uso de `loops` (`for`) com as instruções `break` e `continue` para interromper ou pular iterações em cenários como busca em arrays e filtragem de dados.
- **`ex8`**: Utilização de `switch-case` para tratar múltiplas condições de forma organizada, como em uma aplicação de clima.
- **`ex9`**: Demonstração de `break` para otimizar buscas em listas, interrompendo o loop assim que uma condição crítica é encontrada.
- **`ex10` e `src`**: Implementação de tratamento de exceções (`try-catch`) para lidar com entradas de usuário inválidas, garantindo a robustez do programa.

## 💻 Tecnologias e Linguagens Utilizadas
- **Linguagem:** Java
- **SDK:** OpenJDK 23
- **IDE:** O projeto foi estruturado utilizando o IntelliJ IDEA.

## 📁 Estrutura de Pastas e Arquivos
O repositório está organizado em múltiplos módulos, onde cada pasta `ex` representa um exercício independente.

```
/Controle_de_Fluxo_Advanced
|
├── .idea/            # Arquivos de configuração do IntelliJ IDEA
├── ex2/              # Exercício de menu bancário com switch-case
|   └── src/Main.java
├── ex3/              # Exercício de loop com break
|   └── src/Main.java
├── ex4/              # Exercício de loop com continue
|   └── src/Main.java
├── ex5/              # Exercício de menu de usuário com try-catch
|   └── src/Main.java
├── ex6/              # Exercício de busca em array com break
|   └── src/Main.java
├── ex7/              # Exercício de filtro de candidatos com continue
|   ├── src/Candidato.java
|   └── src/Main.java
├── ex8/              # Exercício de condições climáticas com switch-case
|   └── src/Main.java
├── ex9/              # Exercício de verificação de estoque com break
|   ├── src/Produto.java
|   └── src/Main.java
├── ex10/             # Exercício de input com tratamento de exceção
|   └── src/Main.java
└── src/              # Exercício de dias da semana com switch-case e try-catch
    └── Main.java
```

## ▶️ Passo a Passo de Execução
Para executar qualquer um dos exercícios, siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone <URL-DO-SEU-REPOSITÓRIO>
    ```
2.  **Navegue até a pasta de um exercício:**
    ```bash
    cd Controle_de_Fluxo_Advanced/ex2/src
    ```
3.  **Compile o arquivo Java:**
    ```bash
    javac Main.java
    ```
4.  **Execute o programa:**
    ```bash
    java Main
    ```
Repita os passos 2, 3 e 4 para qualquer outro exercício que desejar testar.

## 💡 Exemplo de Uso (Exercício 8)
Ao executar o `ex8`, o programa solicitará a condição climática.

**Entrada do usuário:**
```
Informe o clima (ensolarado, chuvoso, nublado, neve): ensolarado
```

**Saída esperada:**
```
O dia está ensolarado. Aproveite para sair ao ar livre!
```
