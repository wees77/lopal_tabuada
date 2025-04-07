package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import br.sp.senai.jandira.calculadoraDeTabuada.model.Tabuada;

public class TelaTabuada {

	private JLabel lblMultiplicando;
	private JTextField txtMultiplicando;
	private JLabel lblMinMultiplicador;
	private JTextField txtMinMultiplicador;
	private JLabel lblMaxMultiplicador;
	private JTextField txtMaxMultiplicador;
	private JButton buttonCalcular;
	private JButton buttonLimpar;
	private JList listTabuada;
	private String resultado[];
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setSize(265, 550);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Tabuada");
		tela.setLocationRelativeTo(null);
		// para abrir a programação no meio da tela 
		tela.setLayout(null);
		tela.setResizable(false);
		// para permitit ou não redimensionar a tela
		
	
		
		// Multiplicando
		lblMultiplicando = new JLabel();
		lblMultiplicando.setText("Multiplicando:");
		lblMultiplicando.setBounds(20, 10, 100, 20);
		
		txtMultiplicando = new JTextField();
		txtMultiplicando.setBounds(180, 10, 50, 20);
		
		// Mínimo Multiplicador
		lblMinMultiplicador = new JLabel();
		lblMinMultiplicador.setText("Mín. Multiplicador: ");
		lblMinMultiplicador.setBounds(20, 50, 150, 20);
		
		txtMinMultiplicador = new JTextField();
		txtMinMultiplicador.setBounds(180, 50, 50, 20);
		
		// Máximo multiplicador
		lblMaxMultiplicador = new JLabel();
		lblMaxMultiplicador.setText("Máx. Multiplicador: ");
		lblMaxMultiplicador.setBounds(20, 90, 150, 20);
		
		txtMaxMultiplicador = new JTextField();
		txtMaxMultiplicador.setBounds(180, 90, 50, 20);
		
		// botão calcular
		buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(20, 130, 100, 30);
		
		// botão limpar
		buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(130, 130, 100, 30);
		
		// Lista para exibir a tabuada
		listTabuada = new JList();
		listTabuada.setBounds(20, 180, 210, 300);
		
		
		
		// Adicionar componentes ao painel de conteúdo
		tela.getContentPane().add(lblMultiplicando);
		tela.getContentPane().add(lblMinMultiplicador);
		tela.getContentPane().add(lblMaxMultiplicador);
		tela.getContentPane().add(txtMinMultiplicador);
		tela.getContentPane().add(txtMultiplicando);
		tela.getContentPane().add(txtMaxMultiplicador);
		tela.getContentPane().add(buttonCalcular);
		tela.getContentPane().add(buttonLimpar);
		tela.getContentPane().add(listTabuada);
		

		// Configurar os ouvintes (listeners) dos botões
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String multiplicando = txtMultiplicando.getText();
				String minMultiplicador = txtMinMultiplicador.getText();
				String maxMultiplicador = txtMaxMultiplicador.getText();
				
				// Casting -> Conversão de um tipo para outro
				double multiplicandoDouble = Double.parseDouble(multiplicando);
				double minMultiplicadorDouble = Double.parseDouble(minMultiplicador);
				double maxMultiplicadorDouble = Double.parseDouble(maxMultiplicador);
				
				Tabuada tabuada = new Tabuada();
				tabuada.setMultiplicando(multiplicandoDouble);
				tabuada.setMinimoMultiplicador(minMultiplicadorDouble);
				tabuada.setMaximoMultiplicador(maxMultiplicadorDouble);
				resultado = tabuada.calcularTabuada();
			
			}
		});
		
		// Tornar a tela visível ao usuário
		tela.setVisible(true);
		
	}

}
