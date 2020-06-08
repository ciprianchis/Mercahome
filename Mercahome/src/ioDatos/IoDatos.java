package ioDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import clases.Empleado;

public class IoDatos {

	private final static String url = "jdbc:mysql://localhost:3306/mercahome?autoReconnect=true&useSSL=false\"";
	private final static String usuario = "root";
	private final static String passwd = "root";
	private static Connection con;

	public void BDConecxion() {
		con = null;
	}
	
	public void conectarBD() {
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

	public void desconectarBD() {
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
	
	



	public static void escribirFichero(ArrayList<Empleado> vEmpleados) {
		
		
		File empleados = new File("empleados.dat");
		FileOutputStream fo = null;
		ObjectOutputStream escribir = null;
		
		if (!empleados.exists()) {
			try {
				empleados.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			fo = new FileOutputStream(empleados);
			escribir = new ObjectOutputStream(fo);
			
			escribir.writeObject(vEmpleados);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fo.close();
				escribir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	

	public ArrayList<Empleado> cargarDatos() {
		
		File empleados = new File("empleados.dat");
		FileInputStream fi = null;
		ObjectInputStream leer = null;
		ArrayList<Empleado> vEmpleados = new ArrayList(); 
		
		if (!empleados.exists()) {
			try {
				empleados.createNewFile();
				return vEmpleados;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			fi = new FileInputStream(empleados);
			leer = new ObjectInputStream(fi);
			
			
			vEmpleados = (ArrayList<Empleado>) leer.readObject();
			
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Fin de lectura");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vEmpleados;
		
		
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

	
}
