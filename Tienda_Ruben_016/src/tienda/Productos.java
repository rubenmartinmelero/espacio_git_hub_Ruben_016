package tienda;

import java.util.Date;

public class Productos {
	int id_Producto;
	public int getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}
	public String getNomProducto() {
		return NomProducto;
	}
	public void setNomProducto(String nomProducto) {
		NomProducto = nomProducto;
	}
	public Date getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(Date fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	String NomProducto;
	Date fechaCaducidad;
}
