import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo1 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("carro");
		lista.add("bola");
		lista.add("avi�o");
		
		//impress�o usando o metodo lambda
		lista.forEach(objeto -> {
			System.out.println(objeto);
		});
		
		//impress�o bem simples
		System.out.println(lista);
		
		//ordenando a lista em ordem alfab�tica
		Collections.sort(lista);
		System.out.println(lista);
		
		//ordenando a lista em ordem decrescente
		Collections.sort(lista, Comparator.reverseOrder());
		System.out.println(lista);
	}

}