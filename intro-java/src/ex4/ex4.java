package ex4;

import java.util.Scanner;
import java.util.ArrayList;

public class ex4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		
		for (a=0;a<10;a++) {
			System.out.println(" ");
			System.out.println("Informe o valor: ");
			Integer x = Integer.valueOf(ler.nextLine());
			System.out.println("Valor lido: ");
			System.out.println(x);
			System.out.println(" ");
		}
	}

}
