package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Triangulo;
import br.com.eng.senai.calculadora.ui.Menu;

public class TrianguloDao {
	public static void criarTriangulo() {
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Criando um objeto triângulo...");
		System.out.print("Informe a base: ");
		Scanner reader = new Scanner(System.in);
		triangulo.setBase(reader.nextDouble());
		
		System.out.print("Informe a altura: ");
		triangulo.setAltura(reader.nextDouble());
		
		Menu.continuar(reader);
	}

}
