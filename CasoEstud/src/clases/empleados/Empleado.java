package clases.empleados;

import javax.swing.JOptionPane;

import clases.Persona;

public class Empleado extends Persona{
	private String codigoDeEmpleado;
	private int numeroDeHoreasExtras;
	private String fecaIngreso;
	private String area;
	private String cargo;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		codigoDeEmpleado =JOptionPane.showInputDialog("Ingrese el codigo del empleado");
		numeroDeHoreasExtras=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de horasa extras"));
		fecaIngreso =JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa)");
		area =JOptionPane.showInputDialog("Ingrese el area");
		cargo =JOptionPane.showInputDialog("Ingrese el cargo");
	}
	
	public String getCodigoDeEmpleado() {
		return codigoDeEmpleado;
	}
	public void setCodigoDeEmpleado(String codigoDeEmpleado) {
		this.codigoDeEmpleado = codigoDeEmpleado;
	}
	public int getNumeroDeHoreasExtras() {
		return numeroDeHoreasExtras;
	}
	public void setNumeroDeHoreasExtras(int numeroDeHoreasExtras) {
		this.numeroDeHoreasExtras = numeroDeHoreasExtras;
	}
	public String getFecaIngreso() {
		return fecaIngreso;
	}
	public void setFecaIngreso(String fecaIngreso) {
		this.fecaIngreso = fecaIngreso;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
