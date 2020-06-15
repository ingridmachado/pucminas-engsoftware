package main.jdbc.model;

public abstract class Pagamento {

	private Integer id;
	private Double valor;
	private Promocao promocao;
	
	public Pagamento(Integer id, Double valor) {
		this.id = id;
		this.valor = valor;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public Promocao getPromocao() {
		return promocao;
	}
	
	public void setPromocao(Promocao promocao) {
		this.promocao = promocao;
	}
	
	public void removePromocao() {
		this.promocao = null;
	}
}