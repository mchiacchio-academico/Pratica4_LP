package questao2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculadoraBovina extends JFrame {

	private JPanel contentPane;
	private JTextField txtvalorArrobas;
	private JTextField txtqtdArrobas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraBovina frame = new CalculadoraBovina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculadoraBovina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora BOVINA");
		lblNewLabel.setBounds(162, 43, 103, 14);
		contentPane.add(lblNewLabel);
		
		JButton btntotalPagar = new JButton("Calcular total a pagar");
		btntotalPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String valorArrobas = txtvalorArrobas.getText();
				String qtdArrobas = txtqtdArrobas.getText();
				
				float vlrArrbs=Float.parseFloat(valorArrobas);
				int quantidadeArrobas=Integer.parseInt(qtdArrobas);
				float totalPagar= vlrArrbs*quantidadeArrobas;
				JOptionPane.showMessageDialog(btntotalPagar, "O valor a pagar é: R$"+ totalPagar);
			}
		});
		btntotalPagar.setForeground(Color.BLACK);
		btntotalPagar.setBounds(121, 215, 185, 23);
		contentPane.add(btntotalPagar);
		
		JLabel lblNewLabel_1 = new JLabel("Valor da Arroba");
		lblNewLabel_1.setBounds(31, 101, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Quantidade de Arrobas");
		lblNewLabel_2.setBounds(31, 141, 151, 14);
		contentPane.add(lblNewLabel_2);
		
		txtvalorArrobas = new JTextField();
		txtvalorArrobas.setBounds(179, 98, 86, 20);
		contentPane.add(txtvalorArrobas);
		txtvalorArrobas.setColumns(10);
		
		txtqtdArrobas = new JTextField();
		txtqtdArrobas.setBounds(179, 138, 86, 20);
		contentPane.add(txtqtdArrobas);
		txtqtdArrobas.setColumns(10);
	}
}
