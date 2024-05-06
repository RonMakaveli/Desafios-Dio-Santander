# Documentação do Sistema de Contagem

## Visão Geral
Este é um sistema simples em Java que permite ao usuário fornecer dois números inteiros via terminal e realiza uma contagem e impressão dos números incrementados no console. Se o primeiro número fornecido for maior ou igual ao segundo número, o sistema lança uma exceção ParametrosInvalidosException.

## Funcionalidades
- Recebe dois números inteiros fornecidos pelo usuário via terminal.
- Verifica se o primeiro número é menor que o segundo número.
- Lança uma exceção ParametrosInvalidosException se o primeiro número não for menor que o segundo número.
- Calcula a diferença entre os dois números para determinar a quantidade de números a serem impressos.
- Usa um loop for para iterar e imprimir os números incrementados no console.
- Encerra o programa após a contagem e impressão dos números.

## Uso
1. Execute o programa.
2. Digite o primeiro parâmetro (número inicial da contagem) quando solicitado.
3. Digite o segundo parâmetro (número final da contagem) quando solicitado.
4. O sistema realizará a contagem e impressão dos números incrementados, começando a partir do primeiro número e indo até o segundo número.
5. Se o primeiro parâmetro fornecido for maior ou igual ao segundo parâmetro, o sistema lançará uma exceção com a mensagem "O segundo parâmetro deve ser maior que o primeiro".

## Estrutura do Código
- A classe Contador contém o método main, responsável pela entrada de dados e chamada do método contar.
- O método contar realiza a lógica de contagem e impressão dos números, lançando uma exceção se os parâmetros forem inválidos.
- A classe ParametrosInvalidosException é uma exceção personalizada lançada quando os parâmetros fornecidos são inválidos.