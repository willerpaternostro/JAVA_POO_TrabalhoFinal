package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consultorio.dao.MedicosDAO;
import poo.medicos.Medico;

public class ListarMedicos implements Comando {

	public void execute(Scanner entrada) throws IOException {
		MedicosDAO dao = new MedicosDAO();
			for(Medico medico:dao.getMedicos()){
				System.out.println(medico);
			}
		}
}
