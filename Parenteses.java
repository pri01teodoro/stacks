class Parenteses {
   
    public String elementos[];

    public Parenteses(){
        elementos = new String[];

    }
    
    /** * Insere um elemento no topo da pilha. * 
     * @param elemento a ser inserido. */ 
    public void push (String e);
    
    /* Retorna o número de elementos na pilha. */ 
    public int size( );
    
    /** * Indica quando a pilha está vazia. */ 
     
    public boolean isEmpty( );
    
    /** * Inspeciona o elemento no topo da pilha. * 
     * @return o elemento do topo da pilha. * 
     * @exception EmptyStackException se a pilha estiver vazia. */ 
    public E top( ) 
    throws EmptyStackException;
    
    
    /** * Remove o elemento do topo da pilha. * 
     * @return elemento a ser removido. * 
     * @exception EmptyStackException se a pilha estiver vazia. */ 
    public E pop( )
    throws EmptyStackException;
    
}


/** * Exceção de tempo de execução lançada quando alguém tenta executar uma operação top * ou pop sobre uma pilha vazia. */
public class EmptyStackException extends RuntimeException { public EmptyStackException(String err) {
    super(err);
    }
    }