package modules;

import interfaces.Conta;

public class ContaCorrente implements Conta {
	
	private double saldo;
	private double saque;
	private double deposito;
	private double chequeEspecial;
	
	public ContaCorrente() {}

	public ContaCorrente(double saldo, double saque, double deposito, double chequeEspecial) {
		super();
		this.saldo = saldo;
		this.saque = saque;
		this.deposito = deposito;
		this.chequeEspecial = chequeEspecial;
	}

	public double getSaldo() {
		return saldo;
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

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	@Override
	public double sacar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
