package EstruturaDeDados;


/**
 * Cria nodos que armazena os dados em formato de String, apenas visivel para classes no mesmo pacote, que farão uso para a estrutura e manipulação dos dados
 * @version 1
 * @author TimmMateus
 * @see github Mais projetos: {@link https://github.com/TimmMateus}
 */
class Nodo {
    private String dado;
    private Nodo proximoNodo;
    private Nodo anteriorNodo;

    //Construtor para nós iniciais
    Nodo(String dado){
        this.dado=dado;
    }

    //Conturutor para adição de nós
    Nodo(String dado, Nodo anteriorNodo){
        this.dado=dado;
        this.anteriorNodo=anteriorNodo;
    }

    //Define o próximo nó
    void definirProximoNodo(Nodo nodo){
        proximoNodo = nodo;
    }

    //Define o nó anterior
    void definirAnteriorNodo(Nodo nodo){
        anteriorNodo = nodo;
    }

    //Retorna o nó que vem depois
    Nodo pegarProximoNodo(){
        return proximoNodo;
    }

    //Retorna o nó que vem antes
    Nodo pegarAnteriorNodo(){
        return anteriorNodo;
    }

    //Retorna o nó na posição solicitada
    Nodo procurarNodo(Nodo nodo, int posicao){
        if(posicao==0)return nodo;
        posicao--;
        if(nodo.proximoNodo==null)return null;
        return procurarNodo(nodo.proximoNodo, posicao);
    }

    //Imprime o conteúdo do nó e sua posição
    void ImprimirNodos(){
        int posicao=0;
        System.out.println(posicao + " -> " + dado);
        if(proximoNodo!=null) proximoNodo.ImprimirNodos(posicao);
    }

    //Imprime o conteúdo do nó e sua posição
    void ImprimirNodos(int posicao){
        posicao++;
        System.out.println(posicao + " -> " + dado);
        if(proximoNodo!=null) proximoNodo.ImprimirNodos(posicao);
    }

    //Imprime o conteúdo de um único nó
    void imprimirNodo(){
        System.out.println(dado);
    }

    //Retorna o conteúdo do nó
    public String pegarDado() {
        return dado;
    }
}
