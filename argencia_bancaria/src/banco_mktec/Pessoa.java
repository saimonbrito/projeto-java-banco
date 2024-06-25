package banco_mktec;

public abstract class Pessoa {
 
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String email;
	
	
	
	
	public Pessoa(String nome, String cpf, String telefone, String email) {
		
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "pessoa [nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + "]";
	}
	
	
	
}
