package br.com.eng.senai.calculadora.ui;

import java.util.Scanner;

import br.com.eng.senai.calculadora.dao.QuadradoDao;

public class Menu {
	public static void mostrarMenu() {
		System.out.println("Calculadora de Polígonos");
		System.out.println("============================");
		System.out.println("1 - Quadrado");
		System.out.println("2 - Retângulo");
		System.out.println("3 - Trapézio");
		System.out.println("4 - Circunferência");
		System.out.println("5 - Triângulo");
		System.out.println("============================");
		System.out.print("Escolha um opção (1 - 5): ");
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		
		if (opcao > 0 && opcao < 6) {
		
			if (opcao == 1) {
				
				QuadradoDao.criarQuadrado();
				
			}
			
			
		} else {
			System.out.println("Essa opção ainda não foi implementada.");
		}
	}
}