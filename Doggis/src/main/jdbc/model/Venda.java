package main.jdbc.model;

import java.util.List;

public class Venda {
	
	private Integer id;
	private List<Produto> produtos;
	private Pagamento pagamento;
	private Cliente cliente;
	private Usuario vendedor; 
	
	public Venda(Integer id, List<Produto> produtos, Pagamento pagamento, Cliente cliente, Usuario vendedor) {
		this.id = id;
		this.produtos = produtos;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.vendedor = vendedor;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	public Pagamento getPagamento() {
		return pagamento;
	}
	
	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Usuario getVendedor() {
		return vendedor;
	}
	
	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}
}