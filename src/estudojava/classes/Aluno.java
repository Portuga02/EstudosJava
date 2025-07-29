package estudojava.classes;

public class Aluno { /*objeto (nome da classe) */
	// aqui são os atributos da classe
	// por padrao o java deixa os atributos privados tem que deixar public
	public String nome;
	public int idade;
	public String dataNascimento;
	public String localNascimento;  // atributos e parametros
	public String matricula;
	public String serieMatriculada;
	public String nomeEscola;
	public String dataMatricula;
	public String nomeMae;
	public String nomePai;

	public Aluno(String nomePadrao) { // aqui serve para criar os dados na memoria
		nome = nomePadrao;
	}
	public Aluno(String nomePadrao, int idadePadrao) { // construtores
		nome = nomePadrao;
		idade = idadePadrao;
	}

}
