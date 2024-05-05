# Documentação: Sistema Conta Bancária

Este sistema em Java permite que um usuário insira informações para criar uma conta bancária fictícia.<br>
Ele solicita o número da agência, número da conta, nome do cliente e saldo da conta.<br>
Os campos para número da agência, número da conta e saldo da conta aceitam apenas números, enquanto o campo para o nome do cliente aceita apenas letras. 

## Uso do Sistema:

1. **Número da Agência:**
   - Solicita ao usuário que insira o número da agência.
   - Apenas números são permitidos como entrada.

2. **Número da Conta:**
   - Solicita ao usuário que insira o número da conta.
   - Apenas números são permitidos como entrada.

3. **Nome do Cliente:**
   - Solicita ao usuário que insira o nome do cliente.
   - Apenas letras (maiúsculas ou minúsculas) e espaços são permitidos como entrada.

4. **Saldo da Conta:**
   - Solicita ao usuário que insira o saldo da conta.
   - Apenas números são permitidos como entrada.

Após inserir todas as informações necessárias, o sistema exibe uma mensagem de agradecimento ao cliente, junto com os detalhes da conta criada.

## Funções:

1. **`getNumeroInteiro(Scanner scanner):`**
   - Método privado que solicita e retorna um número inteiro inserido pelo usuário.
   - Valida se a entrada é um número inteiro válido. Se não for, solicita novamente ao usuário até receber uma entrada válida.

2. **`getNumeroDecimal(Scanner scanner):`**
   - Método privado que solicita e retorna um número decimal inserido pelo usuário.
   - Valida se a entrada é um número decimal válido. Se não for, solicita novamente ao usuário até receber uma entrada válida.

3. **`getNomeCliente(Scanner scanner):`**
   - Método privado que solicita e retorna o nome do cliente inserido pelo usuário.
   - Valida se a entrada contém apenas letras e espaços. Se não for, solicita novamente ao usuário até receber uma entrada válida.

### Considerações Finais:

- O sistema utiliza a classe Scanner para capturar as entradas do usuário via terminal.
- Foi implementado um loop em cada método de entrada para garantir que a entrada do usuário seja validada corretamente.
- As informações inseridas são utilizadas para criar uma mensagem de agradecimento ao cliente, exibindo os detalhes da conta criada.
