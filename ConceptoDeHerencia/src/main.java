
public class main {
	public static void main(String [] args) {
		Empleado empleado=new Empleado("jhon","Doe",30);
		empleado.obtenerDetalles();
		
		System.out.println("----------------");
		Desarrollador desarrollador = new Desarrollador("jane","smith",25,"java");
		desarrollador.obtenerDetalles();
	}
}
