import java.lang.*;
import java.io.*; 
import java.util.*;

class Stack{
    
    public static void main(String[] args) {
        
        final String pilha[] = new String[10];
        int topo = 0;
        
           
        String abreEl = "([{";
        String fechaEl = ")]}";
        

    
        //static Stack<Character> pilha = new Stack<Character>();
        String e = System.console().readLine(">>>");     //Lê uma linha.
        //Itera por cada caractere da sentença s...
        for (int i = 0; i < e.length(); i++){
            String elemento = pilha[i];     
        //...verifica se o caractere é (...
        if (abreEl.contains(elemento)) {
            pilha[topo] = elemento;
                topo++;                              //...empilhe o caractere.
        //...verifica se o caractere é )...
        }else if (topo != 0){
            System.out.println("Entrada inválida");      //...expressão desbalanceada.
            return;                                   //...encerra a função.
            }  
         else if (fechaEl.contains(elemento)) {
            topo--;
            //...verifica se a pilha estiver vazia...                              //...remove o que estiver no topo da pilha.
        }
        }
        //Verifica se após a iteração a pilha não estiver vazia...
        if (topo != 0){
        System.out.println("Entrada inválida");          //...expressão desbalanceada.
        return;                                       //...encerra a função.
        }else{   
        System.out.println("Entrada válida");
        }
    

    }
}
