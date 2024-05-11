# Sistema iPhone

Este é um sistema simples que simula as funcionalidades de um iPhone, como um reprodutor musical, um aparelho telefônico e um navegador na internet.

## Funcionalidades

### Reprodutor Musical

- **tocar():** Inicia a reprodução da música selecionada.
- **pausar():** Pausa a reprodução da música atual.
- **selecionarMusica(String música):** Seleciona uma música para reprodução.

### Aparelho Telefônico

- **ligar(String numero):** Inicia uma chamada para o número especificado.
- **atender():** Atende uma chamada recebida.
- **iniciarConversaVoz():** Inicia uma conversa por voz durante uma chamada.

### Navegador na Internet

- **exibirPagina(String url):** Exibe uma página da web com a URL especificada.
- **adicionarNovaAba():** Adiciona uma nova aba ao navegador.
- **atualizarPagina():** Atualiza a página atual no navegador.

## Como Executar

1. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
2. Compile os arquivos `.java` usando o comando `javac`:
3. Execute o programa compilado usando o comando `java`:

# Justificativa para o uso de Interfaces em vez de Classes Abstratas

No sistema fornecido, optei por não utilizar classes abstratas e, em vez disso, utilizei interfaces (ReprodutorMusical, AparelhoTelefonico, NavegadorInternet) para definir os contratos ou comportamentos que devem ser implementados pela classe iPhone. Abaixo estão algumas razões que embasam essa escolha:

- **Múltipla Herança:** Em Java, uma classe só pode herdar de uma única classe, mas pode implementar várias interfaces. Usar interfaces permite que a classe iPhone herde funcionalidades de múltiplas fontes, o que não seria possível com classes abstratas.

- **Flexibilidade:** Interfaces permitem maior flexibilidade do que classes abstratas. Uma classe pode implementar várias interfaces, o que oferece mais opções de composição e reutilização de código do que a herança de uma única classe abstrata.

- **Contratos mais claros:** Interfaces definem contratos claros e específicos para as classes que as implementam. Isso ajuda a garantir que as classes que implementam as interfaces cumpram esses contratos, independentemente de sua hierarquia de herança.

- **Encapsulamento de comportamento:** Interfaces encapsulam comportamentos específicos sem fornecer uma implementação. Isso incentiva a separação de preocupações e facilita a manutenção do código, pois as mudanças na implementação de uma interface não afetam as outras partes do sistema.

- **Facilidade de testes:** Interfaces permitem a criação de mocks ou simulações mais facilmente em testes unitários, pois fornecem contratos claros para os métodos que devem ser implementados.

Em resumo, a escolha de interfaces sobre classes abstratas foi feita visando proporcionar mais flexibilidade, clareza e encapsulamento na definição dos contratos de comportamento no sistema do iPhone.
