package poo.medicos;

public class Medico {
	private int codigo;
	private String nome;
	private String sexo; 
	private int codigoEspecialidade;
	private String nomeEspecialidade;
	
	public Medico (int codigo, String nome, String sexo, int codigoEspecialidade, String nomeEspecialidade){
		this.codigo = codigo;
		this.nome = nome; 
		this.sexo = sexo;
		this.codigoEspecialidade = codigoEspecialidade;
		this.nomeEspecialidade = nomeEspecialidade;
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

	public String toString() {
		return  "\nCódigo do Médico: " + getCodigo() + "\nNome: " + getNome() + "\nSexo: " + getSexo() + "\nCódigo da Especialidade: " + getCodigoEspecialidade()+"\nNome Especialidade: " + getNomeEspecialidade();

	}
	
}
