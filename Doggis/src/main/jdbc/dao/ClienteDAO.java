package main.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.jdbc.model.Cliente;
import main.jdbc.model.Pet;

public class ClienteDAO {
	private Connection connection;
	
	public ClienteDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void create(Cliente cliente) throws SQLException{
		
		String sqlcliente = "insert into Cliente(nome, identidade, cpf, endereco, email, pontos_acumulados) values (?, ?, ?, ?, ?, ?)";
		
		try(PreparedStatement stmt = connection.prepareStatement(sqlcliente, Statement.RETURN_GENERATED_KEYS)){
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getIdentidade());
			stmt.setString(3, cliente.getCpf());
			stmt.setString(4, cliente.getEndereco());
			stmt.setString(5, cliente.getEmail());
			stmt.setInt(6, cliente.getPontosAcumulados());
			
			stmt.execute();
			
			try(ResultSet rs = stmt.getGeneratedKeys()){
				if(rs.next()){
					int id = rs.getInt("id");
					cliente.setId(id);
				}
			}
		}
		
		if(!cliente.getPets().isEmpty()) {
			for (Pet pet : cliente.getPets()) {
				String sqlpet = "insert into Pet(tipo, nome, raca, porte, alergias, descricao, autoriza_foto) values (?, ?, ?, ?, ?, ?, ?)";
				
				try(PreparedStatement stmt = connection.prepareStatement(sqlpet, Statement.RETURN_GENERATED_KEYS)){
					stmt.setString(1, pet.getTipo());
					stmt.setString(2, pet.getNome());
					stmt.setString(3, pet.getRaca());
					stmt.setString(4, pet.getPorte());
					stmt.setString(5, pet.getAlergias());
					stmt.setString(6, pet.getDescricao());
					stmt.setBoolean(7, pet.getAutorizaFoto());
					
					stmt.execute();
					
					try(ResultSet rs = stmt.getGeneratedKeys()){
						if(rs.next()){
							int id = rs.getInt("id");
							pet.setId(id);
						}
					}
				}
				
				String sqlclientepet = "insert into ClientePets(id_cliente, id_pet) values (?, ?)";
				
				try(PreparedStatement stmt = connection.prepareStatement(sqlclientepet, Statement.RETURN_GENERATED_KEYS)){
					stmt.setInt(1, cliente.getId());
					stmt.setInt(2, pet.getId());
					
					stmt.execute();
					
					try(ResultSet rs = stmt.getGeneratedKeys()){
						if(rs.next()){
							int id = rs.getInt("id");
							System.out.println("Relacionamento entre cliente e pet salvo na tabela ClientePets - id " + id);
						}
					}
				}
			}
		}
	}
}