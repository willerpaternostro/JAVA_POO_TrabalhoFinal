package poo.Main;

import java.io.IOException;
import java.util.Scanner;

import poo.consultorio.util.ComandosFlyweight;

public class Main {
	
	public static void menu() {
		System.out.println("\nConsultório Médico\n");
		System.out.println("(S)air");
		System.out.println("(C)adastrar (M)édico");
		System.out.println("(A)lterar (M)édico");
		System.out.println("(R)emover (M)édico");
		System.out.println("(L)istar (M)édicos");
	
		System.out.println("(C)adastrar (P)aciente");
		System.out.println("(A)lterar (P)aciente");
		System.out.println("(R)emover (P)aciente");
		System.out.println("(L)istar (P)acientes");
	
		System.out.println("(C)adastrar (C)onsulta");
		System.out.println("(L)istar (C)onsultas");
		System.out.println("(G)erar (R)elatório (C)onsulta Específica");
		
		System.out.println("\nEscolha Uma Opção: ");
	}
	
	public static void main(String[] args) {
	
		String opcao="S";
		Scanner entrada = new Scanner(System.in);
		
		ComandosFlyweight comandos = new ComandosFlyweight();
		
		//tratamento de exceção
		do {
			menu();
			opcao = entrada.next();
			try {
				comandos.getComando(opcao.toUpperCase()).execute(entrada);//polimorfismo 
			} catch (IOException e) {
				throw new  RuntimeException(e);
			} 
		}while(!opcao.toUpperCase().equals("S"));		
		
		entrada.close();
	}
}
