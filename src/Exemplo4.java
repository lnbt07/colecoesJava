import java.util.HashMap;
import java.util.Map;

public class Exemplo4 {

	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new HashMap<Integer, String>();
		mapa.put(1,  "uva");
		mapa.put(2,  "amora");
		mapa.put(3,  "manga");

		System.out.println(mapa.get(2));
		
		mapa.forEach((k, v) -> {
			System.out.println(k+" "+v);
		});
	}

}
