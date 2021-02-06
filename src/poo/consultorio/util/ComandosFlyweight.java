package poo.consultorio.util;

import java.util.Hashtable;

import poo.consultorio.comando.AlterarMedico;
import poo.consultorio.comando.AlterarPaciente;
import poo.consultorio.comando.CadastrarConsulta;
import poo.consultorio.comando.CadastrarMedico;
import poo.consultorio.comando.CadastrarPaciente;
import poo.consultorio.comando.Comando;
import poo.consultorio.comando.GerarRelatorioConsultas;
import poo.consultorio.comando.ListarConsultas;
import poo.consultorio.comando.ListarMedicos;
import poo.consultorio.comando.ListarPacientes;
import poo.consultorio.comando.RemoverMedico;
import poo.consultorio.comando.RemoverPaciente;
import poo.consultorio.comando.Sair;

public class ComandosFlyweight {
	
	private Hashtable<String, Comando> comandos = new Hashtable<String, Comando>();

	public ComandosFlyweight() {		
		
		comandos.put("CM", new CadastrarMedico());
		comandos.put("AM", new AlterarMedico());
		comandos.put("RM", new RemoverMedico());
		comandos.put("LM", new ListarMedicos());
		comandos.put("CP", new CadastrarPaciente());
		comandos.put("AP", new AlterarPaciente());
		comandos.put("RP", new RemoverPaciente());
		comandos.put("LP", new ListarPacientes());
		comandos.put("CC", new CadastrarConsulta());
		comandos.put("LC", new ListarConsultas());
		comandos.put("GRC", new GerarRelatorioConsultas());
		comandos.put("S", new Sair());
	}
	
	public Comando getComando(String codigo) {
		return comandos.get(codigo);
	}
}

