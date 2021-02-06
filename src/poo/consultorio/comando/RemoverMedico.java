package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consultorio.dao.MedicosDAO;

public class RemoverMedico implements Comando {
	
	public void execute(Scanner entrada) throws IOException {
		
		MedicosDAO dao = new MedicosDAO();
		System.out.println("Entre com o Código: ");
		int codigo = entrada.nextInt();
	
		dao.excluir(codigo);
	}
}
