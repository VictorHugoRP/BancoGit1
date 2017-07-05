

public class PruebaBanco {

	public static void main(String args[]){
		
		Cliente clienteNuevo = new Cliente();
		Cuenta cuentaCliente = new Cuenta();
		cuentaCliente.setBalance(4.5);
		Cliente ClienteNuevo1 = new Cliente("victor", "rojas", "perez", cuentaCliente);
		Cliente clientenew2 = new Cliente("Hugo", "garcia", "osprno", cuentaCliente);
		Banco banco = new Banco();
		banco.agregarCliente(ClienteNuevo1);
		banco.agregarCliente(clientenew2);
		int numClientes = banco.getNClientes();
		System.out.println(numClientes);
	}
	
}
