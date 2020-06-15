package main.jdbc.model;

public class Produto {
	
	private Integer id;
	private String nome;
	private String fabricante;
	private String especificacoes;
	private Integer estoque;
	private Preco preco;
	
	public Produto(Integer id, String nome, String fabricante, String especificacoes, Integer estoque, Preco preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.fabricante = fabricante;
		this.especificacoes = especificacoes;
		this.estoque = estoque;
		this.preco = preco;
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

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getEspecificacoes() {
		return especificacoes;
	}

	public void setEspecificacoes(String especificacoes) {
		this.especificacoes = especificacoes;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public Preco getPreco() {
		return preco;
	}

	public void setPreco(Preco preco) {
		this.preco = preco;
	}
}