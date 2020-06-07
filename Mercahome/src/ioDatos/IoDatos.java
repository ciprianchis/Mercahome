package ioDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import clases.Empleado;

public class IoDatos {

	private final static String url = "jdbc:mysql://localhost:3306/mercahome";
	private final static String usuario = "root";
	private final static String passwd = "root";
	private static Connection con;

	public void BDConecxion() {
		con = null;
	}
	
	public static void conectarBD() {
		if (con == null) {
			try {
				con = DriverManager.getConnection(url, usuario, passwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			JOptionPane.showMessageDialog(null, "Conectado");
		}

	}

	public static void desconectarBD() {
		if (con != null) {
			try {
				con.close();
				con = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

	public ArrayList<Empleado> cargarDatos() {
		ArrayList<Empleado> vEmpleados = new ArrayList();
		
		Scanner leer = null;

		File empleados = new File("empleados.txt");

		if (!empleados.exists()) {
			try {
				empleados.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			leer = new Scanner(empleados);

			while (leer.hasNext()) {
				String linea = leer.nextLine();
				Empleado empleado= obtenerEmpleado(linea);
				
				for (Empleado emple : vEmpleados) {
					emple = empleado;
					break;
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();		}

		
		
		
		return vEmpleados;
	}
	
	
	public void escribirFichero(ArrayList<Empleado> vEmpleados, String nombre, String pass) {
		FileWriter fw = null;
		PrintWriter pw = null;
		File empleados = new File("empleados.txt");

		if (!empleados.exists()) {
			try {
				empleados.createNewFile();
			} catch (IOException e) {
				System.out.println("Error al crear el fichero");
			}
		} else {


			try {
				fw = new FileWriter(empleados,true);
				pw = new PrintWriter(fw);
				
				Empleado empleado = new Empleado(nombre, pass);
				
				for (Empleado emple: vEmpleados) {
					pw.println(empleado.getNombre() + "-" + emple.getPasswd());
					break;
				}
				
				
			} catch (FileNotFoundException e) {
				System.out.println("ERROR AL GUARDAR EL FICHERO");
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				pw.close();
			}

		}
	}
	
	public static boolean comprobarEmple(String nombre, String passwd) {
		boolean correcto = false;
		IoDatos ioDatos = new IoDatos();

		ArrayList<Empleado> vEmpleados = ioDatos.cargarDatos();
		
		for (Empleado emple : vEmpleados) {
			if (emple.getNombre().equalsIgnoreCase(nombre) && emple.getPasswd().equalsIgnoreCase(passwd)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	private Empleado obtenerEmpleado(String linea) {
		String nombre ="";
		String passwd ="";
		int caracter = 0;
		nombre = linea.substring(0, linea.indexOf("-")).trim();
		passwd = linea.substring(linea.indexOf(" ")).trim();
		Empleado empleado = new Empleado(nombre, passwd);
		
		
		return empleado;

	}

	
}
