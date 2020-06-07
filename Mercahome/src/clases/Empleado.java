package clases;

public class Empleado {

	private String nombre;
	private String passwd;
	
	public Empleado(String nombre, String passwd) {
		this.nombre = nombre;
		this.passwd = passwd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return nombre + "-" + passwd;
	}
	
	
	
}
