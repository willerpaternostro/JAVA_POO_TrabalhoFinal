package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consultorio.dao.PacientesDAO;
import poo.pacientes.Pacientes;

public class ListarPacientes implements Comando {

	public void execute(Scanner entrada) throws IOException {
		PacientesDAO dao = new PacientesDAO();
			for(Pacientes paciente:dao.getPacientes()){
				System.out.println(paciente);
			}
		}
}
