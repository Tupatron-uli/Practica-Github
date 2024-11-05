package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;

public class Suma extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Suma frame = new Suma();
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
	public Suma() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 582, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 210, 233));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(118, 75, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(449, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Primer valor:");
		lblNewLabel.setBounds(10, 78, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSegundoValor = new JLabel("Segundo valor:");
		lblSegundoValor.setBounds(330, 78, 98, 14);
		contentPane.add(lblSegundoValor);
		
		JButton btnNewButton = new JButton("Sumar");
		btnNewButton.setBounds(232, 177, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("SUMA");
		lblNewLabel_1.setFont(new Font("Rockwell", Font.ITALIC, 18));
		lblNewLabel_1.setBounds(247, 21, 61, 14);
		contentPane.add(lblNewLabel_1);
	}
}
