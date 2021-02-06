package poo.consultorio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import poo.consultorio.util.ConexaoConsultorioFabrica;
import poo.medicos.Medico;

public class MedicosDAO {
	
	public void inserir(Medico medico) throws SQLException {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "insert into medicos (codigo,nome,sexo,codigo_especialidade,nome_especialidade) values (?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,medico.getCodigo());
			ps.setString(2,medico.getNome());
			ps.setString(3,medico.getSexo());
			ps.setInt(4,medico.getCodigoEspecialidade());
			ps.setString(5,medico.getNomeEspecialidade());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw (e);
		} 
	}
	
	
	public void atualizar(Medico medico) {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "update medicos set nome = ?, sexo = ?, codigo_especialidade = ?, nome_especialidade = ? where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,medico.getNome());
			ps.setString(2,medico.getSexo());
			ps.setInt(3,medico.getCodigoEspecialidade());
			ps.setString(4,medico.getNomeEspecialidade());
			ps.setInt(5,medico.getCodigo());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public void excluir(int codigo) {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "delete from medicos where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,codigo);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public List<Medico> getMedicos() {
		try (Connection conn = ConexaoConsultorioFabrica.getConexao();){
			String sql = "select * from medicos";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Medico> medicos = new ArrayList<Medico>();
			while(rs.next()) {
				Medico medico = new Medico(rs.getInt(1),
											rs.getString(2),
											rs.getString(3),
											rs.getInt(4),
											rs.getString(5));
				medicos.add(medico);
			}
			return medicos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
