package Program;

import java.util.Locale;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Double valorCompra;
		Double desconto = null;
		Double valorFinal;
		
		System.out.println("Digite o valor da compra: ");
		valorCompra = sc.nextDouble();
		
		if(valorCompra > 100) {
			desconto ++;
		}
		
		valorFinal = valorCompra +( valorCompra * desconto / 100);
		
		System.out.println(valorCompra + ", " + desconto + "% , " +valorFinal );
		
		

	}

}
