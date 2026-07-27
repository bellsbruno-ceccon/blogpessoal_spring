# 🌐 Blog Pessoal API

API REST desenvolvida em Java com Spring Boot durante o Bootcamp Java Full Stack da Generation Brasil.

## 📖 Sobre o projeto

O Blog Pessoal é uma API REST que permite o gerenciamento de usuários, temas e postagens. A aplicação conta com autenticação utilizando Spring Security e JWT, documentação automática com Swagger e persistência de dados em MySQL.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot 3
- Spring Data JPA
- Spring Security
- JWT (JSON Web Token)
- MySQL
- Maven
- Swagger / OpenAPI

## 📂 Funcionalidades

- Cadastro de usuários
- Login com autenticação JWT
- CRUD de Postagens
- CRUD de Temas
- Relacionamento entre Tema e Postagem
- Validação de dados
- Documentação da API com Swagger

## 📁 Estrutura do projeto

```
src
├── controller
├── model
├── repository
├── security
├── service
├── configuration
└── BlogpessoalApplication.java
```

## ⚙️ Como executar o projeto

### Clone o repositório

```bash
git clone https://github.com/SEU-USUARIO/blogpessoal.git
```

### Acesse a pasta

```bash
cd blogpessoal
```

### Configure o banco de dados

Edite o arquivo:

```
src/main/resources/application.properties
```

Configure:

```properties
spring.datasource.url=jdbc:mysql://localhost/db_blogpessoal
spring.datasource.username=root
spring.datasource.password=root
```

### Execute a aplicação

```bash
./mvnw spring-boot:run
```

ou

```bash
mvn spring-boot:run
```

## 📚 Documentação da API

Após iniciar a aplicação, acesse:

```
http://localhost:8080/swagger-ui/index.html
```

## 🗄️ Banco de Dados

- MySQL

Banco utilizado:

```
db_blogpessoal
```

## 👩‍💻 Desenvolvido por

**Bella**

Bootcamp Java Full Stack | Generation Brasil