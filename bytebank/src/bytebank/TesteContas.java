package bytebank;

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
		
		cc.transfere(10.0, cp);
		System.out.println("O saldo da conta corrente é: "+ cc.getSaldo());
		System.out.println("O saldo da conta poupança é: "+ cp.getSaldo());
		
		
		//System.out.println("CC: "+cc.getSaldo());
		//System.out.println("CP: "+cp.getSaldo());
		
	}

}
