package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consultorio.dao.PacientesDAO;
import poo.pacientes.Pacientes;

public class AlterarPaciente implements Comando {
	
	public void execute(Scanner entrada) throws IOException {
		
		System.out.println("Entre com o C�digo: ");
		int codigo = entrada.nextInt();
		System.out.println("Entre com o nome: ");
		String nome = entrada.next();
		entrada.nextLine();
		System.out.println("Entre com o sexo: ");
		String sexo = entrada.next();
		entrada.nextLine();
		System.out.println("Entre com o endere�o: ");
		String endereco = entrada.next();
		entrada.nextLine();
		System.out.println("Entre com o telefone: ");
		String telefone = entrada.next();
	
		String nomePlano = "";
		int codigoPlano = 0;
		
		do {
			System.out.println("Entre com o c�digo do plano de sa�de: ");
			codigoPlano = entrada.nextInt();
			
			if (codigoPlano==1) {
				nomePlano = "Unimed";
			}else if(codigoPlano==2){
				nomePlano = "S�o Francisco";
			}else if(codigoPlano==3) {
				nomePlano = "Bradesco Seguros";
			}else {
				System.out.println("N�mero do plano inv�lido!");
				codigoPlano=0;
			}
		}while(codigoPlano==0);
	
		Pacientes paciente = new Pacientes(codigo,nome,sexo,endereco,telefone,codigoPlano,nomePlano);
		PacientesDAO dao = new PacientesDAO();
		dao.atualizar(paciente);
	}
}
