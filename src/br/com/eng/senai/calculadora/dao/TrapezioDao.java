package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;
import br.com.eng.senai.calculadora.model.Trapezio;
import br.com.eng.senai.calculadora.ui.Menu;

public class TrapezioDao {
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		System.out.println("");
		System.out.println("Criando um objeto trapézio...");
		System.out.print("Informe a base MAIOR: ");
		Scanner reader = new Scanner(System.in);
		trapezio.setBaseMaior(reader.nextDouble());
		
		System.out.print("Informe a base MENOR: ");
		trapezio.setBaseMenor(reader.nextDouble());
		
		System.out.print("Informe o valor da altura: ");
		trapezio.setAltura(reader.nextDouble());
		
		//reader.close();

		Menu.continuar(reader);
	}
}
