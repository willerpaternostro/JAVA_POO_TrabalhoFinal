package poo.consultorio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import poo.consultorio.util.ConexaoConsultorioFabrica;
import poo.pacientes.Pacientes;

public class PacientesDAO {

	public void inserir(Pacientes paciente) throws SQLException {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "insert into pacientes (codigo,nome,sexo,endereco,telefone,codigo_plano,nome_plano) values (?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,paciente.getCodigo());
			ps.setString(2,paciente.getNome());
			ps.setString(3,paciente.getSexo());
			ps.setString(4,paciente.getEndereco());
			ps.setString(5,paciente.getTelefone());
			ps.setInt(6,paciente.getCodigoPlano());
			ps.setString(7,paciente.getNomePlano());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw (e);
		} 
	}
	
	
	public void atualizar(Pacientes paciente) {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "update pacientes set nome = ?, sexo = ?, endereco = ?, telefone = ?, codigo_plano = ?, nome_plano = ? where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,paciente.getNome());
			ps.setString(2,paciente.getSexo());
			ps.setString(3,paciente.getEndereco());
			ps.setString(4,paciente.getTelefone());
			ps.setInt(5,paciente.getCodigoPlano());
			ps.setString(6,paciente.getNomePlano());
			ps.setInt(7,paciente.getCodigo());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public void excluir(int codigo) {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "delete from pacientes where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,codigo);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public List<Pacientes> getPacientes() {
		try (Connection conn = ConexaoConsultorioFabrica.getConexao();){
			String sql = "select * from pacientes";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Pacientes> pacientes = new ArrayList<Pacientes>();
			while(rs.next()) {
				Pacientes paciente = new Pacientes(rs.getInt(1),
											rs.getString(2),
											rs.getString(3),
											rs.getString(4),
											rs.getString(5),
											rs.getInt(6),
											rs.getString(7));
				pacientes.add(paciente);
			}
			return pacientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
