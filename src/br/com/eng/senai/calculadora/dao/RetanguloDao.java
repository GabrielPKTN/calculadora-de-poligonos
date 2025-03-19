package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Retangulo;

public class RetanguloDao {
	
	public void criarRetangulo() {
		Retangulo retangulo = new Retangulo();
		System.out.println("Criando um objeto retângulo...");
		
		System.out.println();
		System.out.print("Informe a base: ");
		Scanner reader = new Scanner(System.in);
		retangulo.setBase(reader.nextDouble());
		
		System.out.print("Informe a altura: ");
		Scanner reader1 = new Scanner(System.in);
		retangulo.setAltura(reader1.nextDouble());
		
		reader.close();
		reader1.close();
	}
}
