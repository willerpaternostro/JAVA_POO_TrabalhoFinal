package poo.consultorio.comando;

import java.io.IOException;
import java.util.Scanner;

import poo.consulta.Consulta;
import poo.consultorio.dao.ConsultasDAO;


public class GerarRelatorioConsultas implements Comando {

	public void execute(Scanner entrada) throws IOException {
		ConsultasDAO dao = new ConsultasDAO();
		System.out.println("Entre com o código da consulta: ");
		int codigo = entrada.nextInt();
		Consulta consulta = dao.getConsultas(codigo);
			System.out.println(consulta);
	}
}

