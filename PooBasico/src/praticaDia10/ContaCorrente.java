package praticaDia10;

public class ContaCorrente {
	public String NomeTitular;
	public Long Cpf;
	public Long NumeroConta;
	public Double Saldo;

	public Double sacar(Double valorSaque) {

		double retornoSaque = 0;
		if (valorSaque > Saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			Saldo = Saldo - valorSaque;
			retornoSaque = valorSaque;
		}
		return retornoSaque;
	}

	public void depositar(Double valorDeposito) {
		Saldo += valorDeposito;
	}

	public void mostrarDados() {

		System.out.println("Nome do titular: " + NomeTitular);
		System.out.println("Cpf: " + Cpf);
		System.out.println("Conta: " + NumeroConta);
		System.out.printf("Saldo: %.2f", Saldo);
		
		System.out.println("");

	}
}
