package br.com.teste.jedisserialization.entities;

import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class Pet {

	private String nome;
	private String raça;

	private Integer idade;

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	public Pet(String nome, String raça, Integer idade) {
		this.nome = nome;
		this.raça = raça;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(nome, other.nome);
	}

}
