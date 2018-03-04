
package pilha;

public interface IPilha {
	public int size(); // retorna numero de elementos contidos na pilha

	public boolean isEmpty(); // retorna true se a pilha estiver vazia

	public Object top() throws EPilhaVazia; // retorna o elemento do topo da
											// pilha

	public void push(Object obj); // adiciona no topo da pilha

	public Object pop() throws EPilhaVazia; // remove o elemento do topo da
											// pilha e retorna o elemento
											// removido
}