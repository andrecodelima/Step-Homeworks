package modules;

import interfaces.Conta;

public class ContaCorrente implements Conta {
	
	private double saldo;
	private double saque;
	private double deposito;
	public final double chequeEspecial = 1000.00;
	
	public ContaCorrente() {}

	public ContaCorrente(double saldo, double saque, double deposito) {
		super();
		this.saldo = saldo;
		this.saque = saque;
		this.deposito = deposito;
	}


	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	@Override
	public double sacar(double valor) {
		if((chequeEspecial + saldo) > valor) {
			System.out.println("Saque realizado");
			System.out.println("Valor do saque: " + valor);
			System.out.println("Saldo: " + ((chequeEspecial + saldo) - valor));
			System.out.println("Saldo restante do cheque especial: " + (chequeEspecial-valor));


		}else {
			System.out.println("Saldo insuficiente");
		}
		
		return valor;
	}

	@Override
	public double depositar(double valor) {
		return 0;
	}
	

	@Override
	public double getSaldo() {
		saldo += deposito;
		
		System.out.println("Valor: " + saldo);
		return saldo;
	}


	
	
}
