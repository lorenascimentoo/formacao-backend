package aulacolecoes;

public class ArrayDePrimitivos {

	public static void main(String[] args) {
		
		// o array/vetor � definido pelo uso de chaves
		// ao inizializar um objeto do tipo array � obrigat�rio definir o tamanho do vetor
		int[] idades = new int[5];
		
		// la�o para atribui��o dos valores a cada posi��o do vetor
		for (int i = 0; i < idades.length; i++) {
			idades[i] = i*i;
		}
		
		// la�o para exibi��o dos valores de cada posi��o do vetor
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
