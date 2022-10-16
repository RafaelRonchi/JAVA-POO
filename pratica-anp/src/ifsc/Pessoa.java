package ifsc;

public class Pessoa {
	private String nome;
	private String cpf;
   
	public String getCpf(String cpf) {
		return this.cpf;
	}
	
	public String getNome(String nome) {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
