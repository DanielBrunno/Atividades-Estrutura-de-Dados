package pilha;

public class Teste {
    public static void main(String[] args) throws EPilhaVazia {
        PilhaArray p1 = new PilhaArray(3);

       p1.push("Tell");
       System.out.println("PUSH 1 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());
       
       p1.push("Daniel Brunno");
       System.out.println("PUSH 2 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());       
       
       p1.push("Messias");
       System.out.println("PUSH 3 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());
       
       p1.push("Juciane");
       System.out.println("PUSH 4 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());
       
      // p1.top();
      // System.out.println("TOP -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());
       
       
       System.out.println("POP 1 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.pop());

      
       System.out.println("POP 2-> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.pop());
 
      
       System.out.println("POP 3-> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.pop());
       
      
       System.out.println("POP 4-> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.pop());
       
       p1.pop2();
       p1.pop2();
       p1.pop2();
       p1.pop2();
       
       p1.push("Daniel Brunno");
       
       System.out.println("PUSH 2 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());       
       /*
       System.out.println("PUSH 2 -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top()); 

       p1.pop();
       System.out.println("POP -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());

       p1.top();
       System.out.println("TOP -> "+ "Indice: " + p1.getT()+" - Tamanho: "+ p1.size() +" - Elemento Inserido: " + p1.top());
*/
       //p1.size();
       //p1.isEmpty();
       
    }
}
