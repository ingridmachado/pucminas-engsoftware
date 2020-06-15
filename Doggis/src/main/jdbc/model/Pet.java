package main.jdbc.model;

public class Pet {
	
	private Integer id;
	private String tipo;
	private String nome;
	private String raca;
	private String porte;
	private String alergias;
	private String descricao;
	private Boolean autorizaFoto;
	
	public Pet(Integer id, String tipo, String nome, String raca, String porte, String alergias, String descricao,
			Boolean autorizaFoto) {
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.raca = raca;
		this.porte = porte;
		this.alergias = alergias;
		this.descricao = descricao;
		this.autorizaFoto = autorizaFoto;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getAutorizaFoto() {
		return autorizaFoto;
	}

	public void setAutorizaFoto(Boolean autorizaFoto) {
		this.autorizaFoto = autorizaFoto;
	}
}