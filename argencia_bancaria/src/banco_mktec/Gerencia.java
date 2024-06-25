package banco_mktec;

import java.util.Scanner;

public class Gerencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		String conferirEmail = "brito@brito.com";
		String conferirSenha = "203040";
		double saldoConta = 0;
		System.out.println("seja bem vindo  banco mktec ");
		System.out.println("");
		
		System.out.println("entre com seu email ");
		String acessoEmail = entrada.next();
		System.out.println("  ");
		
		System.out.println("digite sua senha ");
		String acessoSenha = entrada.next();
		
		
			if(acessoEmail.equals(conferirEmail)  && acessoSenha.equals(acessoSenha)) {
				
			Cliente();
			
			}else {
				  System.out.println("acesso negado"); 
			  }
				
			Boolean acessoPermitido = true;
			
		
			
				while (acessoPermitido) {
					
					 System.out.println("selecione uma opçao");
			    	 System.out.println(" ");
			    	 System.out.println("1: deposito");
			    	 System.out.println("2: saque");
			    	 System.out.println("3: saldo");
			    	 System.out.println("0: sair");
			    	 System.out.println(" ");
			    	 
			        int opcao = entrada.nextInt();
			        
			        switch (opcao) {
	                case 1:
	                	System.out.print("valor a ser pepositado R$: ");
	                        double deposito = entrada.nextDouble();
	                        saldoConta += deposito;
	                        System.out.printf("saldo atual: %.2f\n", saldoConta);
	                        System.out.println(" ");
	                        break;
	                case 2:
	                  
	                	System.out.print("valor a ser retirado R$: ");
	                    double saque = entrada.nextDouble();
	                    if (saque <= saldoConta) {
	                    	saldoConta -= saque;
	                        System.out.printf("saldo atual: %.1f\n", saldoConta);
	                        System.out.println(" ");
	                    } else {
	                        System.out.println("Saldo insuficiente.");
	                        System.out.println(" ");
	                    }
	                    break;
	                case 3:
	                    
	                    System.out.printf("saldo atual: %.1f\n", saldoConta);
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    acessoPermitido = false;  
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
				}
		  
			
	}

	private static void Cliente() {
		 
		Cliente cliente1 = new Cliente(null, null, null, null);
		
		cliente1.setNome("saimon");
		cliente1.setTelefone("11 98754-5649");
		cliente1.setEmail("saimon@saimon.com");
		cliente1.setCpf("07170270");
		cliente1.setConta("002154");
		 System.out.println(" ");
		
		 System.out.println("banco_mktec  "+ cliente1.getNome()+ "  Cc."+cliente1.getConta()+ "\n Seja bem vindo" );
		 
		 System.out.println(" ");
	}
}
