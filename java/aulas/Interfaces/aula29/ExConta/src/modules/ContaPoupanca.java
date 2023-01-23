package modules;

import java.util.Scanner;

import interfaces.Conta;

public class ContaPoupanca implements Conta {
	
	private double saldo;
	private double saque;
	private double deposito;
	private String pass = "123";
	
	public ContaPoupanca() {}

	public ContaPoupanca(double saldo, double saque, double deposito, String pass) {
		super();
		this.saldo = saldo;
		this.saque = saque;
		this.deposito = deposito;
		this.pass = pass;
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

	public String setPass() {
		return pass;
	}


	@Override
	public double sacar(double valor) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\nPara fazer o saque, digite sua senha: ");
		String senha = sc.next();
		for(int i = 0; i<3; i++) {
			
			if(senha.equals(pass)) {
				System.out.println("\nSaque liberado");
				break;
				
			}else {
				System.out.println("\nSenha inválida");
				System.out.print("Tente outra vez: ");
				senha = sc.next();
			}
			
		}
		
		if(saldo > valor) {
			System.out.println("Saque realizado");
			System.out.println("Valor do saque: " + valor);
			System.out.println("Saldo: " + (saldo - valor));


		}else {
			System.out.println("Saldo insuficiente");
		}
		
		
		return valor;
	}

	@Override
	public double depositar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
