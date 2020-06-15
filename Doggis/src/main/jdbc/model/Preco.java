package main.jdbc.model;

import java.util.Calendar;

public class Preco {
	
	private Integer id;
	private Double atual;
	private Double anterior;
	private Calendar dataAlteracao;
	private Usuario responsavelAlteracao;
	
	public Preco(Integer id, Double atual, Double anterior, Calendar dataAlteracao, Usuario responsavelAlteracao) {
		this.id = id;
		this.atual = atual;
		this.anterior = anterior;
		this.dataAlteracao = dataAlteracao;
		this.responsavelAlteracao = responsavelAlteracao;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getAtual() {
		return atual;
	}
	
	public void setAtual(Double atual) {
		this.atual = atual;
	}
	
	public Double getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Double anterior) {
		this.anterior = anterior;
	}
	
	public Calendar getDataAlteracao() {
		return dataAlteracao;
	}
	
	public void setDataAlteracao(Calendar dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}
	
	public Usuario getResponsavelAlteracao() {
		return responsavelAlteracao;
	}
	
	public void setResponsavelAlteracao(Usuario responsavelAlteracao) {
		this.responsavelAlteracao = responsavelAlteracao;
	}
}
