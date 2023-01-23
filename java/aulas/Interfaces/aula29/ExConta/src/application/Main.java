package application;

import modules.ContaCorrente;
import modules.ContaPoupanca;
public class Main {

	public static void main(String[] args) {
		 
		//CONTA CORRENTE
//		ContaCorrente cc = new ContaCorrente();
//		 
//		cc.sacar(100.0);
//		
//		cc.setDeposito(300.0);
//		
//		cc.getSaldo();
		
		//CONTA POUPANÇA
		ContaPoupanca cp = new ContaPoupanca();
		cp.sacar(150);

	}

}
