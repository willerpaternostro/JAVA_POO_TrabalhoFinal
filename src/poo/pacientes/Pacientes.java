package poo.pacientes;

public class Pacientes {
	private int codigo;
	private String nome;
	private String sexo; 
	private String endereco;
	private String telefone; 
	private int codigoPlano;
	private String nomePlano;
	
	public Pacientes (int codigo, String nome, String sexo, String endereco, String telefone, int codigoPlano, String nomePlano){
		this.codigo = codigo;
		this.nome = nome; 
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;
		this.codigoPlano = codigoPlano;
		this.nomePlano = nomePlano;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
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

	public String toString() {
		return "Paciente Código: " + codigo + "\nNome: " + nome + "\nSexo: " + sexo + "\nEndereço: " + endereco + "\nTelefone: " + telefone + "\nCódigo do Plano de Saúde: " + codigoPlano + "\nNome do Plano de Saúde: " + nomePlano + "\n";
	}
}
