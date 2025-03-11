# 💻 Blog

Este projeto é um sistema de blog simples que permite a criação, leitura, atualização e exclusão (CRUD) de postagens. Foi desenvolvido utilizando o **Spring Boot** e testado no **Postman**.

## 🎯 Objetivo

O objetivo deste projeto é desenvolver uma aplicação de blog que permita realizar operações CRUD(Create, Read, Update, Delete) para gerenciar postagens. 
A aplicação foi criada para praticar e demonstrar conhecimentos em Spring Boot, JPA/Hibernate e boas práticas em arquitetura de software.

## 📐 Modelo Relacional

Abaixo está o diagrama de relacionamento entre as entidades **Autor**, **Postagem** e **Comentario** no sistema:

![Captura de tela 2025-03-11 090517](https://github.com/user-attachments/assets/f5cb58cd-4456-4a33-bc74-ba00ea0a5c76)


## 🗂️ Estrutura do Projeto

* 📂 `entities`
* 📂`repositories`
* 📂 `service`
* 📂`controller`
* 📂`exception`

### 📝 Detalhamento das Camadas:
- **📂 entities**
    - `Postagem`: Representa uma postagem no blog.  
    - `Comentario`: Representa um comentário associado a uma postagem.  
    - `Autor`: Representa o autor de uma postagem.  

- **📂 repositories**
    - `PostagemRepository`: Interface que estende `JpaRepository` para operações no banco de dados.

- **📂 service**
    - `PostagemService`: Contém a lógica de negócio do sistema.

- **📂 controller**
    - `PostagemController`: Responsável pelos endpoints da API REST.

- **📂 exception**
    - `ObjetoNaoEncontrado`: Exceção lançada quando um recurso não é encontrado.


## 📌 Funcionalidades/Endpoints
| Método | Endpoint              | Descrição                |
|--------|-----------------------|--------------------------|
| GET    | `/api/postagens`      | Lista todas as postagens |
| GET    | `/api/postagens/{id}` | Busca uma postagem por ID|
| POST   | `/api/postagens`      | Cria uma nova postagem   |
| PUT    | `/api/postagens/{id}` | Atualiza uma postagem    |
| DELETE | `/api/postagens/{id}` | Remove uma postagem      |

## 🛠️ Tecnologias Utilizadas 

- **Java 21**
- **Spring Boot**
  - Spring Boot Web
  - Spring Data JPA (Hibernate)
- **H2 Database**: Banco de dados em memória para desenvolvimento e testes.
- **Lombok**: Para reduzir boilerplate code com anotações como `@Data`, `@Getter`, `@Setter`, etc.
- **Maven**: Para gerenciamento de dependências.
- **Postman**: Para testar os endpoints da API.

