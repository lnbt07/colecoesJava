import java.util.HashSet;
import java.util.Set;

public class Exemplo3 {
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<String>();
		lista.add("maçã");
		lista.add("banana");
		lista.add("morango");
		lista.add("banana");
		lista.add("morango");
		lista.add("amora");
		
		System.out.println(lista);
	}
}
