package aulacolecoes;

public class ArrayDePrimitivos {

	public static void main(String[] args) {
		
		// o array/vetor é definido pelo uso de chaves
		// ao inizializar um objeto do tipo array é obrigatório definir o tamanho do vetor
		int[] idades = new int[5];
		
		// laço para atribuição dos valores a cada posição do vetor
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i*i;
		}
		
		// laço para exibição dos valores de cada posição do vetor
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
