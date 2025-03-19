package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;
import br.com.eng.senai.calculadora.model.Trapezio;

public class TrapezioDao {
	public static void criarTrapezio() {
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando um objeto trapézio...");
		System.out.print("Informe a base MAIOR: ");
		Scanner reader = new Scanner(System.in);
		trapezio.setBaseMaior(reader.nextDouble());
		
		System.out.print("Informe a base MENOR: ");
		Scanner reader1 = new Scanner(System.in);
		trapezio.setBaseMenor(reader1.nextDouble());
		
		System.out.print("Informe o valor da altura: ");
		Scanner reader2 = new Scanner(System.in);
		trapezio.setAltura(reader2.nextDouble());
		
		reader.close();
		reader1.close();
		reader2.close();
		
	}
}
