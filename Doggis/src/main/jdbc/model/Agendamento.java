package main.jdbc.model;

import java.util.Calendar;
import java.util.List;

public class Agendamento {
	
	private Integer id;
	private Cliente cliente;
	private Pet pet;
	private List<Servico> servicos;
	private Calendar data;
	private Usuario responsavel;
	private Boolean foiRealizado;
	private List<Produto> produtosComprados;
	private List<Pagamento> pagamentos;
	
	public Agendamento(Integer id, Cliente cliente, Pet pet, List<Servico> servicos, Calendar data, Usuario responsavel,
			Boolean foiRealizado, List<Produto> produtosComprados, List<Pagamento> pagamentos) {
		this.id = id;
		this.cliente = cliente;
		this.pet = pet;
		this.servicos = servicos;
		this.data = data;
		this.responsavel = responsavel;
		this.foiRealizado = foiRealizado;
		this.produtosComprados = produtosComprados;
		this.pagamentos = pagamentos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public Usuario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}

	public Boolean getFoiRealizado() {
		return foiRealizado;
	}

	public void setFoiRealizado(Boolean foiRealizado) {
		this.foiRealizado = foiRealizado;
	}

	public List<Produto> getProdutosComprados() {
		return produtosComprados;
	}

	public void setProdutosComprados(List<Produto> produtosComprados) {
		this.produtosComprados = produtosComprados;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setPagamentos(List<Pagamento> pagamentos) {
		this.pagamentos = pagamentos;
	}
}