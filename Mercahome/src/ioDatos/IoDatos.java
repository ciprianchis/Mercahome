package ioDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import clases.Empleado;

public class IoDatos {

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
			e.printStackTrace();
		}

		
		
		
		return vEmpleados;
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
