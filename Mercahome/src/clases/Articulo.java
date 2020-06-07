package clases;

public class Articulo {
	private int cod_articulo;
	private String cod_familia;
	private String cif_proveedor;
	private String fecha_ultima_compra_articulo;
	private String unidad_medida;
	private String descripcion_articulo;
	private double precio_venta_articulo;
	private String marca_articulo;
	private double precio_compra;
	public Articulo(int cod_articulo, String cod_familia, String cif_proveedor, String fecha_ultima_compra_articulo,
			String unidad_medida, String descripcion_articulo, double precio_venta_articulo, String marca_articulo,
			double precio_compra) {
		super();
		this.cod_articulo = cod_articulo;
		this.cod_familia = cod_familia;
		this.cif_proveedor = cif_proveedor;
		this.fecha_ultima_compra_articulo = fecha_ultima_compra_articulo;
		this.unidad_medida = unidad_medida;
		this.descripcion_articulo = descripcion_articulo;
		this.precio_venta_articulo = precio_venta_articulo;
		this.marca_articulo = marca_articulo;
		this.precio_compra = precio_compra;
	}
	public int getCod_articulo() {
		return cod_articulo;
	}
	public void setCod_articulo(int cod_articulo) {
		this.cod_articulo = cod_articulo;
	}
	public String getCod_familia() {
		return cod_familia;
	}
	public void setCod_familia(String cod_familia) {
		this.cod_familia = cod_familia;
	}
	public String getCif_proveedor() {
		return cif_proveedor;
	}
	public void setCif_proveedor(String cif_proveedor) {
		this.cif_proveedor = cif_proveedor;
	}
	public String getFecha_ultima_compra_articulo() {
		return fecha_ultima_compra_articulo;
	}
	public void setFecha_ultima_compra_articulo(String fecha_ultima_compra_articulo) {
		this.fecha_ultima_compra_articulo = fecha_ultima_compra_articulo;
	}
	public String getUnidad_medida() {
		return unidad_medida;
	}
	public void setUnidad_medida(String unidad_medida) {
		this.unidad_medida = unidad_medida;
	}
	public String getDescripcion_articulo() {
		return descripcion_articulo;
	}
	public void setDescripcion_articulo(String descripcion_articulo) {
		this.descripcion_articulo = descripcion_articulo;
	}
	public double getPrecio_venta_articulo() {
		return precio_venta_articulo;
	}
	public void setPrecio_venta_articulo(double precio_venta_articulo) {
		this.precio_venta_articulo = precio_venta_articulo;
	}
	public String getMarca_articulo() {
		return marca_articulo;
	}
	public void setMarca_articulo(String marca_articulo) {
		this.marca_articulo = marca_articulo;
	}
	public double getPrecio_compra() {
		return precio_compra;
	}
	public void setPrecio_compra(double precio_compra) {
		this.precio_compra = precio_compra;
	}
	@Override
	public String toString() {
		return "\n" + cod_articulo + "-" + cod_familia + "-"
				+ cif_proveedor + "-" + fecha_ultima_compra_articulo + "-"
				+ unidad_medida + "-" + descripcion_articulo + "-"
				+ precio_venta_articulo + "-" + marca_articulo + "-" + precio_compra;
	}
	
	
}
