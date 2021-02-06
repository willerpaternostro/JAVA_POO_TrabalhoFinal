package poo.consultorio.comando;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import poo.consulta.Consulta;
import poo.consultorio.dao.ConsultasDAO;

public class CadastrarConsulta implements Comando {

	@Override
	public void execute(Scanner entrada) throws IOException {
	
		System.out.println("Entre com o código da consulta: ");
		int codigoConsulta = entrada.nextInt();
		System.out.println("Entre com o código do médico: ");
		int codigoMedico = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Entre com o nome do médico: ");
		String nomeMedico = entrada.next();
		
		int codigoEspecialidade = 0;
		String nomeEspecialidade = "";
		
		do {	
			System.out.println("Entre com o código da especialidade: ");
			codigoEspecialidade = entrada.nextInt();
		
			if (codigoEspecialidade==1) {
				nomeEspecialidade = "Clínico Geral";
			}else if(codigoEspecialidade==2){
				nomeEspecialidade = "Cirurgião Plástico";
			}else if(codigoEspecialidade==3) {
				nomeEspecialidade = "Anestesista";
			}else if(codigoEspecialidade==4) {
				nomeEspecialidade = "Dermatologista";
			}else if (codigoEspecialidade==5) {
				nomeEspecialidade = "Ortopedista";
			}else {
				System.out.println("Código de especialidade inválido!");
				codigoEspecialidade=0;
			}
		}while(codigoEspecialidade==0);
		
		entrada.nextLine();
		System.out.println("Entre com o nome do paciente: ");
		String nomePaciente = entrada.next();
		System.out.println("Entre com o código da doença: ");
		int CodigoDoenca = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Entre com o nome da doença: ");
		String nomeDoenca = entrada.next();
		entrada.nextLine();
		System.out.println("Entre com a data da consulta: ");
		String dataConsulta = entrada.next();
		entrada.nextLine();
		System.out.println("Entre com o horário da consulta: ");
		String horarioConsulta = entrada.next();
		
		String nomePlano = "";
		int codigoPlano = 0;
		
		do {
			System.out.println("Entre com o código do plano de saúde: ");
			codigoPlano = entrada.nextInt();
			
			if (codigoPlano==1) {
				nomePlano = "Unimed";
			}else if(codigoPlano==2){
				nomePlano = "São Francisco";
			}else if(codigoPlano==3) {
				nomePlano = "Bradesco Seguros";
			}else {
				System.out.println("Número do plano inválido!");
				codigoPlano=0;
			}
		}while(codigoPlano==0);
		
		
		Consulta consulta = new Consulta(codigoConsulta,codigoMedico,nomeMedico,codigoEspecialidade,nomeEspecialidade,nomePaciente,CodigoDoenca,nomeDoenca,dataConsulta,horarioConsulta,codigoPlano,nomePlano);
		ConsultasDAO dao = new ConsultasDAO();
		try{
			dao.inserir(consulta);
		}catch(SQLException e){
			System.out.println("\nNão é possível cadastrar uma consulta do mesmo médico no mesmo dia e horário! \nPor favor, tente novamente... \n\n:");
		}
		
	}
}