import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

// Criando a tela da calculadora
public class Calculadora extends JFrame {

	// Declarar os componentes da tela

	// Labels - Textos simples
	private JLabel lbl_valor1;
	private JLabel lbl_valor2;
	private JLabel lbl_resultado;

	// Inputs
	private JTextField txt_valor1;
	private JTextField txt_valor2;
	private JTextField txt_resultado;

	// Botões
	private JButton btn_somar;
	private JButton btn_subtrair;
	private JButton btn_dividir;
	private JButton btn_multiplicar;

	// Declarar variaveis globais
	private double valor1;
	private double valor2;

	public Calculadora() {
		// Propriedade da tela
		super.setTitle("Calculadora STEP");
		super.setSize(300, 300);
		super.setLocation(400, 200);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Formatar o conteúdo
		super.getContentPane().setBackground(new Color(114, 121, 138));
		super.getContentPane().setLayout(null); // removendo layouts

		// Instanciar os objetos e adicionar ao conteúdo da tela

		// -- lbl_valor1
		lbl_valor1 = new JLabel("Valor 1: ");
		lbl_valor1.setBounds(40, 20, 100, 25);
		super.getContentPane().add(lbl_valor1); // adicionando ao conteúdo

		// txt_valor1
		txt_valor1 = new JTextField(10); // maxLength == 10
		txt_valor1.setBounds(100, 20, 100, 25);
		super.getContentPane().add(txt_valor1);

		// -- lbl_valor2
		lbl_valor2 = new JLabel("Valor 2: ");
		lbl_valor2.setBounds(40, 70, 100, 25);
		super.getContentPane().add(lbl_valor2); // adicionando ao conteúdo

		// txt_valor2
		txt_valor2 = new JTextField(10); // maxLength == 10
		txt_valor2.setBounds(100, 70, 100, 25);
		super.getContentPane().add(txt_valor2);
		
		
		//resultado
		txt_resultado = new JTextField(10); // maxLength == 10
		txt_resultado.setBounds(100, 110, 100, 25);
		super.getContentPane().add(txt_resultado);

		// botoes de operadores

		// somar
		btn_somar = new JButton("+");
		btn_somar.setBounds(40, 160, 50, 25);
		super.getContentPane().add(btn_somar);

		// subtrair
		btn_subtrair = new JButton("-");
		btn_subtrair.setBounds(90, 160, 50, 25);
		super.getContentPane().add(btn_subtrair);

		// dividir
		btn_dividir = new JButton("/");
		btn_dividir.setBounds(140, 160, 50, 25);
		super.getContentPane().add(btn_dividir);

		// multiplicar
		btn_multiplicar = new JButton("*");
		btn_multiplicar.setBounds(190, 160, 50, 25);
		super.getContentPane().add(btn_multiplicar);

		
		// Colocando os eventos
		Operador op = new Operador(); // Instanciando o operador que escuta evento
		
		btn_somar.addActionListener(op);
		
		

	} // ---------- FIM Construtor

	public void exit() {
		super.setVisible(false);
	}

	public void start() {
		super.setVisible(true);
	}

	private class Calcule {

		static double somar(double v1, double v2) {
			return v1 + v2;
		}

		static double subtrair(double v1, double v2) {
			return v1 - v2;
		}

		static double multiplicar(double v1, double v2) {
			return v1 * v2;
		}

		static double dividir(double v1, double v2) {
			if (v2 == 0) {
				JOptionPane.showMessageDialog(null, "Não dá pra dividir por zero!");
			}

			return v1 / v2;
		}

	} // Fim Class Calcula

	private class Operador implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (txt_valor1.getText().equals("") || txt_valor2.getText().equals("")) {

				JOptionPane.showMessageDialog(null, "Favor preencher os valores 1 e 2");
				
			} else {

				// Pegando os valores dos inputs
				valor1 = Double.parseDouble(txt_valor1.getText());
				valor2 = Double.parseDouble(txt_valor2.getText());

				// vendo se a origem do evento é o btn_somar
				if (e.getSource() == btn_somar) {
					txt_resultado.setText(String.valueOf(Calcule.somar(valor1, valor2)));
					txt_valor1.setText("");
					txt_valor2.setText("");
				}
				
				
			}

		}

	}

}
