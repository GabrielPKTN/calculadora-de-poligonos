package br.com.eng.senai.calculadora.ui;

import java.util.Scanner;

import br.com.eng.senai.calculadora.dao.CircunferenciaDao;
import br.com.eng.senai.calculadora.dao.QuadradoDao;
import br.com.eng.senai.calculadora.dao.RetanguloDao;
import br.com.eng.senai.calculadora.dao.TrapezioDao;
import br.com.eng.senai.calculadora.dao.TrianguloDao;

public class Menu {
	public static void mostrarMenu() {
		System.out.println("");
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
			} else if (opcao == 2) {
				RetanguloDao.criarRetangulo();
			} else if (opcao == 3) {
				TrapezioDao.criarTrapezio();
			} else if (opcao == 4) {
				CircunferenciaDao.calcularCircunferencia();
			} else if (opcao == 5) {
				TrianguloDao.criarTriangulo();
		}
	}
}
	
	public static void continuar(Scanner leitor) {
		System.out.println("");
		System.out.println("Deseja efetuar outro calculo?");
		System.out.print("Digite 'S' para continuar ou digite qualquer tecla para sair: ");
		String resposta = leitor.next();
		
		if (resposta.equalsIgnoreCase("s")) {
			Menu.mostrarMenu();
			
		} else {
			
		}
	}
}