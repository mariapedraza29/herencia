
public class Empleado {
	private String nombre;
	private String apellido;
	private int edad;
	
	
	public Empleado(String nombre, String apellido, int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido() {
		this.apellido=apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public void obtenerDetalles() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+ apellido);
		System.out.println("Edad: "+edad);
	}
}
