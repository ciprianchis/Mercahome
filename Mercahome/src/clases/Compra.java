package clases;

public class Compra {
	private int num_factura_compra; 
	private String dni_empleado;
	private String cif_proveedor; 
    private String num_lote;
	private String forma_pago_compra;
    private boolean finalizado_compra; 
	private String pagado_compra;
	private String fecha_compra;
	private String observaciones_compra; 
	private int unidades;
	private double coste_compra;
	private int cod_articulo;
	
	
	public Compra(int num_factura_compra, String dni_empleado, String cif_proveedor, String num_lote,
			String forma_pago_compra, boolean finalizado_compra, String pagado_compra, String fecha_compra,
			String observaciones_compra, int unidades, double coste_compra, int cod_articulo) {
		this.num_factura_compra = num_factura_compra;
		this.dni_empleado = dni_empleado;
		this.cif_proveedor = cif_proveedor;
		this.num_lote = num_lote;
		this.forma_pago_compra = forma_pago_compra;
		this.finalizado_compra = finalizado_compra;
		this.pagado_compra = pagado_compra;
		this.fecha_compra = fecha_compra;
		this.observaciones_compra = observaciones_compra;
		this.unidades = unidades;
		this.coste_compra = coste_compra;
		this.cod_articulo = cod_articulo;
	}


	public int getNum_factura_compra() {
		return num_factura_compra;
	}


	public void setNum_factura_compra(int num_factura_compra) {
		this.num_factura_compra = num_factura_compra;
	}


	public String getDni_empleado() {
		return dni_empleado;
	}


	public void setDni_empleado(String dni_empleado) {
		this.dni_empleado = dni_empleado;
	}


	public String getCif_proveedor() {
		return cif_proveedor;
	}


	public void setCif_proveedor(String cif_proveedor) {
		this.cif_proveedor = cif_proveedor;
	}


	public String getNum_lote() {
		return num_lote;
	}


	public void setNum_lote(String num_lote) {
		this.num_lote = num_lote;
	}


	public String getForma_pago_compra() {
		return forma_pago_compra;
	}


	public void setForma_pago_compra(String forma_pago_compra) {
		this.forma_pago_compra = forma_pago_compra;
	}


	public boolean isFinalizado_compra() {
		return finalizado_compra;
	}


	public void setFinalizado_compra(boolean finalizado_compra) {
		this.finalizado_compra = finalizado_compra;
	}


	public String getPagado_compra() {
		return pagado_compra;
	}


	public void setPagado_compra(String pagado_compra) {
		this.pagado_compra = pagado_compra;
	}


	public String getFecha_compra() {
		return fecha_compra;
	}


	public void setFecha_compra(String fecha_compra) {
		this.fecha_compra = fecha_compra;
	}


	public String getObservaciones_compra() {
		return observaciones_compra;
	}


	public void setObservaciones_compra(String observaciones_compra) {
		this.observaciones_compra = observaciones_compra;
	}


	public int getUnidades() {
		return unidades;
	}


	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}


	public double getCoste_compra() {
		return coste_compra;
	}


	public void setCoste_compra(double coste_compra) {
		this.coste_compra = coste_compra;
	}


	public int getCod_articulo() {
		return cod_articulo;
	}


	public void setCod_articulo(int cod_articulo) {
		this.cod_articulo = cod_articulo;
	}


	@Override
	public String toString() {
		return "\n" +  num_factura_compra + "-" + dni_empleado
				+ "-" + cif_proveedor + "-" + num_lote + "-"
				+ forma_pago_compra + "-" + finalizado_compra + "-" + pagado_compra
				+ "-" + fecha_compra + "-" + observaciones_compra + "-"
				+ unidades + "-" + coste_compra + "-" + cod_articulo;
	}
	
	
	
}
