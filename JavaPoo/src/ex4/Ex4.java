package ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		System.out.println("Digite o valor para a primeira String: ");
		String S1 = ler.next();
		
		System.out.println("Digite o valor para a segunda String: ");
		String S2 = ler.next();
		
		System.out.println("COMPARANDO....");
		
		System.out.println(S1.equals(S2));
		System.out.println(S1.equalsIgnoreCase(S2));
		System.out.println(S1==S2);
		
		//As tres formas funcionam, apesar do uso do "==" não ser o recomendado
		ler.close();
	}

}
