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
	private JLabel lbl_titulo;

	private JTextField txt_visor;

	private JButton btn_0;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;

	private JButton btn_soma;
	private JButton btn_subtrai;
	private JButton btn_multiplica;
	private JButton btn_divide;
	private JButton btn_igual;
	private JButton btn_virgula;
	private JButton btn_invert;
	private JButton btn_backsp;
	private JButton btn_clear;

	private double valor1 = 0;
 
	private String operador = "";

	public Calculadora() {
		// JANELA
		super.getContentPane().setLayout(null);
		super.getContentPane().setBackground(new Color(90, 6, 90));
		super.setSize(400, 350);
		super.setTitle("Calculadora Step");
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setLocation(200, 200);

		// Titulo LABEL
		lbl_titulo = new JLabel("CALCULADORA");
		lbl_titulo.setBounds(150, 20, 320, 25);
		lbl_titulo.setForeground(new Color(255, 255, 255));
		super.getContentPane().add(lbl_titulo);

		// VISOR
		txt_visor = new JTextField(15);
		txt_visor.setBounds(40, 60, 300, 25);
		super.getContentPane().add(txt_visor);
		txt_visor.setBackground(new Color(138,137,136));
		txt_visor.setForeground(new Color(255, 255, 255));

		// LINHA 1-----------------------------------------------

		btn_clear = new JButton("C");
		btn_clear.setBounds(120, 100, 50, 25);
		super.getContentPane().add(btn_clear);
		
		btn_backsp = new JButton("CE");
		btn_backsp.setBounds(200, 100, 50, 25);
		super.getContentPane().add(btn_backsp);
		
		btn_divide = new JButton("/");
		btn_divide.setBounds(290, 100, 50, 25);
		super.getContentPane().add(btn_divide);
		btn_divide.setBackground(new Color(245,141,61));
		btn_divide.setForeground(new Color(255, 255, 255));

		// LINHA 2--------------------------------------------

		
		btn_7 = new JButton("7");
		btn_7.setBounds(40, 140, 50, 25);
		super.getContentPane().add(btn_7);

		btn_8 = new JButton("8");
		btn_8.setBounds(120, 140, 50, 25);
		super.getContentPane().add(btn_8);

		btn_9 = new JButton("9");
		btn_9.setBounds(200, 140, 50, 25);
		super.getContentPane().add(btn_9);

		btn_multiplica = new JButton("*");
		btn_multiplica.setBounds(290, 140, 50, 25);
		super.getContentPane().add(btn_multiplica);
		btn_multiplica.setBackground(new Color(245,141,61));
		btn_multiplica.setForeground(new Color(255, 255, 255));

		// LINHA 3--------------------------------------------

		btn_4 = new JButton("4");
		btn_4.setBounds(40, 180, 50, 25);
		super.getContentPane().add(btn_4);

		btn_5 = new JButton("5");
		btn_5.setBounds(120, 180, 50, 25);
		super.getContentPane().add(btn_5);

		btn_6 = new JButton("6");
		btn_6.setBounds(200, 180, 50, 25);
		super.getContentPane().add(btn_6);

		btn_subtrai = new JButton("-");
		btn_subtrai.setBounds(290, 180, 50, 25);
		super.getContentPane().add(btn_subtrai);
		btn_subtrai.setBackground(new Color(245,141,61));
		btn_subtrai.setForeground(new Color(255, 255, 255));


		// LINHA 4--------------------------------------------

		btn_1 = new JButton("1");
		btn_1.setBounds(40, 220, 50, 25);
		super.getContentPane().add(btn_1);

		btn_2 = new JButton("2");
		btn_2.setBounds(120, 220, 50, 25);
		super.getContentPane().add(btn_2);

		btn_3 = new JButton("3");
		btn_3.setBounds(200, 220, 50, 25);
		super.getContentPane().add(btn_3);

		btn_soma = new JButton("+");
		btn_soma.setBounds(290, 220, 50, 25);
		super.getContentPane().add(btn_soma);
		btn_soma.setBackground(new Color(245,141,61));
		btn_soma.setForeground(new Color(255, 255, 255));



		// LINHA 5--------------------------------------------
		
		btn_invert = new JButton("+/-");
		btn_invert.setBounds(40, 260, 50, 25);
		super.getContentPane().add(btn_invert);

		btn_0 = new JButton("0");
		btn_0.setBounds(120, 260, 50, 25);
		super.getContentPane().add(btn_0);
		
		btn_virgula = new JButton(",");
		btn_virgula.setBounds(200, 260, 50, 25);
		super.getContentPane().add(btn_virgula);

		btn_igual = new JButton("=");
		btn_igual.setBounds(290, 260, 50, 25);
		super.getContentPane().add(btn_igual);
		btn_igual.setBackground(new Color(138,137,136));
		btn_igual.setForeground(new Color(255, 255, 255));

		this.eventosBtnNumeros();
		this.eventosBtnOperacao();
	}

	private void eventosBtnNumeros() {

		btn_0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!txt_visor.getText().equals("0"))
					txt_visor.setText(txt_visor.getText() + "0");
			}
		});

		btn_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("1");
				else
					txt_visor.setText(txt_visor.getText() + "1");
			}
		});

		btn_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("2");
				else
					txt_visor.setText(txt_visor.getText() + "2");
			}
		});

		btn_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("3");
				else
					txt_visor.setText(txt_visor.getText() + "3");
			}
		});

		btn_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("4");
				else
					txt_visor.setText(txt_visor.getText() + "4");
			}
		});

		btn_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("5");
				else
					txt_visor.setText(txt_visor.getText() + "5");
			}
		});

		btn_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("6");
				else
					txt_visor.setText(txt_visor.getText() + "6");
			}
		});

		btn_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("7");
				else
					txt_visor.setText(txt_visor.getText() + "7");
			}
		});

		btn_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("8");
				else
					txt_visor.setText(txt_visor.getText() + "8");
			}
		});

		btn_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (txt_visor.getText().equals("0"))
					txt_visor.setText("9");
				else
					txt_visor.setText(txt_visor.getText() + "9");
			}
		});
		
		btn_virgula.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if (txt_visor.getText().equals("") || txt_visor.getText().equals(","))
					txt_visor.setText("0,");
					 
				else
					txt_visor.setText(txt_visor.getText() + ",");
			}
		});
		
		btn_backsp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!txt_visor.getText().equals("")) {
//					JOptionPane.showMessageDialog(null, "!");
				}
				
				
				
			}
		});
		
		
		btn_clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txt_visor.setText("");
			}
		});
		
	}

	private void eventosBtnOperacao() {

		btn_soma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt_visor.getText());
				operador = "+";
				txt_visor.setText("");
			}

		});

		btn_subtrai.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt_visor.getText());
				operador = "-";
				txt_visor.setText("");

			}

		});

		btn_multiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt_visor.getText());
				operador = "*";
				txt_visor.setText("");

			}

		});

		btn_divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txt_visor.getText());
				operador = "/";
				txt_visor.setText("");

			}

		});
		
		
		btn_igual.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				double valor2 = Double.parseDouble(txt_visor.getText());
				
				switch(operador){
					case "+":
						txt_visor.setText(String.valueOf(Calculos.somar(valor1, valor2)));
						break;
						
					case "-":
						txt_visor.setText(String.valueOf(Calculos.subtrair(valor1, valor2)));
						break;
						
					case "*":
						txt_visor.setText(String.valueOf(Calculos.multiplicar(valor1, valor2)));
						break;
						
						
					case "/":
						txt_visor.setText(String.valueOf(Calculos.dividir(valor1, valor2)));
						break;
						
				}
			}

			
		});
		
	}

}
