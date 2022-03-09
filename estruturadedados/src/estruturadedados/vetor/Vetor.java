package estruturadedados.vetor;

import java.util.Arrays;
//primeira estrutura de dados
// do tipo armazenamento sequencial, os dados s�o guardados um ap�s o outro
public class Vetor {
	
		// cria��o de um Array(Vetor), deve-se obrigat�riamente colocar a posi��o
	    private Aluno[] alunos = new Aluno[100];
	    private int totalDeAlunos = 0;

	    public void adiciona(Aluno aluno) {
	    	//sempre garante que o vetor ter� espa�o para inserir itens
	    	this.garanteEspaco();
	        //recebe um aluno e insere no array
	    	this.alunos[this.totalDeAlunos] = aluno;
	    	//acrescenta uma posi��o para a pr�xima inser��o
	    	this.totalDeAlunos++;
	    }
	    
	    private boolean posicaoValida(int posicao) {
	    	return posicao>=0 && posicao <= this.totalDeAlunos;
	    }
	    
	    public void adiciona(int posicao, Aluno aluno) {
	    	//sempre garante que o vetor ter� espa�o para inserir itens
	    	this.garanteEspaco();
	    	//verifica se � uma posic�o valida
	    	// entra no fluxo do if se a posi��o for inv�lida e lan�a uma exce��o
	    	if (!this.posicaoValida(posicao)) {
				throw new IllegalArgumentException("Posi��o inv�lida!");
			}
	    	
	    	// varre o vetor da ultima posicao at� a posicao indicada para inser��o
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
	    	//verifica se � uma posic�o ocupada
	    	// entra no fluxo do if se a posi��o for inv�lida e lan�a uma exce��o
	    	if (!this.posicaoOcupada(posicao)) {
				throw new IllegalArgumentException("Posi��o inv�lida!");
			}
	        //recebe uma posi��o e devolve o aluno
	        return this.alunos[posicao];
	    }

	    public void remove(int posicao) {
	        //remove pela posi��o
	    	
	    	// varre o vetor da posicao a ser removida at� o total de posicoes no vetor 
	    	for (int i = posicao; i < this.totalDeAlunos; i++) {
	    		// atribui na posicao atual o item da posicao posterior
				this.alunos[i] = this.alunos[i+1];
			}
	    	//remove o ultimo item, subtraindo uma posicao do total
	    	this.totalDeAlunos--;
	    }

	    public boolean contem(Aluno aluno) {
	        //descobre se o aluno est� ou n�o na lista
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
	        //facilitar� na impress�o
	    	
	    	// faz com que apenas os valores v�lidos, ou seja n�o nulos, sejam impressos ao usuario
	    	Aluno[] alunosValidos = new Aluno[this.totalDeAlunos];
	    	for (int i = 0; i < this.totalDeAlunos; i++) {
				alunosValidos[i] = this.alunos[i];
			}
	        return Arrays.toString(alunosValidos);
	    }
	    
	    private void garanteEspaco() {
	    	// caso a quantidade de itens seja igual ao m�ximo permitido no vetor 
	    	if (this.totalDeAlunos == this.alunos.length) {
				// � instanciado um novo vetor com o dobro do tamanho atual
	    		Aluno[] novoArray = new Aluno[this.alunos.length*2];
	    		// faz um la�o para inserir todos os itens do vetor que estava cheio, para o novo vetor de tamanho maior
	    		for (int i = 0; i < this.alunos.length; i++) {
					novoArray[i] = this.alunos[i];
				}   		
	    		// ap�s fazer o "backup" dos valores, atribui o novo array de tamanho maior ao vetor inicializado na classe
	    		this.alunos = novoArray;
			}
	    }
}

