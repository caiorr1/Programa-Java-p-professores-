package br.com.fiap.online;

import java.util.Scanner;

public class FIAPOnline {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Bem vindo professor! Por favor,digite seu nome");
		String nomeProfessor = leitor.nextLine();
		
		Professor umProfessor = new Professor(nomeProfessor);
		System.out.println("Olá " + umProfessor.exibir() + "!");
		
		int resposta = 1;
		while(resposta == 1) { 
			System.out.println("Digite a disciplina a ser ministrada: ");
			String disciplina = leitor.nextLine();
		
			System.out.println("Certo. Informe o nome da aula: ");
			String nomeAula = leitor.nextLine();
		
			System.out.println("Por último, informe o conteúdo da aula: ");
			String conteudoAula = leitor.nextLine();
			
			Roteiro umRoteiro = new Roteiro(disciplina,nomeAula,conteudoAula);
			umProfessor.adicionar(umRoteiro);
			
			System.out.println("Roteiro cadastrado " + umProfessor.exibir() + ". Deseja cadastrar mais algum roteiro? 1 - Sim, 2 - Não. ");
			resposta = leitor.nextInt();
		}
		
		umProfessor.exibirRoteiros();
		
		leitor.close();

	}

}
