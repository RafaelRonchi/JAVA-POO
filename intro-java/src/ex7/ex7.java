package ex7;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		//Obj ler
		Scanner ler = new Scanner(System.in);
		
		String[] vetor = new String[10];
		
		//Atribuido valores ao vetor
		for(int i=0;i<vetor.length;i++) {
			vetor[i]= Integer.toString(i);
			//Exibindo os valores
			System.out.println(" "+ vetor[i]);
		}
		
		System.out.println("Tamanho do vetor: "+vetor.length);
		System.out.println("Ultimo elemento presente no vetor: "+ vetor[vetor.length-1]);

		
	}

}
