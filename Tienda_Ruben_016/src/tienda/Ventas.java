package tienda;

import java.sql.Date;

public class Ventas {
	int id_cliente, id_Producto, id_Vendedor,
	id_tienda;
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	public int getId_Producto() {
		return id_Producto;
	}
	public void setId_Producto(int id_Producto) {
		this.id_Producto = id_Producto;
	}
	public int getId_Vendedor() {
		return id_Vendedor;
	}
	public void setId_Vendedor(int id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}
	public int getId_tienda() {
		return id_tienda;
	}
	public void setId_tienda(int id_tienda) {
		this.id_tienda = id_tienda;
	}
	public Date getFecha_hora() {
		return fecha_hora;
	}
	public void setFecha_hora(Date fecha_hora) {
		this.fecha_hora = fecha_hora;
	}
	Date fecha_hora;
	
}
