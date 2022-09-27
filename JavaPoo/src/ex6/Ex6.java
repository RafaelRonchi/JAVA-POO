package ex6;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float vetor[];
		int x;
		float ax;
		vetor = new float[10];
		
		System.out.println("Informe os salrios");
		
		for (x = 0; x < 10; x++) {
			vetor[x] = ler.nextFloat();
		}

			for (x = 0; x < vetor.length; x++) {
				for (int i = 0; i < 9; i++) {
					if (vetor[i] > vetor[i + 1]) {
						ax = vetor[i];
						vetor[i] = vetor[i + 1];
						vetor[i + 1] = ax;
					}
				}
			}

						System.out.println("CALCULANDO...");
						for (x = 0; x < 15; x++) {
							System.out.println("...");
						}

						System.out.println("Resultado:");
						for (x = 0; x < 10; x++) {
							System.out.println(" "+vetor[x]);
						}
						ler.close();

	}

}
