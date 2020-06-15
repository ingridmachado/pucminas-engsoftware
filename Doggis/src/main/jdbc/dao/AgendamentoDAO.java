package main.jdbc.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import main.jdbc.model.Agendamento;

public class AgendamentoDAO {
	
	private Connection connection;
	
	public AgendamentoDAO(Connection connection) {
		this.connection = connection;
	}
	
	public void create(Agendamento agendamento) throws SQLException{
		String sql = "insert into Agendamento(id_cliente, id_pet, data, id_responsavel, realizado) values (?, ?, ?, ?, ?)";
		
		try(PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			stmt.setInt(1, agendamento.getCliente().getId());
			stmt.setInt(2, agendamento.getPet().getId());
			stmt.setDate(3, new Date(agendamento.getData().getTimeInMillis()));
			stmt.setInt(4, agendamento.getResponsavel().getId());
			stmt.setBoolean(5, agendamento.getFoiRealizado());
			
			stmt.execute();
			
			try(ResultSet rs = stmt.getGeneratedKeys()){
				if(rs.next()){
					int id = rs.getInt("id");
					agendamento.setId(id);
				}
			}
		}
	}
}