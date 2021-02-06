package poo.consultorio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import poo.consulta.Consulta;
import poo.consultorio.util.ConexaoConsultorioFabrica;

public class ConsultasDAO {

	public void inserir(Consulta consulta) throws SQLException {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "insert into consultas (codigo,codigo_medico,nome_medico,codigo_especialidade,nome_especialidade,"
												+ "nome_paciente,codigo_doenca,nome_doenca,data_consulta,hora_consulta,codigo_plano,"
												+ "nome_plano) values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,consulta.getCodigoConsulta());
			ps.setInt(2,consulta.getCodigoMedico());
			ps.setString(3,consulta.getNomeMedico());
			ps.setInt(4,consulta.getCodigoEspecialidade());
			ps.setString(5,consulta.getNomeEspecialidade());
			ps.setString(6,consulta.getNomePaciente());
			ps.setInt(7,consulta.getCodigoDoenca());
			ps.setString(8,consulta.getNomeDoenca());
			ps.setString(9,consulta.getDataConsulta());
			ps.setString(10,consulta.getHoraConsulta());
			ps.setInt(11,consulta.getCodigoPlano());
			ps.setString(12,consulta.getNomePlano());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw (e);
		} 
	}
	

	public void atualizar(Consulta consulta) {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "update consultas set codigo_medico = ?, nome_medico = ?, codigo_especialidade = ?, nome_especialidade = ?, "
					+ " nome_paciente = ?, codigo_doenca = ?, nome_doenca = ?, data_consulta = ?, hora_consulta = ?, codigo_plano = ?, nome_plano = ? where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,consulta.getCodigoConsulta());
			ps.setInt(2,consulta.getCodigoMedico());
			ps.setString(3,consulta.getNomeMedico());
			ps.setInt(4,consulta.getCodigoEspecialidade());
			ps.setString(5,consulta.getNomeEspecialidade());
			ps.setString(6,consulta.getNomePaciente());
			ps.setInt(7,consulta.getCodigoDoenca());
			ps.setString(8,consulta.getNomeDoenca());
			ps.setString(9,consulta.getDataConsulta());
			ps.setString(10,consulta.getHoraConsulta());
			ps.setInt(11,consulta.getCodigoPlano());
			ps.setString(12,consulta.getNomePlano());
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public void excluir(int codigo) {
		try(Connection conn = ConexaoConsultorioFabrica.getConexao();) { //try with resources
			String sql = "delete from consultas where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1,codigo);
			ps.executeUpdate();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
	}
	
	public Consulta getConsultas(int codigo) {
		try (Connection conn = ConexaoConsultorioFabrica.getConexao();){
			String sql = "select * from consultas where codigo = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, codigo);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Consulta consultas = new Consulta(rs.getInt(1),
						rs.getInt(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5),
						rs.getString(6),
						rs.getInt(7),
						rs.getString(8),
						rs.getString(9),
						rs.getString(10),
						rs.getInt(11),
						rs.getString(12));
				return consultas;
			}
			return null;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	
	public List<Consulta> getConsultas() {
		try (Connection conn = ConexaoConsultorioFabrica.getConexao();){
			String sql = "select * from consultas";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Consulta> consultas = new ArrayList<Consulta>();
			while(rs.next()) {
				Consulta consulta = new Consulta(rs.getInt(1),
											rs.getInt(2),
											rs.getString(3),
											rs.getInt(4),
											rs.getString(5),
											rs.getString(6),
											rs.getInt(7),
											rs.getString(8),
											rs.getString(9),
											rs.getString(10),
											rs.getInt(11),
											rs.getString(12));
				consultas.add(consulta);
			}
			return consultas;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
