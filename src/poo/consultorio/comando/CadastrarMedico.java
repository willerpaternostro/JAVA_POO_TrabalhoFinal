package poo.consultorio.comando;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import poo.consultorio.dao.MedicosDAO;
import poo.medicos.Medico;

public class CadastrarMedico implements Comando {

	@Override
	public void execute(Scanner entrada) throws IOException {
	
		
		System.out.println("Entre com o Código: ");
		int codigo = entrada.nextInt();
		System.out.println("Entre com o nome: ");
		String nome = entrada.next();
		System.out.println("Entre com o sexo: ");
		String sexo = entrada.next();

		int CodigoEspecialidade = 0;
		String NomeEspecialidade = "";
		
		do {	
			System.out.println("Entre com o código da especialidade: ");
			CodigoEspecialidade = entrada.nextInt();
		
			if (CodigoEspecialidade==1) {
				NomeEspecialidade = "Clínico Geral";
			}else if(CodigoEspecialidade==2){
				NomeEspecialidade = "Cirurgião Plástico";
			}else if(CodigoEspecialidade==3) {
				NomeEspecialidade = "Anestesista";
			}else if(CodigoEspecialidade==4) {
				NomeEspecialidade = "Dermatologista";
			}else if (CodigoEspecialidade==5) {
				NomeEspecialidade = "Ortopedista";
			}else {
				System.out.println("Código de especialidade inválido!");
				CodigoEspecialidade=0;
			}
		}while(CodigoEspecialidade==0);
	
		Medico medico = new Medico(codigo,nome,sexo,CodigoEspecialidade,NomeEspecialidade);
		MedicosDAO dao = new MedicosDAO();
		try{
			dao.inserir(medico);
		}catch(SQLException e){
			System.out.println("\nCódigo do médico já existe!");
		}
	}
}
