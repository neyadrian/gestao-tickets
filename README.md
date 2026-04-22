# 🎫 Sistema de Gestão de Tickets de Suporte

## 📌 Contexto do Sistema
Este projeto tem como objetivo desenvolver um sistema de gestão de tickets de suporte para uma empresa de software.  
O sistema organiza os chamados por prioridade e os armazena em memória.

---

## 🧱 Estrutura do Projeto

```

src/
└── software/
├── modelo/
│   ├── Prioridade.java
│   └── Ticket.java
│
├── gestao/
│   └── GerenciadorTickets.java
│
└── main/
└── Main.java

```

---

## ⚙️ Funcionalidades

- Criação de tickets com ID automático  
- Definição de prioridade (BAIXA, MEDIA, ALTA, URGENTE)  
- Controle de prazo por prioridade  
- Listagem de tickets  
- Remoção de tickets por ID  
- Filtro por prioridade  
- Contagem total de tickets  
- Ordenação por prioridade (URGENTE primeiro)  

---

## 🧩 Requisitos do Sistema

a) Estrutura de Pacotes e Enumeração  
- Criar o pacote software.modelo  
- Criar a enumeração Prioridade com: BAIXA (72h), MEDIA (48h), ALTA (24h), URGENTE (4h)  
- Cada prioridade possui um atributo prazoHoras  
- Implementar construtor e getter  

b) Classe Ticket  
- private int id  
- private String descricao  
- private Prioridade prioridade  
- static int contador  
- ID gerado automaticamente  
- Construtor recebe descrição e prioridade  
- Descrição não pode ser vazia  

c) Regras de Negócio  
- Método exibirDetalhes() retorna ID, descrição, prioridade e prazo  

d) Gerenciador de Tickets  
- Pacote software.gestao  
- Classe GerenciadorTickets  
- Usa ArrayList<Ticket>  
- Métodos: adicionarTicket, removerTicket, listarPorPrioridade, contarTotal  

e) Classe Principal  
- Pacote software.main  
- Classe Main  
- Criar gerenciador  
- Criar 5 tickets  
- Adicionar, listar, remover e mostrar total  

f) Ordenação  
- Ordem: URGENTE > ALTA > MEDIA > BAIXA  
- Usar Comparable e Collections.sort()  

---

## 🔐 Encapsulamento

- Atributos privados  
- Uso de static para ID  
- Validação de dados  

---

## 🧠 Estruturas Utilizadas

- ArrayList  
- Enum  
- Comparable  
- Collections.sort()  

---

## 📚 Tecnologias Utilizadas

- Java  
- Java Collections Framework  

---

## 👨‍💻 Autor
Ney Adrian

---
Projeto desenvolvido para fins acadêmicos.
