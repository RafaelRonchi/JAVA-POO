package ex3;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Informe um valor inteiro: ");
		Integer valor = Integer.valueOf(ler.nextLine());
		if (valor%2==0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}

	}

}
