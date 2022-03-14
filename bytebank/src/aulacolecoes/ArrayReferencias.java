package aulacolecoes;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class ArrayReferencias {

	public static void main(String[] args) {
		
		//declarando um array a partir de uma referência
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaCorrente cc2 =  new ContaCorrente(22, 22);
		
		// atribuindo a um posicao do vetor um valor de acordo com a referência declarada
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		

	}

}
