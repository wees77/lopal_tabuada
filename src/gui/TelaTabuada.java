package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaTabuada {
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(500, 700);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		// Multiplicando
		JLabel lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 120, 30);
		
		
		JTextField txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(140, 10, 50, 30);
		
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		
		// Mínimo Multiplicador
		JLabel lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Mín. Multiplicador: ");
		lblMinMultiplicador.setBounds(20, 50, 150, 30);
		
		JTextField txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(140, 50, 50, 30);
		
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(lblMinMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(txtMultiplicando);
		//tela.getContentPane().add(buttonCalcular);
		
		
		tela.setVisible(true);
		
	}

}
