package modules;

import interfaces.Conta;

public class ContaPoupanca implements Conta {
	
	private double saldo;
	private double saque;
	private double deposito;
	private String pass;
	
	public ContaPoupanca() {}

	public ContaPoupanca(double saldo, double saque, double deposito, String pass) {
		super();
		this.saldo = saldo;
		this.saque = saque;
		this.deposito = deposito;
		this.pass = pass;
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

	public String setpass() {
		return pass;
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
