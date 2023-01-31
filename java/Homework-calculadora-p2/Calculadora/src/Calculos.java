
public class Calculos {

	public static double somar(double valor1, double valor2) {
		
		return valor1 + valor2;
	}
	
	
	public static double subtrair(double valor1, double valor2) {
		
		return valor1 - valor2;
	}
	
	public static double multiplicar(double valor1, double valor2) {
		
		return valor1 * valor2;
	}
	
	public static double dividir(double valor1, double valor2) {
		
		if(valor2 == 0) {
			return 0;
		}else {
			return valor1/valor2;
		}
		
	}
	
	
}
