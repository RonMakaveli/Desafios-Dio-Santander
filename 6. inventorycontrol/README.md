# Sistema de Controle de Estoque

## Descrição

Este é um sistema simples de controle de estoque construído com Java, Spring Boot e Thymeleaf.<br>
A aplicação permite adicionar, editar, excluir e visualizar detalhes de produtos em um armazém ou loja.

## Funcionalidades

- Adicionar novos produtos
- Editar produtos existentes
- Excluir produtos
- Visualizar detalhes dos produtos
- Design responsivo com Bootstrap

## Tecnologias Utilizadas

- Java 22
- Spring Boot 3.3.0
- Thymeleaf
- Bootstrap
- Banco de Dados H2 (em memória)

## Primeiros Passos

### Pré-requisitos

- Java JDK 22 ou superior
- Maven 3.6.3 ou superior

### Instalação

1. Clone o repositório:

    ```sh
    git clone https://github.com/seuusuario/inventory-control.git
    cd inventory-control
    ```

2. Construa o projeto com Maven:

    ```sh
    mvn clean install
    ```

3. Execute a aplicação:

    ```sh
    mvn spring-boot:run
    ```

### Executando em Outra Máquina

Para executar esta aplicação em outra máquina, siga estes passos:

1. Certifique-se de que o Java e o Maven estão instalados na máquina.
2. Clone o repositório:

    ```sh
    git clone https://github.com/seuusuario/inventory-control.git
    cd inventory-control
    ```

3. Construa o projeto:

    ```sh
    mvn clean install
    ```

4. Execute a aplicação:

    ```sh
    mvn spring-boot:run
    ```

5. Acesse a aplicação em um navegador web:

    ```
    http://localhost:8080/products
    ```

### Usando a Aplicação

- **Lista de Produtos**: Lista todos os produtos no estoque.
- **Adicionar Novo Produto**: Clique no botão "Add New Product" para adicionar um novo produto.
- **Editar Produto**: Clique no botão "Edit" ao lado de um produto para editar seus detalhes.
- **Visualizar Produto**: Clique no botão "View" ao lado de um produto para visualizar seus detalhes.
- **Excluir Produto**: Clique no botão "Delete" ao lado de um produto para excluí-lo.

### Console do Banco de Dados H2

Para acessar o console do banco de dados H2:

1. Abra um navegador web e vá para:

    ```
    http://localhost:8080/h2-console
    ```

2. Insira os seguintes detalhes:
    - **JDBC URL**: `jdbc:h2:mem:testdb`
    - **Nome de Usuário**: `sa`
    - **Senha**: `password`

3. Clique em "Connect".

### Estrutura do Projeto

```sh
inventorycontrol
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.inventorycontrol
│   │   │       ├── controller
│   │   │       │   └── ProductController.java
│   │   │       ├── model
│   │   │       │   └── Product.java
│   │   │       ├── repository
│   │   │       │   └── ProductRepository.java
│   │   │       └── InventoryControl.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   ├── products.html
│   │   │   │   ├── product_form.html
│   │   │   │   └── product_details.html
│   │   │   ├── static
│   │   │   └── application.properties
│   └── test
│       └── java
│           └── com.example.inventorycontrol
│               └── InventoryControlApplicationTests.java
├── .gitignore
├── README.md
└── pom.xml
