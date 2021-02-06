package poo.consultorio.comando;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import poo.consultorio.dao.MedicosDAO;
import poo.medicos.Medico;

public class CadastrarMedico implements Comando {

	@Override
	public void execute(Scanner entrada) throws IOException {
	
		
		System.out.println("Entre com o C�digo: ");
		int codigo = entrada.nextInt();
		System.out.println("Entre com o nome: ");
		String nome = entrada.next();
		System.out.println("Entre com o sexo: ");
		String sexo = entrada.next();

		int CodigoEspecialidade = 0;
		String NomeEspecialidade = "";
		
		do {	
			System.out.println("Entre com o c�digo da especialidade: ");
			CodigoEspecialidade = entrada.nextInt();
		
			if (CodigoEspecialidade==1) {
				NomeEspecialidade = "Cl�nico Geral";
			}else if(CodigoEspecialidade==2){
				NomeEspecialidade = "Cirurgi�o Pl�stico";
			}else if(CodigoEspecialidade==3) {
				NomeEspecialidade = "Anestesista";
			}else if(CodigoEspecialidade==4) {
				NomeEspecialidade = "Dermatologista";
			}else if (CodigoEspecialidade==5) {
				NomeEspecialidade = "Ortopedista";
			}else {
				System.out.println("C�digo de especialidade inv�lido!");
				CodigoEspecialidade=0;
			}
		}while(CodigoEspecialidade==0);
	
		Medico medico = new Medico(codigo,nome,sexo,CodigoEspecialidade,NomeEspecialidade);
		MedicosDAO dao = new MedicosDAO();
		try{
			dao.inserir(medico);
		}catch(SQLException e){
			System.out.println("\nC�digo do m�dico j� existe!");
		}
	}
}
