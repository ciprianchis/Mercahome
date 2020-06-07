package clases;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class Proveedor {
	private String cif_proveedor;
	private String forma_pago_proveedor;
	private String poblacion_proveedor;
	private String direccion_proveedor;
	private String	provincia_proveedor; 
	private int telefono_proveedor;
	private int cp_proveedor;
    private String ccc_proveedor;
	private String nombre_proveedor;
	private boolean historico_proveedor;
	private String observaciones_proveedor;
	public Proveedor(String cif_proveedor, String forma_pago_proveedor, String poblacion_proveedor,
			String direccion_proveedor, String provincia_proveedor, int telefono_proveedor, int cp_proveedor,
			String ccc_proveedor, String nombre_proveedor, boolean historico_proveedor,
			String observaciones_proveedor) {
		super();
		this.cif_proveedor = cif_proveedor;
		this.forma_pago_proveedor = forma_pago_proveedor;
		this.poblacion_proveedor = poblacion_proveedor;
		this.direccion_proveedor = direccion_proveedor;
		this.provincia_proveedor = provincia_proveedor;
		this.telefono_proveedor = telefono_proveedor;
		this.cp_proveedor = cp_proveedor;
		this.ccc_proveedor = ccc_proveedor;
		this.nombre_proveedor = nombre_proveedor;
		this.historico_proveedor = historico_proveedor;
		this.observaciones_proveedor = observaciones_proveedor;
	}
	public String getCif_proveedor() {
		return cif_proveedor;
	}
	public void setCif_proveedor(String cif_proveedor) {
		this.cif_proveedor = cif_proveedor;
	}
	public String getForma_pago_proveedor() {
		return forma_pago_proveedor;
	}
	public void setForma_pago_proveedor(String forma_pago_proveedor) {
		this.forma_pago_proveedor = forma_pago_proveedor;
	}
	public String getPoblacion_proveedor() {
		return poblacion_proveedor;
	}
	public void setPoblacion_proveedor(String poblacion_proveedor) {
		this.poblacion_proveedor = poblacion_proveedor;
	}
	public String getDireccion_proveedor() {
		return direccion_proveedor;
	}
	public void setDireccion_proveedor(String direccion_proveedor) {
		this.direccion_proveedor = direccion_proveedor;
	}
	public String getProvincia_proveedor() {
		return provincia_proveedor;
	}
	public void setProvincia_proveedor(String provincia_proveedor) {
		this.provincia_proveedor = provincia_proveedor;
	}
	public int getTelefono_proveedor() {
		return telefono_proveedor;
	}
	public void setTelefono_proveedor(int telefono_proveedor) {
		this.telefono_proveedor = telefono_proveedor;
	}
	public int getCp_proveedor() {
		return cp_proveedor;
	}
	public void setCp_proveedor(int cp_proveedor) {
		this.cp_proveedor = cp_proveedor;
	}
	public String getCcc_proveedor() {
		return ccc_proveedor;
	}
	public void setCcc_proveedor(String ccc_proveedor) {
		this.ccc_proveedor = ccc_proveedor;
	}
	public String getNombre_proveedor() {
		return nombre_proveedor;
	}
	public void setNombre_proveedor(String nombre_proveedor) {
		this.nombre_proveedor = nombre_proveedor;
	}
	public boolean isHistorico_proveedor() {
		return historico_proveedor;
	}
	public void setHistorico_proveedor(boolean historico_proveedor) {
		this.historico_proveedor = historico_proveedor;
	}
	public String getObservaciones_proveedor() {
		return observaciones_proveedor;
	}
	public void setObservaciones_proveedor(String observaciones_proveedor) {
		this.observaciones_proveedor = observaciones_proveedor;
	}
	@Override
	public String toString() {
		return "\n" + cif_proveedor + "-" + forma_pago_proveedor
				+ "-" + poblacion_proveedor + "-" + direccion_proveedor
				+ "-" + provincia_proveedor + "-" + telefono_proveedor
				+ "-" + cp_proveedor + "-" + ccc_proveedor + "-"
				+ nombre_proveedor + "-" + historico_proveedor + "-"
				+ observaciones_proveedor;
	}
	
	
	
	
}
