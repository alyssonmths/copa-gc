# ⚽ Copa GC - Sistema de Placar

Projeto desenvolvido para a disciplina de **Gerência de Configuração** da Universidade de Pernambuco (UPE).

## 📋 Sobre o Projeto

O Copa GC é um sistema de console desenvolvido em Java para gerenciar informações básicas de uma Copa do Mundo fictícia.

O sistema permite:

- Listar seleções por grupo;
- Registrar resultados de partidas;
- Exibir classificação dos grupos;
- Listar artilheiros cadastrados.

Todos os dados são armazenados em memória, sem utilização de banco de dados ou arquivos externos.

---

## 🏗️ Estrutura do Projeto

```text
copa-gc/
├── src/
│   ├── model/
│   │   ├── Selecao.java
│   │   └── Partida.java
│   ├── service/
│   │   └── Copa.java
│   ├── util/
│   │   └── CargaInicial.java
│   └── Main.java
├── .gitignore
└── README.md
```

---

## 📦 Classes do Sistema

### Selecao
Representa uma seleção participante da copa.

**Atributos:**
- nome
- grupo
- codigoFIFA

---

### Partida
Representa uma partida entre duas seleções.

**Atributos:**
- mandante
- visitante
- golsA
- golsB

---

### Copa
Classe responsável pelas regras de negócio do sistema.

**Principais funcionalidades:**
- Adicionar seleções
- Registrar partidas
- Listar grupos
- Exibir artilheiros
- Calcular classificação

---

### CargaInicial
Responsável por popular o sistema com dados iniciais para testes.

Contém:
- 8 seleções fictícias
- 4 partidas de exemplo
- Artilheiros de exemplo

---

### Main
Ponto de entrada da aplicação.

Responsável por:
- Exibir o menu principal
- Ler entradas do usuário
- Chamar as funcionalidades da classe Copa

---

## 🖥️ Menu Principal

```text
=== Copa GC — Menu Principal ===

1. Listar seleções por grupo
2. Registrar resultado de partida
3. Exibir classificação do grupo
4. Listar artilheiros
0. Sair
```

---

## 🚀 Como Executar o projeto

### Compilar

```bash
javac src/model/*.java src/service/*.java src/util/*.java src/Main.java
```

### Executar

```bash
java -cp src Main
```

---

## 🌳 Fluxo de Desenvolvimento

O projeto segue Git Flow simplificado utilizando branches de feature:

- feature/modelos
- feature/copa
- feature/carga
- feature/main

Nenhum integrante realizou commits diretamente na branch `main`.

Toda integração ocorreu através de Pull Requests com revisão obrigatória de pelo menos um integrante da equipe.

---

## 📝 Convenção de Commits

O projeto utiliza o padrão **Conventional Commits**.

### Exemplos

```text
feat(modelos): cria classe Selecao
feat(copa): implementa calcularClassificacao
docs(readme): atualiza instrucoes de uso
fix(main): corrige leitura do Scanner
```

---

## 👥 Integrantes

| Integrante   | Responsabilidade |
|--------------|------------------|
| José Alysson | Modelos (Selecao e Partida) |
| Jesús Miguel | Classe Copa |
| Jesús Miguel | Carga Inicial |
| João Pedro   | Main e integração |

---

## 🎓 Disciplina

**Gerência de Configuração**  
Universidade de Pernambuco (UPE)  
Professor: Marcondes Ricarte

---

## 📄 Licença

Projeto desenvolvido exclusivamente para fins acadêmicos.