package oo.composicao;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author AlisonAvelino
 *
 */

public class Aluno {

	final String nome;
	List<Curso> cursos = new ArrayList<Curso>();
	
	Aluno(String nome) {
		this.nome = nome;
		this.cursos = new ArrayList<Curso>();
	}
	
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return null;
	}

	public String toString() {
		return nome;
	}
	
	
	
}
