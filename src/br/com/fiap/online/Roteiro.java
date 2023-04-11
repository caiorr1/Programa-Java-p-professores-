package br.com.fiap.online;

public class Roteiro {
	
	String disciplina;
	String aula;
	String conteudo;
	
	public Roteiro(String disciplina, String nomeAula, String conteudoAula) {
		this.disciplina = disciplina;
		this.aula = nomeAula;
		this.conteudo = conteudoAula;
		
		
	}

	public void exibir() {
		System.out.println("Disciplina: " + disciplina + ", Aula: " + aula + ", Conteúdo: " + conteudo);
		
	}


}
