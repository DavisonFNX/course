package entidade;

public class Conta {
	private int numeroConta;
	private String nomeTitular;
	private double valorDeposito;
	
	public Conta(int numeroConta, String nomeTitular, double valorDeposito) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.valorDeposito = valorDeposito;	
	}
	
	public Conta(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getValorDeposito() {
		return valorDeposito;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public void Deposito(double valor) {
		this.valorDeposito += valor;
	}
	
	public void Sacar(double valor) {
		this.valorDeposito -= (valor - 5.00);
	}
	
	public void MostrarDados() {
		System.out.println("Acount data:");
		System.out.printf("Acount %d, Holder: %s, Balance: $ %.2f%n", numeroConta, nomeTitular, valorDeposito);
		
	}
	

}
