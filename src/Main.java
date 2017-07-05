
public class Main {
		
		public static void main(String[] args){
			
			operacion(args[0], args[1], args[2]);
			
		}
		
		public static void suma(String num1, String num2){
			int numA = Integer.parseInt(num1);
			int numB = Integer.parseInt(num2);
			
			int resultado = numA + numB;
			
			System.out.println("La suma es: " + resultado);
			
		}
		
		public static void resta(String num1, String num2){
			int numA = Integer.parseInt(num1);
			int numB = Integer.parseInt(num2);
			
			int resultado = numA - numB;
			
			System.out.println("La resta es: " + resultado);
		}
		
		public static void multiplicacion(String num1, String num2){
			int numA = Integer.parseInt(num1);
			int numB = Integer.parseInt(num2);
			
			int resultado = numA * numB;
			
			System.out.println("La multiplicacion es: " + resultado);
		}
		
		public static void division(String num1, String num2){
			int numA = Integer.parseInt(num1);
			int numB = Integer.parseInt(num2);
			
			int resultado = numA / numB;
			
			System.out.println("La division es: " + resultado);
		}
		
		public static void operacion(String num, String cantidad1, String cantidad2){
		int compara = Integer.parseInt(num);
		
		switch (compara) {
		case 1:
			suma(cantidad1, cantidad2);
			break;
		case 2:
			resta(cantidad1, cantidad2);
			break;
		case 3:
			multiplicacion(cantidad1, cantidad2);
			break;
		case 4:
			division(cantidad1, cantidad2);
			break;
		default:
			System.out.println("no eligio una opcion");
			break;
		}
	}
	
}
