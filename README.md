###### *[Click here to access this project in English](https://github.com/TimmMateus/Java-BasicConcepts_ConceitosBasicos/tree/English)*
# Bem Vindo

Este é um projeto com estruturas básicas, porém essenciais. Atualmente é um *trabalho em andamento*, e será adicionado mais itens quando completos.
<br>
A ideia por trás do projeto é que haja um repositório com essas estruturas disponíuveis para outros projetos, sem a nessessidade de refazer sempre que precisar.
<br>
Como o foco do projeto são as estruturas, e não um aplicativo completo, a classe contendo o metodo principal (Main) não está incluso por não ser essencial.
<br>
Sinta-se livre para sugestões, correções ou dúvidas.

## Sobre mim
Formado em Engenharia da Computação e estudando Análise e Desenvolvimento de Sistemas, estou iniciando minha carreira em Desenvolvimento de software, focado em BackEnd utilzando Java e C#, não excluindo outras tecnologias.
<br>
[TimmMateus](mailto:maretimm@gmail.com)

## Estrutura

|[Pacote](#packages-and-classes)|Class|
|---|---|
|[EstruturaDeDados](#estruturadedados)|[Nodo](#nodo)|
|↳|[ListaEncadeada](#listaencadeada)|

### EstruturaDeDados

Este pacote contém classes e métodos focados no armazenamento e manipulação de dados.

#### Nodo

Este é a classe principal no pacote, onde os dados são armazenados. É apenas acessível ao pacote, uma vez que necessita de outras classes para estruturar, acessar e manipular os dados.

##### Atributos

|Nome|Tipo|Descrição|
|---|---|---|
|dado|String|Armazena a informação do nodo|
|proximoNodo|Nodo|Nodo seguinte da sequência|
|anteriorNodo|Nodo|Nodo anterior da sequência|

##### Métodos

|Nome|Parâmetro (Tipo)|Descrição|
|---|---|---|
|Nodo|dado (String)|Contrutor sem dado|
|Nodo|dado (String) <br> anteriorNodo (Node)|Construtor ao adicionar novos nodos <br> Armazena o nodo anterior da sequência
|definirProximoNodo|nodo (Nodo)|Define o nodo seguinte na sequência|
|definirAnteriorNodo|nodo (Nodo)|Define o nodo anterior na sequência|
|pegarProximoNodo||Retorna o nodo que vem depois|
|pegarAnterioroNodo||Retorna o nodo que vem antes|
|procurarNodo|nodo (Nodo) <br> posicao (int)|Procura na lista returnando o nodo na posição solicitada|
|imprimirNodos||Imprime o dado do nodo com a sua posição <br> Chama o método para imprimir o próximo nodo|
|imprimirNodos|posicao (int)|Imprime o dado do nodo com a sua posição <br> Chama o método para imprimir o próximo nodo|
|imprimirNodo||Imprime o dado do nodo|
|pegarDado||Retorna o dado do nodo|

#### ListaEncadeada

Essa classe utilizar a classe Nodo para criar uma lista com dados armazenados, e é possível adicionar e remover itens no início, meio ou fim da lista. Também controla o comprimento da lista, seu primeiro item e último item como referência das informações da lista.

##### Atributos

|Nome|Tipo|Descrição|
|---|---|---|
|primeiroNodo|Nodo|A referência do primeiro nodo da lista|
|ultimoNodo|Nodo|A referência do último nodo da lista|
|comprimento|int|A quantidade de nodos na lista|

##### Métodos

|Nome|Parâmetro (Tipo)|Descrição|
|---|---|---|
|ListaEncadeada||Cria uma lista vazia|
|ListaEncadeada|dado (String)|Cria uma lista com seu primeiro item|
|adicionarItem|dado (String)|Insere um item no final da lista|
|adicionarItem|dado (String) <br> posicao (int)|Insere um novo item na posição solicitada|
|adicionarPrimeirItem|dado (String)|Adiciona um novo item na primeira posição|
|remover|posicao (int)|Remove o item na posição solicitada|
|removerUltimo||Remove o último nodo da lista|
|removerPrimeiro||Remove o primeiro nodo da lista|
|esvaziar||Limpa a lista inteira|
|imprimirLista||Imprime todos os dados armazenados na lista|
|comprimento||Retorna o comprimento da lista|
|pegarPrimeiro||Retorna o primeiro dado armazenado na lista|
|pegarUltimo||Retorna o ultimo dado armazenado na lista|

## Licença
[Este projeto está sob a licença MIT - veja mais detalhes no arquivo LICENSE.md.](LICENSE.md)
