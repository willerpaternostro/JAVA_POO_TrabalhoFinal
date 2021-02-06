package poo.consulta;

public class Consulta {
	private int codigoConsulta;
	private int codigoMedico;
	private String nomeMedico;
	private int codigoEspecialidade;
	private String nomeEspecialidade;
	private String nomePaciente;
	private int codigoDoenca;
	private String nomeDoenca;
	private String dataConsulta;
	private String horaConsulta;
	private int codigoPlano;
	private String nomePlano;
	
	public Consulta(int codigoConsulta, int codigoMedico, String nomeMedico, int codigoEspecialidade,
		String nomeEspecialidade, String nomePaciente, int codigoDoenca, String nomeDoenca, String dataConsulta,
		String horaConsulta,int codigoPlano, String nomePlano) {
		super();
		this.codigoConsulta = codigoConsulta;
		this.codigoMedico = codigoMedico;
		this.nomeMedico = nomeMedico;
		this.codigoEspecialidade = codigoEspecialidade;
		this.nomeEspecialidade = nomeEspecialidade;
		this.nomePaciente = nomePaciente;
		this.codigoDoenca = codigoDoenca;
		this.nomeDoenca = nomeDoenca;
		this.dataConsulta = dataConsulta;
		this.horaConsulta = horaConsulta;
		this.codigoPlano = codigoPlano;
		this.nomePlano = nomePlano;
	}

	
	
	public int getCodigoConsulta() {
		return codigoConsulta;
	}



	public void setCodigoConsulta(int codigoConsulta) {
		this.codigoConsulta = codigoConsulta;
	}



	public int getCodigoMedico() {
		return codigoMedico;
	}



	public void setCodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
	}



	public String getNomeMedico() {
		return nomeMedico;
	}



	public void setNomeMedico(String nomeMedico) {
		this.nomeMedico = nomeMedico;
	}



	public int getCodigoEspecialidade() {
		return codigoEspecialidade;
	}



	public void setCodigoEspecialidade(int codigoEspecialidade) {
		this.codigoEspecialidade = codigoEspecialidade;
	}



	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}



	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}



	public String getNomePaciente() {
		return nomePaciente;
	}



	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}



	public int getCodigoDoenca() {
		return codigoDoenca;
	}



	public void setCodigoDoenca(int codigoDoenca) {
		this.codigoDoenca = codigoDoenca;
	}



	public String getNomeDoenca() {
		return nomeDoenca;
	}



	public void setNomeDoenca(String nomeDoenca) {
		this.nomeDoenca = nomeDoenca;
	}



	public String getDataConsulta() {
		return dataConsulta;
	}



	public void setDataConsulta(String dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}



	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}


	public int getCodigoPlano() {
		return codigoPlano;
	}



	public void setCodigoPlano(int codigoPlano) {
		this.codigoPlano = codigoPlano;
	}



	public String getNomePlano() {
		return nomePlano;
	}



	public void setNomePlano(String nomePlano) {
		this.nomePlano = nomePlano;
	}



	@Override
	public String toString() {
		return "Consulta [codigoConsulta=" + codigoConsulta + ", codigoMedico=" + codigoMedico + ", nomeMedico="
				+ nomeMedico + ", codigoEspecialidade=" + codigoEspecialidade + ", nomeEspecialidade="
				+ nomeEspecialidade + ", nomePaciente=" + nomePaciente + ", codigoDoenca=" + codigoDoenca
				+ ", nomeDoenca=" + nomeDoenca + ", dataConsulta=" + dataConsulta + ", codigoPlano=" + codigoPlano + 
				", nomePlano=" + nomePlano + "]";
	}
	
}
