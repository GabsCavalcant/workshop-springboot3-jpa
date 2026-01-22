# Sistema de Pedidos - Spring Boot 3 & JPA

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![TailwindCSS](https://img.shields.io/badge/tailwindcss-%2338B2AC.svg?style=for-the-badge&logo=tailwind-css&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=Hibernate&logoColor=white)

Aplicação Web Full Stack desenvolvida para estudo de modelagem de domínio complexo, RESTful APIs e arquitetura em camadas. O projeto permite o gerenciamento de usuários, produtos e a realização de pedidos com cálculo automático de totais.


Dominio de Controle.
<img width="954" height="355" alt="image" src="https://github.com/user-attachments/assets/258361c7-b376-4aff-8ec8-5f0ffae471bc" />

Tela inicial Simples do funcional do projeto.
<img width="1916" height="907" alt="image" src="https://github.com/user-attachments/assets/3f6bc50a-c294-44e5-9c67-cd6f42b56a6f" />



## 🛠 Tecnologias Utilizadas

### Back-end
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA** (Hibernate)
- **H2 Database** (Banco em memória para testes)
- **Maven** (Gerenciamento de dependências)

### Front-end
- **HTML5 & JavaScript (Vanilla)** - Fetch API para consumo REST
- **Tailwind CSS** - Estilização moderna e responsiva

## ⚙️ Funcionalidades

- [x] **CRUD de Usuários**: Cadastro, Listagem e Remoção (com validação de integridade referencial).
- [x] **Catálogo de Produtos**: Listagem dinâmica de produtos vindos do banco.
- [x] **Carrinho de Compras**: Adição de múltiplos itens ao pedido.
- [x] **Processamento de Pedidos**: Salvamento transacional de Pedido + Itens de Pedido.
- [x] **Cálculo Automático**: Subtotal por item e Total geral do pedido.
- [x] **Tratamento de Exceções**: Respostas de erro personalizadas (404, 400, 500).

## 🗂 Modelo de Domínio

O sistema foi modelado seguindo as boas práticas de Engenharia de Software, utilizando relacionamentos 1:N e N:N com classe de associação.

*(Você pode adicionar a imagem do seu diagrama UML aqui)*
![UML Diagram](assets/domain-model.png)

## 🚀 Como executar o projeto

### Pré-requisitos
- Java 17 instalado
- Maven instalado

### Passo a passo

1. **Clone o repositório**
   ```bash
   git clone [https://github.com/seu-usuario/workshop-springboot3-jpa.git](https://github.com/seu-usuario/workshop-springboot3-jpa.git)
   Execute o Back-end

2. Importe o projeto na sua IDE favorita (Eclipse/IntelliJ/STS).

Execute a classe principal CourseApplication.java.

O servidor iniciará na porta 8080.

Acesse a Aplicação

3 Abra o navegador e vá para: http://localhost:8080/index.html
📡 Endpoints da API
Aqui estão os principais endpoints disponíveis para teste via Postman/Insomnia:
<img width="406" height="328" alt="image" src="https://github.com/user-attachments/assets/a3daf512-d670-45d4-938e-6c817ec7efd7" />


Exemplo de JSON para Criar Pedido (POST /orders)
JSON

{
  "moment": "2026-01-21T23:10:00Z",
  "orderStatus": "PAID",
  "client": {
    "id": 1
  },
  "items": [
    {
      "quantity": 2,
      "price": 90.5,
      "product": { "id": 1 }
    },
    {
      "quantity": 1,
      "price": 1250.0,
      "product": { "id": 3 }
    }
  ]
}

👨‍💻 Autor
Gabriel Cavalcante Fernandes


https://www.linkedin.com/in/gabrielcant/
