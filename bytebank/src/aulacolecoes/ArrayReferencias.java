package aulacolecoes;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class ArrayReferencias {

	public static void main(String[] args) {
		
		//declarando um array a partir de uma referência
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cc2 =  new ContaPoupanca(22, 22);
		
		// atribuindo a um posicao do vetor um valor de acordo com a referência declarada
		contas[0] = cc1;
		contas[1] = cc2;
		
		System.out.println(contas[0].getNumero());
		
		//utilizando o casting pra converter para um tipo mais especifico
		ContaCorrente ref = (ContaCorrente) contas[0];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		

	}

}
