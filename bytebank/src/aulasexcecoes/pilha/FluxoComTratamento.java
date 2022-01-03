package aulasexcecoes.pilha;

public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
			String msg = ex.getMessage();
			System.out.println("Exception "+ msg);
			// pega o rastro da excecao
			// exibe a pilha de execucao desde onde a excecao foi gerada
			ex.printStackTrace();
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() throws MinhaExcecao {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() throws MinhaExcecao {
		System.out.println("Ini do metodo2");
//		ArithmeticException exception = new ArithmeticException();
//		throw exception;
		throw new MinhaExcecao("Deu muito erro!");
		//System.out.println("Fim do metodo2");
		}
}
