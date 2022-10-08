package ex10;

import java.util.Scanner;



public class ex10 {

	public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 double media = 0;
	 float a,b,c;
	 
	 System.out.println("Informe a o nome do aluno 1");
	 String nome1 = ler.nextLine();
	 System.out.println("Informe a nota do aluno 1");
	 double nota1 = ler.nextFloat();
	 System.out.println("Informe a nota do aluno 2");
	 double nota2 = ler.nextFloat();
	 System.out.println("Informe a nota do aluno 3");
	 double nota3 = ler.nextFloat();
	 
	 Double media1 = Double.valueOf((Double) Media(nota1,nota2,nota3));
	 System.out.printf("Media: %.2f", media1);
	 System.out.println("\nAluno: "+nome1);
			 

	}
	
	private static Double Media(double nota1, double nota2, double nota3) {
double media = (nota1+nota2+nota3)/3;
		
		return (double) media;
	}

	

}
