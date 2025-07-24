package estudojava.classes;

public class Aluno { /*objeto*/
	String nome;
	int idade;
	String dataNascimento;
	String localNascimento;  // atributos e parametros
	String matricula;
	String serieMatriculada;
	String nomeEscola;
	String dataMatricula;
	String nomeMae;
	String nomePai;

	public Aluno(String nomePadrao) { // aqui serve para criar os dados na memoria
		nome = nomePadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao) { // construtores
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
