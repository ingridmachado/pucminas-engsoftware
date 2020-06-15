package main.jdbc.model;

public class Veterinario extends Usuario {
	
	private String registro;
	private String tiposDePet;
	private Integer avaliacao;
	
	public Veterinario(Integer id, String nome, String cpf, String identidade, String usuario, String senha, String registro, String tiposDePet, Integer avaliacao) {
		super(id, nome, cpf, identidade, usuario, senha);
		this.registro = registro;
		this.tiposDePet = tiposDePet;
		this.avaliacao = avaliacao;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getTiposDePet() {
		return tiposDePet;
	}

	public void setTiposDePet(String tiposDePet) {
		this.tiposDePet = tiposDePet;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}
}