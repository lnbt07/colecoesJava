import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Disciplina {
	private String nome;
	private String professor;
	private List<Aula> listaAula;
	private Set<Aluno> listaAluno; //não permite duplicada de informações e a ordem não é importante
	
	public Disciplina(String nome, String professor, List<Aula> listaAula) {
		this.nome = nome;
		this.professor = professor;
		this.listaAula = listaAula;
		this.listaAluno = new HashSet<Aluno>();
	}
	
	public void matricular(Aluno aluno) {
		listaAluno.add(aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return listaAluno.contains(aluno);
	}
}
