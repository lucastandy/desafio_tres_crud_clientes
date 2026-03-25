# 🚀 Desafio CRUD de Clientes - Spring Boot

## 📌 Sobre o projeto

Este projeto foi desenvolvido como parte do módulo de **Back-end** da formação **Desenvolvedor Moderno (DevSuperior)**.

A aplicação consiste em uma API REST completa para gerenciamento de clientes, implementando as principais operações de um CRUD, seguindo boas práticas de arquitetura em camadas com Spring Boot.

---

## 🛠️ Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database
* Maven
* Bean Validation

---

## 🧱 Arquitetura do projeto

O projeto foi estruturado em camadas para melhor organização e manutenção:

```
controllers
controllers.handlers
dto
entities
repositories
services
services.exceptions
```

---

## 📊 Modelo de dados

A entidade **Client** possui os seguintes atributos:

* `id` (Long)
* `name` (String)
* `cpf` (String)
* `income` (Double)
* `birthDate` (LocalDate)
* `children` (Integer)

---

## ⚙️ Funcionalidades

A API disponibiliza as seguintes operações:

* 🔍 Busca paginada de clientes
* 🔎 Busca de cliente por ID
* ➕ Inserção de cliente
* ✏️ Atualização de cliente
* ❌ Remoção de cliente

---

## ✅ Validações implementadas

* Nome não pode ser vazio
* Data de nascimento não pode ser futura

---

## ⚠️ Tratamento de exceções

* `404 Not Found` → Cliente não encontrado
* `422 Unprocessable Entity` → Erro de validação com mensagens personalizadas

---

## 🌱 Dados iniciais (Seed)

O projeto possui um `import.sql` com 10 clientes cadastrados automaticamente ao iniciar a aplicação.

---

## 🚀 Como executar o projeto

### Pré-requisitos:

* Java 17+
* Maven

### Passos:

```bash
# Clonar o repositório
git clone https://github.com/seu-usuario/seu-repo.git

# Entrar na pasta
cd seu-repo

# Executar o projeto
mvn spring-boot:run
```

---

## 🧪 Testes da API

A API pode ser testada utilizando o Postman ou Insomnia.

### 🔍 Buscar cliente por ID

```
GET /clients/1
```

### 📄 Busca paginada

```
GET /clients?page=0&size=6&sort=name
```

### ➕ Inserir cliente

```
POST /clients
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20",
  "children": 2
}
```

### ✏️ Atualizar cliente

```
PUT /clients/1
{
  "name": "Maria Silva Atualizada",
  "cpf": "12345678901",
  "income": 7000.0,
  "birthDate": "1994-07-20",
  "children": 2
}
```

### ❌ Deletar cliente

```
DELETE /clients/1
```

---

## 🗄️ Banco de dados

A aplicação utiliza o banco em memória H2.

Acesse o console:

```
http://localhost:8080/h2-console
```

---

## 👨‍💻 Autor

Lucas Tandy do Nascimento Silva
 https://www.linkedin.com/in/lucas-tandy/
 
