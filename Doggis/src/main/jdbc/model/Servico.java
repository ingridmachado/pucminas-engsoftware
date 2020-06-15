package main.jdbc.model;

import java.util.List;

public class Servico {
	
	private Integer id;
	private String tipo;
	private Integer tempoEstimado;
	private Preco preco;
	private List<Produto> produtos;
	private Usuario responsavel;
	private Integer pontosGanhos;
	private Integer valorEmPontos;
	
	public Servico(Integer id, String tipo, Integer tempoEstimado, Preco preco, List<Produto> produtos, Usuario responsavel, Integer pontosGanhos, Integer valorEmPontos) {
		this.id = id;
		this.tipo = tipo;
		this.tempoEstimado = tempoEstimado;
		this.preco = preco;
		this.produtos = produtos;
		this.responsavel = responsavel;
		this.pontosGanhos = pontosGanhos;
		this.valorEmPontos = valorEmPontos;
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
	
	public Integer getTempoEstimado() {
		return tempoEstimado;
	}
	
	public void setTempoEstimado(Integer tempoEstimado) {
		this.tempoEstimado = tempoEstimado;
	}
	
	public Preco getPreco() {
		return preco;
	}
	
	public void setPreco(Preco preco) {
		this.preco = preco;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Usuario getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Integer getPontosGanhos() {
		return pontosGanhos;
	}

	public void setPontosGanhos(Integer pontosGanhos) {
		this.pontosGanhos = pontosGanhos;
	}

	public Integer getValorEmPontos() {
		return valorEmPontos;
	}

	public void setValorEmPontos(Integer valorEmPontos) {
		this.valorEmPontos = valorEmPontos;
	}
}