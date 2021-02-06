package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consulta.Consulta;
import poo.consultorio.dao.ConsultasDAO;

public class ListarConsultas implements Comando{
	
	public void execute(Scanner entrada) throws IOException {
		ConsultasDAO dao = new ConsultasDAO();
		for(Consulta consulta:dao.getConsultas()){
		System.out.println(consulta);
		}
	}
}