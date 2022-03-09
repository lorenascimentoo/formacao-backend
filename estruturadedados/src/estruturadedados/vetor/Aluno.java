package estruturadedados.vetor;

//abstração da classe aluno
public class Aluno {
	
	//encapsulamento do atributo nome
	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		// Casting de Object para aluno
		Aluno outro = (Aluno) obj;
		// verifica se o nome do objeto recebido é igual ao da classe
		return outro.getNome().equals(this.nome);
	}
	
	@Override
	public String toString() {		
		return this.getNome();
	}
	
}
