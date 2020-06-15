package main.utils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import main.jdbc.model.Agendamento;
import main.jdbc.model.Cliente;
import main.jdbc.model.Pet;
import main.jdbc.model.Preco;
import main.jdbc.model.Produto;
import main.jdbc.model.Servico;
import main.jdbc.model.Veterinario;

public class Doggis {

	public static void main(String[] args) throws SQLException {
		Gerenciador gerenciador = new Gerenciador();
		
		// Caso de uso "Cadastrar veterinário"
		
		gerenciador.cadastrarVeterinario("Maria Joaquina", "0001110000", "1001111", "maria.joaquina", "senhaforte", "1234567890", "peixe, papagaio", 5);
		
		// Caso de uso "Avaliar profissional"
		
		gerenciador.avaliarVeterinario(gerenciador.buscaVeterinario("0123456789"), 3);
		
		// Caso de uso "Agendar serviço"
		
		Pet pet1 = new Pet(null, "cachorro", "lica", "pinscher", "pequeno", "nenhuma", "tem medo de todo mundo", true);
		Pet pet2 = new Pet(null, "gato","laica", "siamês", "", "alergia a ração", "não gosta de banho", false);
		 
		List<Pet> pets = new ArrayList<Pet>(); pets.add(pet1); pets.add(pet2);
		 
		Cliente cliente= new Cliente(null, "Maria do Bairro", "9999999", "000.000.000-00", "Rua da Esperança", "maria@gmail.com", pets, 0);
		 
		Preco preco = new Preco(null, 30.00, 30.00, null, null);
		Produto produto = new Produto(null, "Shampoo", "Dove", "Shampoo pra cachorro", 10, preco);
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(produto);
		 
		Veterinario veterinario =
		gerenciador.buscaVeterinario("0123456789");
		
		Servico servico = new Servico(null, "banho", 1, preco, produtos, veterinario, 8, 80);
		List<Servico> servicos = new ArrayList<Servico>();
		servicos.add(servico);
		 
		Agendamento agendamento = new Agendamento(null, cliente, pet1, servicos,
		Calendar.getInstance(), veterinario, false, null, null);
		 
		gerenciador.agendarServico(agendamento);
	}
}