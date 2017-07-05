
public class Cliente {
	
	private String nombre;
	private String A_Paterno;
	private String A_Materno;
	private Cuenta cuenta;
	
	public Cliente(){
		
	}
	
	public Cliente(String name, String a_paterno, String a_materno, Cuenta cuenta1){
		nombre = name;
		A_Paterno = a_paterno;
		A_Materno = a_materno;
		cuenta = cuenta1;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getA_Paterno() {
		return A_Paterno;
	}
	public void setA_Paterno(String a_Paterno) {
		A_Paterno = a_Paterno;
	}
	public String getA_Materno() {
		return A_Materno;
	}
	public void setA_Materno(String a_Materno) {
		A_Materno = a_Materno;
	}
	public Cuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}
