package banco_mktec;

public class Conta {
      
	protected  String tipodeconta;
	protected  String cliente;
	protected double  saldo;
	
	public String getTipodeconta() {
		return tipodeconta;
	}
	public void setTipodeconta(String tipodeconta) {
		this.tipodeconta = tipodeconta;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
	public double depoditar(double deposito) {
		saldo += deposito;
		return saldo;
	}
	
	public double sacarValor(double saque) {
		if(saque <= saldo) {
			saldo -= saque;
			return saldo;
		}
		return saque;
		
	}
	
	public void consultarSaldo() {
		System.out.printf("saldo disponivel %.1f", saldo);
	}
	
	
}
