package br.com.fiap.online;

import java.util.ArrayList;

public class Professor {
	
	String nome;
	ArrayList<Roteiro> roteiros;
	
	public Professor(String nomeProfessor) {
		this.nome = nomeProfessor;
		this.roteiros = new ArrayList<>();
	}
	
	public String exibir() {
		return "Prof." + nome;
	}
	
	public void adicionar(Roteiro umRoteiro) {
		roteiros.add(umRoteiro);
		
	}

	public void exibirRoteiros() {
		for(Roteiro roteiro : roteiros){
			roteiro.exibir();
		}
	}
}
