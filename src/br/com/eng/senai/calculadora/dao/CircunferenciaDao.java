package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Circunferencia;
import br.com.eng.senai.calculadora.ui.Menu;

public class CircunferenciaDao {
	
	public static void calcularCircunferencia() {
		
		Circunferencia circunferencia = new Circunferencia();
		
		System.out.println("");
		System.out.println("Criando uma circunferência...");
		System.out.print("Qual o raio da circunferencia? ");
		
		Scanner reader = new Scanner(System.in);
		circunferencia.setRaio(reader.nextDouble());
		circunferencia.resultado();
		
		//reader.close();
		
		Menu.continuar(reader);
	}

}
