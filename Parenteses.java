import java.util.*;

class Parenteses {
   
    public String pilha[] = new String[10];
    public int topo = 0;
    String abreEl = "([{";
    String fechaEl = ")]}";    
    
    /** * Insere um elemento no topo da pilha. * 
     * @param elemento a ser inserido. */ 
    public void push(){
        for (int i = 0; i < pilha.length; i++) {
            String elemento = pilha[i];
            if (abreEl.contains(elemento)) {
                pilha[topo] = elemento;
                topo++;
            }
            
        } 
    }

   /*  public void push(){
        pilha[topo] = "(";
        topo++;
    } */


       /** * Remove o elemento do topo da pilha. * 
     * @return elemento a ser removido.  */ 
    public String pop(){
        for (int i = 0; i < pilha.length; i++) {
            String elemento = pilha[i];
            if (fechaEl.contains(elemento)) {
                pilha[topo] = elemento;
                topo--;
            } 
        } 
        return pilha[topo];
    }
    

  




    public static void main(String[] args) {
        
        /* Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um texto: ");
        String linhaLida = leitor.nextLine();

        System.out.println(linhaLida.toUpperCase()); */

        String[] elementos = new String[10];

        elementos[0] = "A";
        elementos[1] = "B";

        for (int i = 0; i < elementos.length; i++) {
            String elemento = elementos[i];
            System.out.println(elemento);
        }
    }


}