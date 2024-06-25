package EstruturaDeDados;

/**
 * Cria uma lista de dados em Strings
 * @version 1
 * @author TimmMateus
 * @see github projects on {@link https://github.com/TimmMateus}
 */
public class ListaEncadeada{
    private Nodo primeiroNodo;
    private Nodo ultimoNodo;
    private int comprimento;
    
    /**
     * Cria uma nova lista vazia
     */
    public ListaEncadeada(){
        comprimento=0;
    }

    /**
     * Cria uma nova lista armazenando seu primeiro item
     * @param dado a ser armazenado
     */
    public ListaEncadeada(String dado){
        Nodo nodo = new Nodo(dado);
        ultimoNodo = nodo;
        primeiroNodo = nodo;
        comprimento = 1;
    }

    /** 
     * Adiciona um novo item no final da lista
     * @param dado a ser armazenado
     */
    public void adicionarItem(String dado){
        Nodo nodo = new Nodo(dado,ultimoNodo);
        if(comprimento==0) primeiroNodo=nodo;
        else ultimoNodo.definirProximoNodo(nodo);
        ultimoNodo=nodo;
        comprimento++;
    }

    /**
     * Insere um novo item na posição solicitada
     * @param dado
     * @param posicao
     */
    public void adicionarItem(String dado, int posicao){
        if(posicao==0) adicionarPrimeiroItem(dado);
        else if(posicao>=comprimento)adicionarItem(dado);
        else{
            Nodo nodo = new Nodo(dado);
            nodo.definirAnteriorNodo(nodo.procurarNodo(primeiroNodo, (posicao-1)));
            nodo.definirProximoNodo(nodo.procurarNodo(primeiroNodo, posicao));
            nodo.pegarAnteriorNodo().definirProximoNodo(nodo);
            nodo.pegarProximoNodo().definirAnteriorNodo(nodo);
        }
    }

    /**
     * Adiciona um novo item na primeira posição
     * @param dado
     */
    public void adicionarPrimeiroItem(String dado){
        Nodo nodo = new Nodo(dado);
        if (comprimento==0) ultimoNodo=nodo;
        else{
            primeiroNodo.definirAnteriorNodo(nodo);
            nodo.definirProximoNodo(primeiroNodo);
        }
        comprimento++;
        primeiroNodo=nodo;
    }

    /**
     * Remove o item na posição solicitada
     * @param posicao
     */
    public void remover(int posicao){
        if(posicao==0)removerPrimeiro();
        else if(posicao>=comprimento-1)removerUltimo();
        else{
            Nodo nodoAjudante = new Nodo(null);
            nodoAjudante = primeiroNodo.procurarNodo(primeiroNodo, posicao);
            nodoAjudante.pegarAnteriorNodo().definirProximoNodo(nodoAjudante.pegarProximoNodo());
            nodoAjudante.pegarProximoNodo().definirAnteriorNodo(nodoAjudante.pegarAnteriorNodo());
        }
    }

    /**
     * Remove o nodo da úlitma posição
     */
    public void removerUltimo(){
        if(primeiroNodo==null) System.out.println("Nada ocorreu, lista vazia!");
        else{
            ultimoNodo = ultimoNodo.pegarAnteriorNodo();
            if(ultimoNodo==null) primeiroNodo=ultimoNodo;
            else{ 
                ultimoNodo.definirProximoNodo(null);
                comprimento--;
            }
        }
    }

    /**
     * Remove o item da primeira posição
     */
    public void removerPrimeiro(){
        if(primeiroNodo==null) System.out.println("Nada ocorreu, lista vazia!");
        else{
            if(primeiroNodo.pegarProximoNodo()==null){
                primeiroNodo=null;
                ultimoNodo=null;
            } else {
                primeiroNodo = primeiroNodo.pegarProximoNodo();
                primeiroNodo.definirAnteriorNodo(null);
            }
            comprimento--;
        }
    }

    /**
     * Limpa a lista inteira
     */
    public void esvaziar(){
        primeiroNodo = null;
        ultimoNodo = null;
        comprimento = 0;
        System.out.println("Lista esvaziada com sucesso!");
    }

    /**
     * Imprime todos os dado armazenados na lista
     */
    public void imprimirLista(){
        if(primeiroNodo==null) System.out.println("A lista está vazia");
        else primeiroNodo.ImprimirNodos();
    }

    /**
     * @return tamanho da lista 
     */
    public int comprimento(){
        return comprimento;
    }

    /**
     * @return primeiro dado armazenado
     */
    public String pegarPrimeiro(){
        return primeiroNodo.pegarDado();
    }

    /**
     * @return ultimo dado armazenado
     */
    public String pegarUltimo(){
        return ultimoNodo.pegarDado();
    }
    
}