package estruturadedados.vetor;

public class VetorTeste {

	public static void main(String[] args) {
		// instancia um novo objeto do tipo aluno
		// inicializa o objeto a partir do construtor
		Aluno a1 = new Aluno("Joao");
		Aluno a2 = new Aluno("Jose");
		
		// instacia um objeto do tipo vetor
		Vetor lista = new Vetor();
		System.out.println(lista.tamanho());
		lista.adiciona(a1);
		System.out.println(lista.tamanho());
		lista.adiciona(a2);
		System.out.println(lista.tamanho());
		
		System.out.println(lista);
				
		System.out.println(lista.contem(a1));
		
		Aluno a3 = new Aluno("Danilo");
		System.out.println(lista.contem(a3));
		lista.adiciona(0, a3);
		System.out.println(lista);
		
		Aluno x = lista.pega(1);
		System.out.println(x);
		
		lista.remove(1);
		System.out.println(lista);
		
		for(int i = 0; i < 300; i++) {
		    Aluno y = new Aluno("Joao" + i);
		    lista.adiciona(y);
		}
		System.out.println(lista);
		
	}

}
