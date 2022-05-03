import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exemplo2 {
	public static void main(String[] args) {
		
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno(500, "Roberta", "SI"));
		lista.add(new Aluno(200, "Maria", "Eng"));
		lista.add(new Aluno(700, "Ana", "Banco"));
		
		//ordenando em ordem alfabetica
		Collections.sort(lista);
		System.out.println(lista); //toString de cada elemento
		
		//ordenar pelo nome usando um criterio de comparação --> Comparator
		lista.sort(Comparator.comparing(Aluno::getNome));
		System.out.println(lista);
		
		//ordenar pelo rm usando um criterio de comparação --> Comparator
		lista.sort(Comparator.comparing(Aluno::getRM));
		System.out.println(lista);
		
		//ordenar pelo curso usando um criterio de comparação --> Comparator
		lista.sort(Comparator.comparing(Aluno::getCurso));
		System.out.println(lista);
	
	}
}
