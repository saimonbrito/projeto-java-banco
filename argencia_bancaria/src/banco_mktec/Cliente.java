package banco_mktec;

public class Cliente extends Pessoa{

	String conta;
	
	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Cliente(String nome, String cpf, String telefone, String email) {
		super(nome, cpf, telefone, email);
		// TODO Auto-generated constructor stub
	}

	

}
