package poo.consultorio.comando;

import java.util.Scanner;

public class Sair implements Comando {

	@Override
	public void execute(Scanner entrada) {
		System.out.println("Sessão Encerrada!");
	}
}
