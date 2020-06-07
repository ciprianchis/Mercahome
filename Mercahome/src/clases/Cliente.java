package clases;

public class Cliente {
	private String cif_cli;
	private String forma_pago_cli;
	private String poblacion_cli;
	private String direccion_cli;
	private String	provincia_cli; 
	private int telefono_cli;
	private int cp_cli;
    private String ccc_cli;
	private String nombre_cli;
	private boolean historico_cli;
	private String observaciones_cli;
	
	public Cliente(String cif_cli, String forma_pago_cli, String poblacion_cli, String direccion_cli,
			String provincia_cli, int telefono_cli, int cp_cli, String ccc_cli, String nombre_cli,
			boolean historico_cli, String observaciones_cli) {
		this.cif_cli = cif_cli;
		this.forma_pago_cli = forma_pago_cli;
		this.poblacion_cli = poblacion_cli;
		this.direccion_cli = direccion_cli;
		this.provincia_cli = provincia_cli;
		this.telefono_cli = telefono_cli;
		this.cp_cli = cp_cli;
		this.ccc_cli = ccc_cli;
		this.nombre_cli = nombre_cli;
		this.historico_cli = historico_cli;
		this.observaciones_cli = observaciones_cli;
	}

	public String getCif_cli() {
		return cif_cli;
	}

	public void setCif_cli(String cif_cli) {
		this.cif_cli = cif_cli;
	}

	public String getForma_pago_cli() {
		return forma_pago_cli;
	}

	public void setForma_pago_cli(String forma_pago_cli) {
		this.forma_pago_cli = forma_pago_cli;
	}

	public String getPoblacion_cli() {
		return poblacion_cli;
	}

	public void setPoblacion_cli(String poblacion_cli) {
		this.poblacion_cli = poblacion_cli;
	}

	public String getDireccion_cli() {
		return direccion_cli;
	}

	public void setDireccion_cli(String direccion_cli) {
		this.direccion_cli = direccion_cli;
	}

	public String getProvincia_cli() {
		return provincia_cli;
	}

	public void setProvincia_cli(String provincia_cli) {
		this.provincia_cli = provincia_cli;
	}

	public int getTelefono_cli() {
		return telefono_cli;
	}

	public void setTelefono_cli(int telefono_cli) {
		this.telefono_cli = telefono_cli;
	}

	public int getCp_cli() {
		return cp_cli;
	}

	public void setCp_cli(int cp_cli) {
		this.cp_cli = cp_cli;
	}

	public String getCcc_cli() {
		return ccc_cli;
	}

	public void setCcc_cli(String ccc_cli) {
		this.ccc_cli = ccc_cli;
	}

	public String getNombre_cli() {
		return nombre_cli;
	}

	public void setNombre_cli(String nombre_cli) {
		this.nombre_cli = nombre_cli;
	}

	public boolean isHistorico_cli() {
		return historico_cli;
	}

	public void setHistorico_cli(boolean historico_cli) {
		this.historico_cli = historico_cli;
	}

	public String getObservaciones_cli() {
		return observaciones_cli;
	}

	public void setObservaciones_cli(String observaciones_cli) {
		this.observaciones_cli = observaciones_cli;
	}

	@Override
	public String toString() {
		return "\n"+ cif_cli + "-" + forma_pago_cli + "-" + poblacion_cli
				+ "-" + direccion_cli + "-" + provincia_cli + "-"
				+ telefono_cli + "-" + cp_cli + "-" + ccc_cli + "-" + nombre_cli
				+ "-" + historico_cli + "-" + observaciones_cli;
	}
	
	
}
