package main.jdbc.model;

import java.util.List;

public class Cliente {
	
	private Integer id;
	private String nome;
	private String identidade;
	private String cpf;
	private String endereco;
	private String email;
	private List<Pet> pets;
	private Integer pontosAcumulados;
	
	public Cliente(Integer id, String nome, String identidade, String cpf, String endereco, String email, List<Pet> pets, Integer pontosAcumulados) {
		this.id = id;
		this.nome = nome;
		this.identidade = identidade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.pets = pets;
		this.pontosAcumulados = pontosAcumulados;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public Integer getPontosAcumulados() {
		return pontosAcumulados;
	}

	public void setPontosAcumulados(Integer pontosAcumulados) {
		this.pontosAcumulados = pontosAcumulados;
	}
}