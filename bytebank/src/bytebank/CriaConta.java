package bytebank;

import aulasheranca.Cliente;

public class CriaConta {
	
	public static void main(String[] args) {
		
		ContaCorrente primeiraConta = new ContaCorrente(1315,15987);
		primeiraConta.setTitular(new Cliente());
		primeiraConta.getTitular().setNome("Paulo");
		primeiraConta.deposita(200);
		System.out.println(primeiraConta.getSaldo());
		
		primeiraConta.deposita(100);
		System.out.println(primeiraConta.getSaldo());
		
		ContaCorrente segundaConta = new ContaCorrente(1213,14506);
		segundaConta.setTitular(new Cliente());
		segundaConta.getTitular().setNome("Ana");
		segundaConta.deposita(50);
		
		System.out.println("primeira conta tem "+primeiraConta.getSaldo());
		System.out.println("Segunda conta tem "+segundaConta.getSaldo());
		
		System.out.println(primeiraConta);
		
		//# TESTANDO M�TODOS
		
		primeiraConta.deposita(1000);
		System.out.println("Ol� " + primeiraConta.getTitular().getNome() + ", seu saldo �: " + primeiraConta.getSaldo());
		
		/*if(primeiraConta.transfere(200, segundaConta)) {
			System.out.println("Hey " + primeiraConta.getTitular().getNome());
			System.out.println("Sua transferencia para " + segundaConta.getTitular().getNome() +
					           " foi realizada com sucesso! Seu novo saldo �: " + primeiraConta.getSaldo());
		} else {
			System.out.println("Hey " + primeiraConta.getTitular().getNome() +", seu saldo � insuficiente. :(");
		}*/
		
		System.out.println(Conta.getTotal());
		
		
		
		
	}
}
