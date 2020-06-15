package main.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.jdbc.model.Veterinario;

public class VeterinarioDAO {
	
	private Connection connection;
	
	public VeterinarioDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void create(Veterinario veterinario) throws SQLException{
		String sql = "insert into Veterinario(nome, cpf, identidade, usuario, senha, registro, tipos_de_pet, avaliacao) values (?, ?, ?, ?, ?, ?, ?, ?)";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			stmt.setString(1, veterinario.getNome());
			stmt.setString(2, veterinario.getCpf());
			stmt.setString(3, veterinario.getIdentidade());
			stmt.setString(4, veterinario.getUsuario());
			stmt.setString(5, veterinario.getSenha());
			stmt.setString(6, veterinario.getRegistro());
			stmt.setString(7, veterinario.getTiposDePet());
			stmt.setInt(8, veterinario.getAvaliacao());
			
			stmt.execute();
			
			try(ResultSet rs = stmt.getGeneratedKeys()){
				if(rs.next()){
					int id = rs.getInt("id");
					veterinario.setId(id);
				}
			}
		}
	}
	
	public List<Veterinario> readAll() throws SQLException{
		List<Veterinario> veterinarios = new ArrayList<Veterinario>();
		String sql = "select * from Veterinario";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.execute();
			
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()) {
					Veterinario veterinario = new Veterinario(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("identidade"), rs.getString("usuario"), rs.getString("senha"), rs.getString("registro"), rs.getString("tipos_de_pet"), rs.getInt("avaliacao"));
					veterinarios.add(veterinario);
				}
			}
		}
		
		return veterinarios;
	}
	
	public Veterinario read(Integer id) throws SQLException{
		Veterinario veterinario = null;
		String sql = "select * from Veterinario where id = ?";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setInt(1, id);
			stmt.execute();
			
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()) {
					veterinario = new Veterinario(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("identidade"), rs.getString("usuario"), rs.getString("senha"), rs.getString("registro"), rs.getString("tipos_de_pet"), rs.getInt("avaliacao"));
				}
			}
		}
		return veterinario;
	}
	
	public Veterinario readFromRegister(String registro) throws SQLException{
		Veterinario veterinario = null;
		String sql = "select * from Veterinario where registro = ?";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql)){
			stmt.setString(1, registro);
			stmt.execute();
			
			try(ResultSet rs = stmt.getResultSet()){
				while(rs.next()) {
					veterinario = new Veterinario(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("identidade"), rs.getString("usuario"), rs.getString("senha"), rs.getString("registro"), rs.getString("tipos_de_pet"), rs.getInt("avaliacao"));
				}
			}
		}
		return veterinario;
	}
	
	public void update(Veterinario veterinario) {
		String sql = "update Veterinario set nome=?, cpf=?, identidade=?, usuario=?, senha=?, registro=?, tipos_de_pet=?, avaliacao=? where id=?";
		
		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setString(1, veterinario.getNome());
			stmt.setString(2, veterinario.getCpf());
			stmt.setString(3, veterinario.getIdentidade());
			stmt.setString(4, veterinario.getUsuario());
			stmt.setString(5, veterinario.getSenha());
			stmt.setString(6, veterinario.getRegistro());
			stmt.setString(7, veterinario.getTiposDePet());
			stmt.setInt(8, veterinario.getAvaliacao());
			stmt.setInt(9, veterinario.getId());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void delete(Veterinario veterinario) {
		try {
			PreparedStatement stmt = connection.prepareStatement("delete from Veterinario where id=?");
			stmt.setLong(1, veterinario.getId());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}