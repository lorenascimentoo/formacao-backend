package bytebank;

public class TesteSaca {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(200);
		
		try {
			conta.saca(210);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(conta.getSaldo());
	}

}
