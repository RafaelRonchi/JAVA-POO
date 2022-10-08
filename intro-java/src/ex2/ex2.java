package ex2;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		String nome = ler.nextLine();
		
		System.out.println("Agora informe a idade: ");
		Integer idade = Integer.valueOf(ler.nextLine());	
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);

	}

}
