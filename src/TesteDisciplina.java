import java.util.ArrayList;
import java.util.List;

public class TesteDisciplina {
	
	public static void main(String[] args) {
		//criação da lista das aulas
		List<Aula> listaAula = new ArrayList<Aula>();
		listaAula.add(new Aula("Herança", 60));
		listaAula.add(new Aula("Polimorfismo", 100));
		
		//criação da disciplina
		Disciplina disciplina = new Disciplina("POO", "Ismael", listaAula);
		
		//alunos
		Aluno aluno1 = new Aluno(1, "Selmini", "SI");
		Aluno aluno2 = new Aluno(2, "Patricia", "Eng");
		
		//matricular os alunos
		disciplina.matricular(aluno1);
		disciplina.matricular(aluno2);
		
		//verificar(boolean) se o aluno está matriculado
		System.out.println(disciplina.estaMatriculado(aluno1));
		
	}
	
	
}
