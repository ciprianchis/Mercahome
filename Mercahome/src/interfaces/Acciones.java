package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import com.toedter.plaf.JCalendarTheme;

import ioDatos.IoDatos;

import com.toedter.calendar.JCalendar;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import clases.Compra;
public class Acciones extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textFieldFactura;
	private JTextField textFieldProveedor;
	private JTextField textFieldDniEmpleado;
	private JTextField textFieldLote;
	private JTextField textFieldFormaPago;
	private JLabel lblNewLabel_1;
	private JTextField textFieldFinalizado;
	private JTextField textFieldPagado;
	private JTextField textFieldUnidades;
	private JTextField textFieldCoste;
	private JComboBox comboBoxArt;
	private JTextArea textArea;
	private JButton btnRegistrarCompra;
	private JButton btnVerCompras;
	private JLabel lblNewLabel_2;
	private JCalendar calendar;
	private JLabel Compras;
	private IoDatos ioDatos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acciones frame = new Acciones();
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
	public Acciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MERCAHOME.SA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblNewLabel.setBounds(5, 5, 504, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("COMPRA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(15, 30, 489, 14);
		contentPane.add(lblNewLabel_1);
		
		textArea = new JTextArea();
		textArea.setBounds(5, 277, 504, 123);
		contentPane.add(textArea);
		
		btnRegistrarCompra = new JButton("REGISTRAR COMPRA");
		btnRegistrarCompra.addMouseListener(new BtnRegistrarCompraMouseListener());
		btnRegistrarCompra.setBounds(338, 176, 171, 23);
		contentPane.add(btnRegistrarCompra);
		
		btnVerCompras = new JButton("VER COMPRAS");
		btnVerCompras.addMouseListener(new BtnVerComprasMouseListener());
		btnVerCompras.setBounds(338, 210, 171, 23);
		contentPane.add(btnVerCompras);
		
		comboBoxArt = new JComboBox();
		comboBoxArt.setBounds(417, 82, 87, 20);
		contentPane.add(comboBoxArt);
		comboBoxArt.setModel(new DefaultComboBoxModel(new String[] {"Art\u00EDculo:", "01", "02", "03", "04", "05", "06"}));
		
		textFieldCoste = new JTextField();
		textFieldCoste.addFocusListener(new TextFieldCosteFocusListener());
		textFieldCoste.setBounds(314, 82, 86, 20);
		contentPane.add(textFieldCoste);
		textFieldCoste.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCoste.setText("Coste");
		textFieldCoste.setColumns(10);
		
		textFieldFormaPago = new JTextField();
		textFieldFormaPago.addFocusListener(new TextFieldFormaPagoFocusListener());
		textFieldFormaPago.setBounds(417, 55, 86, 20);
		contentPane.add(textFieldFormaPago);
		textFieldFormaPago.setText("Forma Pago");
		textFieldFormaPago.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFormaPago.setColumns(10);
		
		textFieldLote = new JTextField();
		textFieldLote.addFocusListener(new TextFieldLoteFocusListener());
		textFieldLote.setBounds(314, 55, 86, 20);
		contentPane.add(textFieldLote);
		textFieldLote.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldLote.setText("N\u00BA Lote");
		textFieldLote.setColumns(10);
		
		textFieldProveedor = new JTextField();
		textFieldProveedor.addFocusListener(new TextFieldProveedorFocusListener());
		textFieldProveedor.setBounds(122, 55, 86, 20);
		contentPane.add(textFieldProveedor);
		textFieldProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldProveedor.setText("CIF Proveedor");
		textFieldProveedor.setColumns(10);
		
		textFieldFinalizado = new JTextField();
		textFieldFinalizado.addFocusListener(new TextFieldFinalizadoFocusListener());
		textFieldFinalizado.setBounds(24, 82, 86, 20);
		contentPane.add(textFieldFinalizado);
		textFieldFinalizado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFinalizado.setText("Finalizado");
		textFieldFinalizado.setColumns(10);
		
		textFieldDniEmpleado = new JTextField();
		textFieldDniEmpleado.addFocusListener(new TextFieldDniEmpleadoFocusListener());
		textFieldDniEmpleado.setBounds(218, 55, 86, 20);
		contentPane.add(textFieldDniEmpleado);
		textFieldDniEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDniEmpleado.setText("DNI Empleado");
		textFieldDniEmpleado.setColumns(10);
		
		textFieldPagado = new JTextField();
		textFieldPagado.addFocusListener(new TextFieldPagadoFocusListener());
		textFieldPagado.setBounds(122, 82, 86, 20);
		contentPane.add(textFieldPagado);
		textFieldPagado.setText("Pagado");
		textFieldPagado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPagado.setColumns(10);
		
		textFieldUnidades = new JTextField();
		textFieldUnidades.addFocusListener(new TextFieldUnidadesFocusListener());
		textFieldUnidades.setBounds(217, 86, 86, 20);
		contentPane.add(textFieldUnidades);
		textFieldUnidades.setText("Unidades/Kilos");
		textFieldUnidades.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUnidades.setColumns(10);
		
		textFieldFactura = new JTextField();
		textFieldFactura.addFocusListener(new TextFieldFacturaFocusListener());
		textFieldFactura.setBounds(25, 55, 86, 20);
		contentPane.add(textFieldFactura);
		textFieldFactura.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFactura.setText("N\u00BA Factura");
		textFieldFactura.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Fecha compra:");
		lblNewLabel_2.setBounds(15, 111, 95, 14);
		contentPane.add(lblNewLabel_2);
		
		calendar = new JCalendar();
		calendar.setBounds(144, 113, 184, 153);
		contentPane.add(calendar);
		
		Compras = new JLabel("Compras:");
		Compras.setBounds(10, 262, 69, 14);
		contentPane.add(Compras);
		
		
		ioDatos = new IoDatos();
		
	}
	private class TextFieldFacturaFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldFactura.getText().equalsIgnoreCase("")) {
				textFieldFactura.setText("Nº Factura");
			}
		}
		@Override
		public void focusGained(FocusEvent arg0) {
			textFieldFactura.setText("");
		}
	}
	private class TextFieldProveedorFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldProveedor.getText().equalsIgnoreCase("")) {
				textFieldProveedor.setText("CIF Proveedor");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldProveedor.setText("");
		}
	}
	private class TextFieldDniEmpleadoFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldDniEmpleado.getText().equalsIgnoreCase("")) {
				textFieldDniEmpleado.setText("DNI Empleado");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldDniEmpleado.setText("");
		}
	}
	private class TextFieldLoteFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldLote.getText().equalsIgnoreCase("")) {
				textFieldLote.setText("Nº Lote");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldLote.setText("");
		}
	}
	private class TextFieldFormaPagoFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldFormaPago.getText().equalsIgnoreCase("")) {
				textFieldFormaPago.setText("Forma Pago");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldFormaPago.setText("");
		}
	}
	private class TextFieldFinalizadoFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldFinalizado.getText().equalsIgnoreCase("")) {
				textFieldFinalizado.setText("Finalizado");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldFinalizado.setText("");
		}
	}
	private class TextFieldPagadoFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldPagado.getText().equalsIgnoreCase("")) {
				textFieldPagado.setText("Pagado");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldPagado.setText("");
		}
	}
	private class TextFieldUnidadesFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldUnidades.getText().equalsIgnoreCase("")) {
				textFieldUnidades.setText("Unidades");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldUnidades.setText("");
		}
	}
	private class TextFieldCosteFocusListener extends FocusAdapter {
		@Override
		public void focusLost(FocusEvent e) {
			if (textFieldCoste.getText().equalsIgnoreCase("")) {
				textFieldCoste.setText("Coste");
			}
		}
		@Override
		public void focusGained(FocusEvent e) {
			textFieldCoste.setText("");
		}
	}
	private class BtnRegistrarCompraMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			ioDatos.conectarBD();

		}
	}
	private class BtnVerComprasMouseListener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			
			ArrayList<Compra> vCompras = new ArrayList<Compra>();
			
			String texto="";
			for (Compra comp: vCompras) {
				if (comp!=null) {
					texto += comp.toString() + "\n";
				}
			}
			
			textArea.setText(texto);
		}
	}
	
	public void guardarCompraEnBD(int factura, String emple,String provee, 
			String lote, String forma, String finaliz, String pagad, String fecha, String observ, int unidades, double coste, int artic) {

		Connection con = null;
		ioDatos.conectarBD();
		boolean finalizado = true;
		boolean pagado = true;
		
		factura = Integer.parseInt(textFieldFactura.getText());
		emple = textFieldDniEmpleado.getText();
		provee = textFieldProveedor.getText();
		lote = textFieldLote.getText();
		forma = textFieldFormaPago.getText();
		finaliz = textFieldFinalizado.getText();
		pagad = textFieldPagado.getText();
		
		if (finaliz.equalsIgnoreCase("si")) {
			finalizado=true;
		}else {
			finalizado=false;
		}
		
		if (pagad.equalsIgnoreCase("si")) {
			pagado=true;
		}else {
			pagado=false;
		}
		
		fecha = calendar.getDate().toString();
		unidades = Integer.parseInt(textFieldUnidades.getText());
		coste =  Integer.parseInt(textFieldCoste.getText());
		artic =  Integer.parseInt(comboBoxArt.getSelectedItem().toString());
		
		
		String sql = "Insert into alumnos values(?,?,?,?,?,?,?,?,?,?,?,?);";

		try {
			
		
			PreparedStatement pt = (PreparedStatement) con.prepareStatement(sql);
			pt.setInt(1, factura);
			pt.setString(2, emple);
			pt.setString(3, provee);
			pt.setString(4, lote);
			pt.setString(5, forma);
			pt.setBoolean(6, finalizado);
			pt.setBoolean(7, pagado);
			pt.setString(8, fecha);
			pt.setString(9, "");
			pt.setInt(10, unidades);
			pt.setDouble(11, coste);
			pt.setInt(12, artic);
			

			pt.executeUpdate();
			
			pt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ioDatos.desconectarBD();
	}
	
	public ArrayList<Compra> mostrarCompras() {
		String sql = "Select * from Compra;";

		Connection con = null;
		ioDatos.conectarBD();
		ArrayList<Compra> vCompra= new ArrayList<Compra>();
		
		
		
		try {
			PreparedStatement pt = (PreparedStatement) con.prepareStatement(sql);
			ResultSet rs = pt.executeQuery(sql);

			while (rs.next()) {
				for (Compra compra : vCompra) {
					compra = new Compra(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
							rs.getBoolean(6), rs.getBoolean(7), rs.getDate(8), rs.getString(9), rs.getInt(10), rs.getDouble(11), rs.getInt(12));
				}
				
			}
			rs.close();
			pt.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vCompra;
		
	}
	

	
}
