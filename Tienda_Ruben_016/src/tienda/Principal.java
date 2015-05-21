package tienda;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
	Clientes cliente1 = new Clientes();
	Clientes cliente2 = new Clientes();
	Clientes cliente3 = new Clientes();
	
	Productos producto1 = new Productos();
	Productos producto2 = new Productos();
	Productos producto3 = new Productos();
	
	Tiendas Tienda1 = new Tiendas();
	Tiendas Tienda2 = new Tiendas();
	Tiendas Tienda3 = new Tiendas();
	
	Vendedores vendedor1 = new Vendedores();
	Vendedores vendedor2 = new Vendedores();
	Vendedores vendedor3 = new Vendedores();
	
	Ventas venta1 = new Ventas();
	Ventas venta2 = new Ventas();
	Ventas venta3 = new Ventas();
	
	String id_cliente;
	String id_producto;
	String id_vendedor;
	String id_tienda;
	String sysdatatime;
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introduce el id del cliente : ");
	id_cliente = entrada.next();
	System.out.println("Introduce el id del producto : ");
	id_producto = entrada.next();
	System.out.println("Introduce el id del vendedor : ");
	id_vendedor = entrada.next();
	System.out.println("Introduce el id de la tienda : ");
	id_tienda = entrada.next();
	System.out.println("La hora del sistema es : +sysdatatime ");
}
}