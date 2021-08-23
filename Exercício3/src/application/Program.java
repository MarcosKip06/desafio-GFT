package application;

import java.util.Scanner;

import Entities.Moradores;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cont=0;
		
		System.out.println("Quantos moradores vai perguntar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.print("Digite o número do telefone: ");
			String telefone = sc.nextLine();
			System.out.print("Digite o número da residência: ");
			sc.nextLine();
			Integer numResidencia = sc.nextInt();
			
			System.out.println();
			System.out.println("Tem cachorro? ");
			char opc = sc.next().charAt(0);
			if(opc == 'n' && numResidencia % 2 != 0) {
				cont ++;
			}
		}
		

	}

}
