package main.jdbc.model;

public class Pontos extends Pagamento {
	
	private Integer quantidadeResgatada;

	public Pontos(Integer id, Double valor, Integer quantidadeResgatada) {
		super(id, valor);
		this.quantidadeResgatada = quantidadeResgatada;
	}

	public Integer getQuantidadeResgatada() {
		return quantidadeResgatada;
	}

	public void setQuantidadeResgatada(Integer quantidadeResgatada) {
		this.quantidadeResgatada = quantidadeResgatada;
	}
}