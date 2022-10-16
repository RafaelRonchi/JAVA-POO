package praticaDia10;

public class ContaCorrenteMain {

	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente();
		
		

	    c.Saldo =  (double) 1000;
	    c.Cpf = (long) 4324234;
	    c.NomeTitular = "Rafael";
	    c.NumeroConta = (long) 234234;
	    
		c.mostrarDados();
		
		c.depositar(40.5);
		c.sacar(200.3);
		
		c.mostrarDados();

}
}
