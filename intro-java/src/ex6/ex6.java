package ex6;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		Integer maior = new Integer(0);
		Integer menor = new Integer(99999999);
		Scanner ler = new Scanner(System.in);
		Integer[] vetor = new Integer[10];
		System.out.println("Digite os valores: ");

		for (int a = 0; a < 10; a++) {
			vetor[a] = Integer.valueOf(ler.nextLine());
		}

		for (int a = 0; a < 10; a++) {
			if (vetor[a] > maior) {
				maior = vetor[a];
			} else if (vetor[a] < menor) {
				menor = vetor[a];
			}
			

		}
		System.out.println("Menor valor: " + menor);
		System.out.println("Maior valor: " + maior);
	}

}
