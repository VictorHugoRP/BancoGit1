
import java.util.Scanner;

public class PruebaCuenta {
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escriba el nombre del cliente: ");
		String nombre1 = entrada.next();
		
		System.out.println("Escriba el Apellido Paterno del cliente: ");
		String a_pat1 = entrada.next();
		
		System.out.println("Escriba el Apellido Materno del cliente: ");
		String a_mat1 = entrada.next();
		
		System.out.print("Escriba una cantidad: ");
		double cantidad1 = entrada.nextDouble();
		
		Cuenta cuentaP = new Cuenta();
		
		cuentaP.setBalance(cantidad1);
		
		Cliente cliente1 = new Cliente(nombre1, a_pat1, a_mat1, cuentaP);	
		
		System.out.println("Escriba la cantidad a depositar: ");
		double cantidadDeposito = entrada.nextDouble();
		
		System.out.println("Escriba la cantidad de retiro: ");
		double cantidadRetiro = entrada.nextDouble();
		
		cliente1.getCuenta().deposito(cantidadDeposito);
		cliente1.getCuenta().retiro(cantidadRetiro);
		
		
		
//		cuentaP.setBalance(cantidad1);
//		
//		System.out.println("El balance inicia en: " + cantidad1);
//		System.out.println("Usted deposito: " + cantidadDeposito);
//		
//		cuentaP.deposito(cantidadDeposito);
//		
		System.out.println("Ahora el balance actual con deposito es: " + cliente1.getCuenta().getBalance());
//		
//		cuentaP.retiro(cantidadRetiro);
		
		System.out.println("Ahora el balance actual con retiro es: " + cliente1.getCuenta().getBalance());
		
		System.out.println("Nombre Cliente: " + cliente1.getNombre() + " " + cliente1.getA_Paterno() + " " + cliente1.getA_Materno());
		
		
	}

}
