package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import clases.Empleado;
import ioDatos.IoDatos;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Main extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLogin;
	private JLabel lblNewLogIn;
	private JPanel panelLog;
	private JLabel lblNombre;
	private JLabel lblPasswd;
	private JTextField textFieldUserLog;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JPanel panelSign;
	private JLabel lblNewsIGNIN;
	private JLabel lblNombre_1;
	private JLabel lblPasswd_1;
	private JTextField textFieldUserSign;
	private JButton btnNuevoUser;
	private JTextField textFieldPassSign;
	private JButton btnNewButtonASign;
	private ArrayList<Empleado> vEmpleados;
	private JButton btnNewButtonALog;
	private JLabel lblNewLabelFondo;

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
		
		panelLog = new JPanel();
		panelLog.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelLog.setBounds(10, 51, 182, 199);
		contentPane.add(panelLog);
		panelLog.setLayout(null);
		
		lblNewLogIn = new JLabel("LOG IN");
		lblNewLogIn.setBounds(71, 5, 49, 19);
		lblNewLogIn.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		panelLog.add(lblNewLogIn);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 45, 70, 14);
		panelLog.add(lblNombre);
		
		lblPasswd = new JLabel("Contrase\u00F1a:");
		lblPasswd.setBounds(10, 80, 70, 14);
		panelLog.add(lblPasswd);
		
		textFieldUserLog = new JTextField();
		textFieldUserLog.addFocusListener(new TextFieldUserLogFocusListener());
		textFieldUserLog.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUserLog.setText("USUARIO");
		textFieldUserLog.setBounds(90, 42, 86, 20);
		panelLog.add(textFieldUserLog);
		textFieldUserLog.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new PasswordFieldFocusListener());
		passwordField.addMouseListener(new PasswordFieldMouseListener());
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(90, 77, 86, 20);
		panelLog.add(passwordField);
		
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.addMouseListener(new BtnEntrarMouseListener());
		btnEntrar.setBounds(56, 142, 89, 23);
		panelLog.add(btnEntrar);
		
		panelSign = new JPanel();
		panelSign.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelSign.setLayout(null);
		panelSign.setBounds(243, 51, 181, 199);
		contentPane.add(panelSign);
		
		lblNewsIGNIN = new JLabel("SIGN IN");
		lblNewsIGNIN.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		lblNewsIGNIN.setBounds(71, 5, 63, 19);
		panelSign.add(lblNewsIGNIN);
		
		lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setBounds(10, 45, 70, 14);
		panelSign.add(lblNombre_1);
		
		lblPasswd_1 = new JLabel("Contrase\u00F1a:");
		lblPasswd_1.setBounds(10, 80, 70, 14);
		panelSign.add(lblPasswd_1);
		
		textFieldUserSign = new JTextField();
		textFieldUserSign.addFocusListener(new TextFieldUserSignFocusListener());
		textFieldUserSign.setText("USUARIO");
		textFieldUserSign.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUserSign.setColumns(10);
		textFieldUserSign.setBounds(91, 42, 86, 20);
		panelSign.add(textFieldUserSign);
		
		btnNuevoUser = new JButton("CREAR USUARIO");
		btnNuevoUser.addMouseListener(new BtnNuevoUserMouseListener());
		btnNuevoUser.addActionListener(new BtnNuevoUserActionListener());
		btnNuevoUser.setBounds(23, 142, 133, 23);
		panelSign.add(btnNuevoUser);
		
		textFieldPassSign = new JTextField();
		textFieldPassSign.addFocusListener(new TextFieldPassSignFocusListener());
		textFieldPassSign.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPassSign.setBounds(91, 77, 86, 20);
		panelSign.add(textFieldPassSign);
		textFieldPassSign.setColumns(10);
		
		btnNewButtonASign = new JButton("\u25BA");
		btnNewButtonASign.addMouseListener(new BtnNewButtonMouseListener());
		
		btnNewButtonASign.setBounds(193, 108, 50, 23);
		contentPane.add(btnNewButtonASign);
		
		
		for (Component compo : panelSign.getComponents()) {
			compo.setEnabled(false);
		}
		panelSign.setEnabled(false);
		panelLog.setEnabled(true);
		
		passwordField.setText("CONTRASEÑA");
		textFieldPassSign.setText("CONTRASEÑA");
		
		btnNewButtonALog = new JButton("\u25C4");
		btnNewButtonALog.addMouseListener(new BtnNewButtonALogMouseListener());
		btnNewButtonALog.setBounds(193, 142, 50, 23);
		contentPane.add(btnNewButtonALog);
		
		lblNewLabelFondo = new JLabel("");
		lblNewLabelFondo.setBounds(0, 0, 434, 261);
		contentPane.add(lblNewLabelFondo);
		lblNewLabelFondo.setFocusable(true);
		lblNewLabelFondo.requestFocus();
		btnNewButtonALog.setEnabled(false);
		
		IoDatos ioDatos = new IoDatos();
		vEmpleados = ioDatos.cargarDatos();
	}
	private class BtnNuevoUserActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			IoDatos ioDatos = new IoDatos();
			ioDatos.escribirFichero(vEmpleados);
		}
	}

	private class BtnNewButtonMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if (panelSign.isEnabled()==false) {
				for (Component compo : panelSign.getComponents()) {
					compo.setEnabled(true);
				}
				for (Component compo : panelLog.getComponents()) {
					compo.setEnabled(false);
				}
				panelSign.setEnabled(true);
				btnNewButtonASign.setEnabled(false);
				btnNewButtonALog.setEnabled(true);
			}
						
		}
	}
	private class BtnNewButtonALogMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			if (panelLog.isEnabled()==true) {
				for (Component compo : panelSign.getComponents()) {
					compo.setEnabled(false);
				}
				for (Component compo : panelLog.getComponents()) {
					compo.setEnabled(true);
				}
				panelLog.setEnabled(true);
				panelSign.setEnabled(false);
				btnNewButtonALog.setEnabled(false);
				btnNewButtonASign.setEnabled(true);
			}
		}
	}
	private class TextFieldUserLogFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent arg0) {
			lblNewLabelFondo.setFocusable(false);
			textFieldUserLog.setText("");
		}
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldUserLog.getText().equalsIgnoreCase("")) {
				textFieldUserLog.setText("USUARIO");
			}
		}
	}
	private class PasswordFieldMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			passwordField.setText("");
		}
	}
	private class TextFieldUserSignFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			textFieldUserSign.setText("");
		}
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldUserSign.getText().equalsIgnoreCase("")) {
				textFieldUserSign.setText("USUARIO");
			}
			
		}
	}
	private class TextFieldPassSignFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			textFieldPassSign.setText("");
		}
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldPassSign.getText().equalsIgnoreCase("")) {
				textFieldPassSign.setText("CONTRASEÑA");
			}
			
		}
	}
	private class PasswordFieldFocusListener extends FocusAdapter {
		@Override
		public void focusGained(FocusEvent e) {
			passwordField.setText("");
		}
		@Override
		public void focusLost(FocusEvent e) {
			if (String.copyValueOf(passwordField.getPassword()).equals("")) {
				passwordField.setText("contraseña");
			}
			
			if ((passwordField.getPassword().toString().equals("")) && (passwordField.getPassword().toString().equals("contraseña"))) {
				passwordField.setText(passwordField.getPassword().toString());
			}
		}
	}
	private class BtnEntrarMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			IoDatos ioDatos = new IoDatos();
			if((textFieldUserLog.getText().equals("")||passwordField.getPassword().equals(""))||(textFieldUserLog.getText().equals("USUARIO")||passwordField.getPassword().equals("CONTRASEÑA"))) { 
				JOptionPane.showMessageDialog(null,"Valores no introducidos" );
			}
			ArrayList<Empleado> vEmpleados= ioDatos.cargarDatos();
			
			if (IoDatos.comprobarEmple(textFieldUserLog.getText(), String.valueOf(passwordField.getPassword()))) {
				for (Empleado emple : vEmpleados) {
					if (emple.getNombre().equals(textFieldUserLog.getText())) {
						Acciones acion = new Acciones();
						acion.setVisible(true);
						dispose();
					}
				}
			}else {
				JOptionPane.showMessageDialog(null, "Los datos del usuario introducidos no coinciden o este no está registrado");
				
			}
		}
	}
	private class BtnNuevoUserMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			IoDatos ioDatos= new IoDatos();
			for (Empleado emple : vEmpleados) {
				if (emple.getNombre().equals(textFieldUserSign.getText())) {
					JOptionPane.showMessageDialog(null, "El usuario indicado ya fue introducido anteriormente");
					textFieldUserSign.setText("USUARIO");
					textFieldPassSign.setText("CONTRASEÑA");
					return;
				}
			}
			
			
			JOptionPane.showMessageDialog(null, "El nuevo usuario fue introducido");
			
			
			
			
			ioDatos.escribirFichero(vEmpleados);
			textFieldUserSign.setText("USUARIO");
			textFieldPassSign.setText("CONTRASEÑA");
			
		}
	}
}
