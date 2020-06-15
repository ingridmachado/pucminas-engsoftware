package main.jdbc.model;

public class Cartao extends Pagamento {
	
	private String numero;
	private Integer mesValidade;
	private Integer anoValidade;
	private Integer parcelamento;
	
	public Cartao(Integer id, Double valor, String numero, Integer mesValidade, Integer anoValidade,
			Integer parcelamento) {
		super(id, valor);
		this.numero = numero;
		this.mesValidade = mesValidade;
		this.anoValidade = anoValidade;
		this.parcelamento = parcelamento;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(Integer mesValidade) {
		this.mesValidade = mesValidade;
	}

	public Integer getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(Integer anoValidade) {
		this.anoValidade = anoValidade;
	}

	public Integer getParcelamento() {
		return parcelamento;
	}

	public void setParcelamento(Integer parcelamento) {
		this.parcelamento = parcelamento;
	}
}