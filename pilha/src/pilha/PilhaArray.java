package pilha;

public class PilhaArray implements IPilha {

	private Object Elementos[]; // Armazena elementos da pilha
	private int t = -1; // indice do elemento no topo
			
	public int getT() {
		return t;
	}
	
	public PilhaArray(int tamanho) { // construtor recebe o tamanho do array
		Elementos = new Object[tamanho]; // inicializa o Array elementos com o
											// tamanho recebido no parametro
	}

	@Override
	public int size() { // tamanho
		return (t + 1); // retorna indice +1
	}

	@Override
	public boolean isEmpty() { // verifica se a pilha está vazia
		return (t == -1); // se o indice do topo for -1
	}

	@Override
	public Object top() throws EPilhaVazia { // método para retornar o elemento
												// do topo
		if (isEmpty()) { // verifica se a pilha está vazia
			throw new EPilhaVazia("Pilha está vazia!"); // se a pilha estiver
														// vazia imprime a
														// mensagem
		}
		return Elementos[t];// retorna o elemento do topo
		
	}

	@Override
	public void push(Object obj) { // metodo para adicionar um elemento na pilha
		if (t == Elementos.length - 1) { // verifica se a pilha está cheia
			Object ElementosAux[] = Elementos; // Array auxiliar aponta para o
												// Array Elementos
			Elementos = new Object[(t + 1) * 2]; // Dobra tamanho do Array
													// Elementos

			for (int i = 0; i <= t; i++) { // laço para percorrer o array
				Elementos[i] = ElementosAux[i]; // Copia os dados para o novo
												// array
			}
		}
		Elementos[++t] = obj; // insere o objeto passado no parâmetro
	}

	@Override
	public Object pop() throws EPilhaVazia { // remove elemento do topo e exibe
												// elemento removido.
		if (isEmpty()) { // verifica se a pilha está vazia
			throw new EPilhaVazia("Pilha está vazia!"); // se a pilha estiver
														// vazia imprime a
														// mensagem
		}
		Object elementoNoTopo = Elementos[t]; // cria variável elementoNoTopo e
												// atribui o valor do elemento
												// no indice t
		Elementos[t] = null; // Libera memória para o Garbage colector
		t -= 1; // reduz o indice do topo em -1
		return elementoNoTopo; // retorna o elemento do topo
	}
	
	public void pop2() { // remove elemento do topo e exibe
		// elemento removido.
		if (isEmpty()) { // verifica se a pilha está vazia
			System.out.println("VAZIA");
		}
	}
}