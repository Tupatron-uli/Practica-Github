package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 198));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBackground(new Color(255, 128, 192));
		toolBar.setBounds(22, 72, 378, 16);
		contentPane.add(toolBar);
		
		JButton btnNewButton = new JButton("SUMA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Suma su = new Suma();
				su.setVisible(true);
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("RESTA");
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLICACION");
		toolBar.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVISION");
		toolBar.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("BOTONES");
		lblNewLabel.setFont(new Font("Rockwell", Font.ITALIC, 18));
		lblNewLabel.setBounds(152, 11, 100, 14);
		contentPane.add(lblNewLabel);
	}

}
