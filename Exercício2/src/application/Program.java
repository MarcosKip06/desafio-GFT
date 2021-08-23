package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int cod;
		int ano;
		
		do {
	    	  System.out.println("Digite o código:\n 1= idade 2= IMC 3= Sair ");
	    	  cod= sc.nextInt();
	    	  
	    	  
	    	  switch(cod){
	    	  
	    	  case 1:
	    		  System.out.println("Digite o ano que nasceu");
	    		  ano = sc.nextInt();
	    		  double resultado = 2021 - ano;
	    		  System.out.println("Você tem " + resultado + " anos");
	    		 
	    		  break;
	    		  
	    	  case 2:
	    		  System.out.println("Digite sua altura");
	    		  double altura = sc.nextDouble();
	    		  System.out.println("Digite seu peso: ");
	    		  double peso = sc.nextDouble();
	    		  resultado = peso / altura;
	    		  System.out.println(resultado);
	    		  
	    		  break;
	    	  case 3:
	    		  System.out.println("Obrigado pela preferência. Volte sempre");
	    		  
	    		  break;
	    		  
	    	  
	    	  }
	      }while(naoTerminar);
		}
		

		

	}


