package estudojava.executavel;

import estudojava.classes.Aluno;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// new aluno é uma instância (criação de objeto)

		/* aluno1 é uma referencia para o objeto aluno **/
		Aluno aluno1 = new Aluno("");
		aluno1.nome = "João";
		aluno1.idade = 15;
		System.out.println(" Nome do deste aluno é = " + aluno1.nome); // tipos de concatenação
		System.out.println(" O aluno a cima " + "(" + aluno1.nome + ")" + " que foi selecionado tem a idade de " + aluno1.idade
				+ " anos de idade ");
		/* Agora aqui tem um objeto real */
		Aluno aluno2 = new Aluno(null);
		Aluno aluno3 = new Aluno(null);
		Aluno aluno4 = new Aluno("Maria");
		Aluno aluno5 = new Aluno("José", 50);

	}

}
