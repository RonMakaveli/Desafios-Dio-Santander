# Atualizações e Diferenças no Código Base

## Introdução
Este documento descreve as atualizações e diferenças feitas no código base do projeto bancário.

## Mudanças Realizadas
1. **Integração do Lombok**
    - Foram adicionadas as dependências do Lombok ao projeto para reduzir a verbosidade do código, eliminando a necessidade de escrever getters e setters explicitamente.

2. **Adição de Classes e Métodos**
    - Foi introduzida uma nova classe `Cliente` com um atributo `conta` para representar a conta associada ao cliente.
    - Um método `listarClientes()` foi adicionado à classe `Banco` para listar todos os clientes associados ao banco.

3. **Atualizações nas Classes Existentes**
    - As classes existentes foram modificadas para integrar o Lombok e utilizar suas anotações para gerar getters, setters e outros métodos necessários.

## Última Implementação Realizada
- Uma implementação de exemplo foi adicionada ao arquivo `Main.java` para demonstrar a criação de clientes com suas respectivas contas associadas ao banco, depósito, transferência e impressão de extratos.
- Essa implementação inclui a criação de instâncias de clientes, contas correntes e contas poupança, bem como a associação dessas contas aos clientes e a adição desses clientes ao banco.
- Também foram realizadas operações de depósito, transferência e impressão de extratos para demonstrar o funcionamento do sistema.

Este é um resumo das principais atualizações e a última implementação realizada no projeto bancário.
