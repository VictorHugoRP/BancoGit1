
public class Cuenta {
	
	private double balance;
	
	public void deposito(double cantidad){
		
		balance = balance + cantidad;
		
	}
	
	public void retiro(double cantidad1){
		 
		balance = balance - cantidad1;
		
	}
	
	double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		this.balance = balance;
	}

}
