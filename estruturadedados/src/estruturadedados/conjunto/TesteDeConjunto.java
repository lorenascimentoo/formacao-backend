package estruturadedados.conjunto;

import java.util.HashSet;
import java.util.Set;

public class TesteDeConjunto {
	public static void main(String[] args) {
		Conjunto conjunto = new Conjunto();
        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);
        
        conjunto.remove("Mauricio");
        System.out.println(conjunto);
        
        //implementacao do java para utilizacao de conjuntos
        Set<String> conjuntoDoJava = new HashSet<String>();
        conjuntoDoJava.add("Mauricio");
        conjuntoDoJava.add("Guilherme");
        
        System.out.println(conjuntoDoJava);
	}
}
