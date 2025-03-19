package br.com.eng.senai.calculadora.dao;

import java.util.Scanner;

import br.com.eng.senai.calculadora.model.Quadrado;

public class QuadradoDao {
	
	public static void criarQuadrado() {
		Quadrado quadrado = new Quadrado();
		System.out.println("Criando um objeto quadrado...");
		System.out.print("Qual o tamanho do lado do quadrado? ");
		
		//Criar um objeto scanner
		Scanner leitor = new Scanner(System.in);
		
		quadrado.setLado(leitor.nextDouble());
		
		quadrado.resultado();
		
		//Fechar o objeto scanner, remover da memória
		leitor.close();
	}
}
