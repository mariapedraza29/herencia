
public class Desarrollador extends Empleado{
	

	private String lenguajePrincipal;
	
	public Desarrollador(String nombre, String apellido, int edad, String lenguajePrincipal) {
		super(nombre,apellido,edad);
		this.lenguajePrincipal=lenguajePrincipal;
	}
	public String getLenguaje() {
		return lenguajePrincipal;
	}
	public void setLenguajePrincipal(String LenguajePrincipal) {
		this.lenguajePrincipal=lenguajePrincipal;
	}
	@Override
	public void obtenerDetalles() {
		super.obtenerDetalles();
		System.out.println("Lenguje principal: "+ lenguajePrincipal);
	}
	
}
