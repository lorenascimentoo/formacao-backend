package estruturadedados;

import java.util.Arrays;
//primeira estrutura de dados
// do tipo armazenamento sequencial, os dados são guardados um após o outro
public class Vetor {
	
		// criação de um Array(Vetor), deve-se obrigatóriamente colocar a posição
	    private Aluno[] alunos = new Aluno[100];
	    private int totalDeAlunos = 0;

	    public void adiciona(Aluno aluno) {
	    	//sempre garante que o vetor terá espaço para inserir itens
	    	this.garanteEspaco();
	        //recebe um aluno e insere no array
	    	this.alunos[this.totalDeAlunos] = aluno;
	    	//acrescenta uma posição para a próxima inserção
	    	this.totalDeAlunos++;
	    }
	    
	    private boolean posicaoValida(int posicao) {
	    	return posicao>=0 && posicao <= this.totalDeAlunos;
	    }
	    
	    public void adiciona(int posicao, Aluno aluno) {
	    	//sempre garante que o vetor terá espaço para inserir itens
	    	this.garanteEspaco();
	    	//verifica se é uma posicão valida
	    	// entra no fluxo do if se a posição for inválida e lança uma exceção
	    	if (!this.posicaoValida(posicao)) {
				throw new IllegalArgumentException("Posição inválida!");
			}
	    	
	    	// varre o vetor da ultima posicao até a posicao indicada para inserção
	    	for (int i = this.totalDeAlunos-1; i >= posicao; i--) {
	    		// atribui a variavel atual para a posicao posterior 
				this.alunos[i+1] = this.alunos[i];
	    	}
	    	// atribui o objeto aluno na posicao informada no vetor
	    	this.alunos[posicao] = aluno;
	    	//acrescenta uma posicao ao total pois inseriu um obj
	    	this.totalDeAlunos++;
	    }
	    
	    private boolean posicaoOcupada(int posicao) {
	    	return posicao>=0 && posicao < totalDeAlunos;
	    }
	    public Aluno pega(int posicao) {
	    	//verifica se é uma posicão ocupada
	    	// entra no fluxo do if se a posição for inválida e lança uma exceção
	    	if (!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posição inválida!");
			}
	        //recebe uma posição e devolve o aluno
	        return this.alunos[posicao];
	    }

	    public void remove(int posicao) {
	        //remove pela posição
	    	
	    	// varre o vetor da posicao a ser removida até o total de posicoes no vetor 
	    	for (int i = posicao; i < this.totalDeAlunos; i++) {
	    		// atribui na posicao atual o item da posicao posterior
				this.alunos[i] = this.alunos[i+1];
			}
	    	//remove o ultimo item, subtraindo uma posicao do total
	    	this.totalDeAlunos--;
	    }

	    public boolean contem(Aluno aluno) {
	        //descobre se o aluno está ou não na lista
	    	for (int i = 0; i < this.totalDeAlunos; i++) {
	    		if(aluno.equals(this.alunos[i])) {
	    			return true;
	    		}
	    	}				    	
	        return false;
	    }

	    public int tamanho() {
	        return this.totalDeAlunos;
	    }

	    public String toString() {
	        //facilitará na impressão
	    	
	    	// faz com que apenas os valores válidos, ou seja não nulos, sejam impressos ao usuario
	    	Aluno[] alunosValidos = new Aluno[this.totalDeAlunos];
	    	for (int i = 0; i < this.totalDeAlunos; i++) {
				alunosValidos[i] = this.alunos[i];
			}
	        return Arrays.toString(alunosValidos);
	    }
	    
	    private void garanteEspaco() {
	    	// caso a quantidade de itens seja igual ao máximo permitido no vetor 
	    	if (this.totalDeAlunos == this.alunos.length) {
				// é instanciado um novo vetor com o dobro do tamanho atual
	    		Aluno[] novoArray = new Aluno[this.alunos.length*2];
	    		// faz um laço para inserir todos os itens do vetor que estava cheio, para o novo vetor de tamanho maior
	    		for (int i = 0; i < this.alunos.length; i++) {
					novoArray[i] = this.alunos[i];
				}   		
	    		// após fazer o "backup" dos valores, atribui o novo array de tamanho maior ao vetor inicializado na classe
	    		this.alunos = novoArray;
			}
	    }
}

