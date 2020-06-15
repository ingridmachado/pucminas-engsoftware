package main.jdbc.model;

import java.util.Calendar;

public class Promocao {
	
	private Integer id;
	private Integer percentual;
	private Calendar dataInicial;
	private Calendar dataFinal;
	
	public Promocao(Integer id, Integer percentual, Calendar dataInicial, Calendar dataFinal) {
		super();
		this.id = id;
		this.percentual = percentual;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPercentual() {
		return percentual;
	}

	public void setPercentual(Integer percentual) {
		this.percentual = percentual;
	}

	public Calendar getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(Calendar dataInicial) {
		this.dataInicial = dataInicial;
	}

	public Calendar getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}
}