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
	private JComboBox comboBox;
	private JTextArea textArea;
	private JButton btnRealizarCompra;
	private JButton btnVerCompras;
	private JButton btnVerIncidenciasCompra;

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
		setBounds(100, 100, 530, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("MERCAHOME.SA");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Algerian", Font.PLAIN, 20));
		lblNewLabel.setBounds(5, 5, 504, 14);
		contentPane.add(lblNewLabel);
		
		textFieldFactura = new JTextField();
		textFieldFactura.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFactura.setText("N\u00BA Factura");
		textFieldFactura.setBounds(14, 55, 86, 20);
		contentPane.add(textFieldFactura);
		textFieldFactura.setColumns(10);
		
		textFieldProveedor = new JTextField();
		textFieldProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldProveedor.setText("CIF Proveedor");
		textFieldProveedor.setBounds(206, 55, 86, 20);
		contentPane.add(textFieldProveedor);
		textFieldProveedor.setColumns(10);
		
		textFieldDniEmpleado = new JTextField();
		textFieldDniEmpleado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldDniEmpleado.setText("DNI Empleado");
		textFieldDniEmpleado.setBounds(110, 55, 86, 20);
		contentPane.add(textFieldDniEmpleado);
		textFieldDniEmpleado.setColumns(10);
		
		textFieldLote = new JTextField();
		textFieldLote.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldLote.setText("N\u00BA Lote");
		textFieldLote.setBounds(302, 55, 86, 20);
		contentPane.add(textFieldLote);
		textFieldLote.setColumns(10);
		
		textFieldFormaPago = new JTextField();
		textFieldFormaPago.setText("Forma Pago");
		textFieldFormaPago.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFormaPago.setBounds(398, 55, 86, 20);
		contentPane.add(textFieldFormaPago);
		textFieldFormaPago.setColumns(10);
		
		lblNewLabel_1 = new JLabel("COMPRA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(15, 30, 489, 14);
		contentPane.add(lblNewLabel_1);
		
		textFieldFinalizado = new JTextField();
		textFieldFinalizado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldFinalizado.setText("Finalizado");
		textFieldFinalizado.setBounds(14, 86, 86, 20);
		contentPane.add(textFieldFinalizado);
		textFieldFinalizado.setColumns(10);
		
		textFieldPagado = new JTextField();
		textFieldPagado.setText("Pagado");
		textFieldPagado.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPagado.setBounds(110, 86, 86, 20);
		contentPane.add(textFieldPagado);
		textFieldPagado.setColumns(10);
		
		textFieldUnidades = new JTextField();
		textFieldUnidades.setText("Unidades/Kilos");
		textFieldUnidades.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldUnidades.setBounds(206, 86, 86, 20);
		contentPane.add(textFieldUnidades);
		textFieldUnidades.setColumns(10);
		
		textFieldCoste = new JTextField();
		textFieldCoste.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCoste.setText("Coste");
		textFieldCoste.setBounds(302, 86, 86, 20);
		contentPane.add(textFieldCoste);
		textFieldCoste.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Art\u00EDculo:", "01", "02", "03", "04", "05", "06"}));
		comboBox.setBounds(398, 86, 86, 20);
		contentPane.add(comboBox);
		
		textArea = new JTextArea();
		textArea.setBounds(5, 235, 504, 115);
		contentPane.add(textArea);
		
		btnRealizarCompra = new JButton("COMPRAR");
		btnRealizarCompra.setBounds(398, 132, 89, 23);
		contentPane.add(btnRealizarCompra);
		
		btnVerCompras = new JButton("VER COMPRAS");
		btnVerCompras.setBounds(273, 201, 115, 23);
		contentPane.add(btnVerCompras);
		
		btnVerIncidenciasCompra = new JButton("INCIDENCIAS");
		btnVerIncidenciasCompra.setBounds(394, 201, 115, 23);
		contentPane.add(btnVerIncidenciasCompra);
	}
}
