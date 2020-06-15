package main.jdbc.model;

import java.util.List;

public class Atendente extends Usuario {
	
	private List<String> tiposDePet;
	private Integer avalicao;

	public Atendente(Integer id, String nome, String cpf, String identidade, String usuario, String senha, List<String> tiposDePet, Integer avalicao) {
		super(id, nome, cpf, identidade, usuario, senha);
		this.tiposDePet = tiposDePet;
		this.avalicao = avalicao;
	}

	public List<String> getTiposDePet() {
		return tiposDePet;
	}

	public void setTiposDePet(List<String> tiposDePet) {
		this.tiposDePet = tiposDePet;
	}

	public Integer getAvalicao() {
		return avalicao;
	}

	public void setAvalicao(Integer avalicao) {
		this.avalicao = avalicao;
	}
}