package application;

import java.util.Scanner;

import entities.Colaborador;
import entities.Colaborador_escola;
import entities.colaborador_faculdade;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		Colaborador colaborador = null;
		
		System.out.println("Digite a opção que se enquadra ao perfil do colaborador: ");
		System.out.println(" (a) - Não estudou \n (b) - Concluiu ensino básico \n (c) - Concluiu ensino superior ");
		char response = sc.next().charAt(0);
		System.out.println();
		
		if(response == 'a') {
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite sua matrícula: ");
			Integer matricula = sc.nextInt();
			colaborador = new Colaborador(nome, matricula);
		}
		if(response == 'b') {
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite sua matrícula: ");
			Integer matricula = sc.nextInt();
			System.out.print("Digite a escola: ");
			String escola = sc.nextLine();
			colaborador = new Colaborador_escola(nome, matricula, escola);
		}
		
		if(response == 'c') {
			System.out.print("Digite seu nome: ");
			String nome = sc.nextLine();
			System.out.print("Digite sua matrícula: ");
			Integer matricula = sc.nextInt();
			System.out.print("Digite a escola: ");
			String escola = sc.nextLine();
			System.out.println("Digite sua faculdade: ");
			String faculdade = sc.nextLine();
			colaborador = new colaborador_faculdade(nome, matricula, faculdade);
		}
		
		System.out.println(colaborador);
		
		


	}

}
