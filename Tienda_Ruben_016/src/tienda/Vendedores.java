package tienda;

public class Vendedores {
	int id_Vendedor;
	public int getId_Vendedor() {
		return id_Vendedor;
	}
	public void setId_Vendedor(int id_Vendedor) {
		this.id_Vendedor = id_Vendedor;
	}
	public String getNomCliente() {
		return NomCliente;
	}
	public void setNomCliente(String nomCliente) {
		NomCliente = nomCliente;
	}
	public String getApeCliente() {
		return ApeCliente;
	}
	public void setApeCliente(String apeCliente) {
		ApeCliente = apeCliente;
	}
	String NomCliente;
	String ApeCliente;
}
