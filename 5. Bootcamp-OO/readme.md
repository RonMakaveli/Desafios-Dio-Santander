# Diferenças na minha implementação do código

## Alterações na classe `Main`:
1. Foi utilizado o curinga (`*`) para importar todos os elementos do pacote `br.com.dio.desafio.dominio`.
2. Os métodos `adicionarDev` e `adicionarConteudo` foram adicionados à classe `Bootcamp` para adicionar desenvolvedores e conteúdos ao bootcamp, respectivamente.
3. Os métodos `exibirInformacoes`, `getNome`, `getDescricao`, `getDataInicial`, `getDataFinal`, `getDevsInscritos`, `getConteudos` e os métodos relacionados a carga horária e descrição de curso foram adicionados à classe `Bootcamp`.
4. Foram adicionados métodos na classe `Main` para utilizar os métodos adicionados na classe `Bootcamp`, como `exibirInformacoes`, `getDescricao`, `getCargaHoraria`, `setCargaHoraria`, `setConteudos` e `getNome`.
5. Foi adicionado o método `criarMentoria` na classe `Mentoria` para facilitar a criação de instâncias de mentoria.
6. Foi adicionado o método `exibirInformacoesMentoria` na classe `Mentoria` para exibir informações sobre uma mentoria.

## Alterações nas classes de domínio:
1. Os construtores das classes `Curso` e `Mentoria` foram alterados para aceitar parâmetros de inicialização dos atributos `titulo`, `descricao` e `cargaHoraria` (no caso de `Curso`) e `titulo` e `descricao` (no caso de `Mentoria`).
2. Foram adicionados métodos de acesso aos atributos `titulo` e `descricao` nas classes `Curso` e `Mentoria`.
3. Foi adicionado o método `criarMentoria` na classe `Mentoria` para facilitar a criação de instâncias de mentoria.

Essas são as diferenças entre as duas versões do código.