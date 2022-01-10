package br.com.bytebank.teste;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteContas {

	public static void main(String[] args) {
		
		//TESTANDO POLIMORFISMO
		ContaCorrente cc = new ContaCorrente(111,222);
		cc.deposita(100.0);
		
		SeguroDeVida seguro =  new SeguroDeVida();
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200);
		
		try {
			cc.transfere(10.0, cp);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("O saldo da conta corrente é: "+ cc.getSaldo());
		System.out.println("O saldo da conta poupança é: "+ cp.getSaldo());
		
		
		//System.out.println("CC: "+cc.getSaldo());
		//System.out.println("CP: "+cp.getSaldo());
		
		Conta ctest = new ContaCorrente(111,-222);
		
	}

}
