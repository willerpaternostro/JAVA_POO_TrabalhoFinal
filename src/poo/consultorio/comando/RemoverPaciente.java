package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consultorio.dao.PacientesDAO;

public class RemoverPaciente implements Comando {
	
	public void execute(Scanner entrada) throws IOException {
		
		PacientesDAO dao = new PacientesDAO();
		System.out.println("Entre com o Código: ");
		int codigo = entrada.nextInt();
	
		dao.excluir(codigo);
	}
}
