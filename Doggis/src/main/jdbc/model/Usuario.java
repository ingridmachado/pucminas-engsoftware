package main.jdbc.model;

public class Usuario {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String identidade;
	private String usuario;
	private String senha;	
	
	public Usuario(Integer id, String nome, String cpf, String identidade, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.identidade = identidade;
		this.usuario = usuario;
		this.senha = senha;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}