
public class Banco {
	
	private Cliente[] arrayCliente = new Cliente[10];
	private int n_clientes = 0;
	

	public void agregarCliente(Cliente cliente){
		n_clientes = getN_clientes();
		if(n_clientes < 10){
		arrayCliente[n_clientes] = cliente;
		n_clientes++;
		System.out.println("Cliente agregado");
		}
	}
	
	public int getNClientes(){
//		n_clientes = 0;
//		while(n_clientes < 10){
//			if(arrayCliente[n_clientes] != null){
//				n_clientes++;
//			}else{
//				System.out.println("Posición vacía" );
//			}
//		}
		return n_clientes;
	}
	
	public Cliente getCliente(String nombre){
//		Cliente clienteX = new Cliente();
//		for(int i = 0; i < arrayCliente.length; i++){
//			if(arrayCliente[i].getNombre() == nombre){
//				clienteX = arrayCliente[i];
//				System.out.println("Cliente existe");
//				break;
//			}else{
//				System.out.println("El cliente no existe");
//			}
//		}
		Cliente clientX = new Cliente();
		for(n_clientes = getN_clientes(); n_clientes <= getN_clientes() && n_clientes > 0; n_clientes--){
			
			arrayCliente[n_clientes] = clientX;
			if(clientX.getNombre() == nombre){
				System.out.println("El nombre del cliente es: " + clientX.getNombre());
			}else{
				System.out.println("El cliente con el nombre:");
			}
			
		}
		
		return ;
		
	}
	
	
	public int getN_clientes() {
		return n_clientes;
	}

	public void setN_clientes(int n_clientes) {
		this.n_clientes = n_clientes;
	}

}
