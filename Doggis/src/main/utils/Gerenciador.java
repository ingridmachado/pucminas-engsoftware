package main.utils;

import java.sql.SQLException;

import main.jdbc.ConnectionPool;
import main.jdbc.dao.AgendamentoDAO;
import main.jdbc.dao.ClienteDAO;
import main.jdbc.dao.VeterinarioDAO;
import main.jdbc.model.Agendamento;
import main.jdbc.model.Veterinario;

public class Gerenciador {
	
	// Caso de uso "Cadastrar veterinário"
	
	public void cadastrarVeterinario(String nome, String cpf, String identidade, String usuario, String senha, String registro, String tiposDePet, Integer avaliacao) {
		Veterinario veterinario = new Veterinario(null, nome, cpf, identidade, usuario, senha, registro, tiposDePet, avaliacao);
		
		if(validaRegistro(veterinario)) {
			try {
				VeterinarioDAO veterinarioDAO = new VeterinarioDAO(new ConnectionPool().getConnection());
				veterinarioDAO.create(veterinario);
				System.out.println("Veterinário cadastrado com sucesso!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("O registro inserido é inválido!");
		}
	}
	
	public Boolean validaRegistro(Veterinario veterinario) {
		if(veterinario.getRegistro().length() == 10) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	// Caso de uso "Avaliar profissional"
	
	public void avaliarVeterinario(Veterinario veterinario, int nota) {
		try {
			VeterinarioDAO veterinarioDAO = new VeterinarioDAO(new ConnectionPool().getConnection());
			veterinario.setAvaliacao(nota);
			veterinarioDAO.update(veterinario);
			System.out.println("Veterinário " + veterinario.getNome() + " avaliado!");
		} catch (SQLException e) {
			System.out.println("Erro na avaliação!");
			e.printStackTrace();
		}
	}
	
	public Veterinario buscaVeterinario(String registro) throws SQLException {
		VeterinarioDAO veterinarioDAO = new VeterinarioDAO(new ConnectionPool().getConnection());
		Veterinario veterinario = null;
		
		try {
			veterinario = veterinarioDAO.readFromRegister(registro);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(veterinario != null) {
			System.out.println("Veterinário " + veterinario.getNome() + " encontrado!");
		} else {
			System.out.println("Veterinário não encontrado!");
		}
		
		return veterinario;
	}
	
	// Caso de uso "Agendar serviço"
	
	public void agendarServico(Agendamento agendamento) {
		try {
			if(agendamento.getCliente().getId() == null) {
				ClienteDAO clienteDAO =  new ClienteDAO(new ConnectionPool().getConnection());
				clienteDAO.create(agendamento.getCliente());
			}
			
			AgendamentoDAO agendamentoDAO =  new AgendamentoDAO(new ConnectionPool().getConnection());
			agendamentoDAO.create(agendamento);
			
			System.out.println("Agendamento marcado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Erro ao marcar o agendamento!");
			e.printStackTrace();
		}
	}
}