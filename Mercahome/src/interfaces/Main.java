package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLogin;
	private JLabel lblNewLogIn;
	private JPanel panel;
	private JLabel lblNombre;
	private JLabel lblPasswd;
	private JTextField textFieldNombre;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JPanel panel_1;
	private JLabel lblNewsIGNIN;
	private JLabel lblNombre_1;
	private JLabel lblPasswd_1;
	private JTextField textField;
	private JButton btnNuevoUser;
	private JTextField textField_1;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLogin = new JLabel("MERCAHOME.SA");
		lblNewLogin.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblNewLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLogin.setBounds(10, 26, 414, 14);
		contentPane.add(lblNewLogin);
		
		panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 51, 182, 199);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLogIn = new JLabel("LOG IN");
		lblNewLogIn.setBounds(71, 5, 49, 19);
		lblNewLogIn.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		panel.add(lblNewLogIn);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 45, 70, 14);
		panel.add(lblNombre);
		
		lblPasswd = new JLabel("Contrase\u00F1a:");
		lblPasswd.setBounds(10, 80, 70, 14);
		panel.add(lblPasswd);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNombre.setText("USUARIO");
		textFieldNombre.setBounds(90, 42, 86, 20);
		panel.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(90, 77, 86, 20);
		panel.add(passwordField);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.setBounds(56, 142, 89, 23);
		panel.add(btnEntrar);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setLayout(null);
		panel_1.setBounds(243, 51, 181, 199);
		contentPane.add(panel_1);
		
		lblNewsIGNIN = new JLabel("SIGN IN");
		lblNewsIGNIN.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewsIGNIN.setBounds(71, 5, 63, 19);
		panel_1.add(lblNewsIGNIN);
		
		lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(10, 45, 70, 14);
		panel_1.add(lblNombre_1);
		
		lblPasswd_1 = new JLabel("Contrase\u00F1a:");
		lblPasswd_1.setBounds(10, 80, 70, 14);
		panel_1.add(lblPasswd_1);
		
		textField = new JTextField();
		textField.setText("USUARIO");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		textField.setBounds(91, 42, 86, 20);
		panel_1.add(textField);
		
		btnNuevoUser = new JButton("CREAR USUARIO");
		btnNuevoUser.setBounds(23, 142, 133, 23);
		panel_1.add(btnNuevoUser);
		
		textField_1 = new JTextField();
		textField_1.setBounds(91, 77, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		btnNewButton = new JButton("\u2194");
		btnNewButton.setBounds(193, 50, 50, 23);
		contentPane.add(btnNewButton);
	}
}
