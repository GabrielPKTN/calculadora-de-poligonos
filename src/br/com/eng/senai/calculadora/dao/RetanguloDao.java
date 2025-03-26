package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Retangulo;
import br.com.eng.senai.calculadora.ui.Menu;

public class RetanguloDao {
	
	public static void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		
		System.out.println("");
		System.out.println("Criando um objeto retângulo...");
		System.out.print("Informe a base: ");
		Scanner reader = new Scanner(System.in);
		retangulo.setBase(reader.nextDouble());
		
		System.out.print("Informe a altura: ");
		retangulo.setAltura(reader.nextDouble());
		
		//reader.close();
		//reader1.close();
		
		Menu.continuar(reader);
	}
}
