package ex8;

import java.util.ArrayList;
import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String>lista = new ArrayList<>(); 
		//For para adicionar elementos
		for(int a=0;a<10;a++) {
			String valor = ler.nextLine(); 
			lista.add(valor);
			
		}
		System.out.println("Elementos: ");
		lista.forEach(System.out::println);
		System.out.println("Tamanho da lista: " + lista.size());
		System.out.println("Ultimo elemento");
		System.out.println(lista.get(9));

		
	}

}
