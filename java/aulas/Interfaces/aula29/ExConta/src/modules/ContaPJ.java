package modules;

import java.util.Scanner;

import interfaces.Conta;

public class ContaPJ implements Conta {
	
	private double saldo;
	private double saque;
	private double deposito;
	private String pass1 = "123";
	private String pass2 = "456";	
	
	public ContaPJ() {}

	public ContaPJ(double saldo, double saque, double deposito, String pass1, String pass2) {
		super();
		this.saldo = saldo;
		this.saque = saque;
		this.deposito = deposito;
		this.pass1 = pass1;
		this.pass2 = pass2;
	}

	
	public double getSaque() {
		return saque;
	}

	public void setSaque(double saque) {
		this.saque = saque;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public String setpass1() {
		return pass1;
	}
	public String setpass2() {
		return pass2;
	}

	@Override
	public double sacar(double valor) {
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i = 0; i<3; i++) {
			System.out.print("\nPara fazer o saque, digite sua Primeira senha: ");
			String senha1 = sc.next();
			
			System.out.print("\nAgora digite sua Segunda senha: ");
			String senha2 = sc.next();
			
			if(senha1.equals(pass1) && senha2.equals(pass2)) {
				System.out.println("\nSaque liberado");
				break;
				
			}else {
				System.out.println("\nSenha inválida");
				
			}
			
		}
		
		if(saldo > valor) {
			System.out.println("Saque realizado");
			System.out.println("Valor do saque: " + valor);
			System.out.println("Saldo: " + (saldo - valor));


		}else {
			System.out.println("Saldo insuficiente");
		}
		
		return 0;
	}

	@Override
	public double depositar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSaldo() {
		saldo += deposito;
		Scanner sc = new Scanner(System.in);

		System.out.print("\nPara fazer consultar o saldo, digite sua senha: ");
		String senha1 = sc.next();
		for(int i = 0; i<3; i++) {
			
			if(senha1.equals(pass1)) {
				System.out.println("\nConsulta liberada");
				System.out.println("Valor: " + saldo);
				break;
				
			}else {
				System.out.println("\nSenha inválida");
				System.out.print("Tente outra vez: ");
				senha1 = sc.next();
			}
			
		}
		
		return saldo;
	}


	
	
}
