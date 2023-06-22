package clases.empleados;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado{
	private double salarioMensual;
	private double porcentajeAdicionalPorHoraExtra;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		salarioMensual =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario Mensual"));
		porcentajeAdicionalPorHoraExtra=Double.parseDouble(JOptionPane.showInputDialog("Ingrese fecha nacimiento (dd/mm/aaaa)"));
	}
	public double getSalarioMensual() {
		return salarioMensual;
	}
	public void setSalarioMensual(double salarioMensual) {
		this.salarioMensual = salarioMensual;
	}
	public double getPorcentajeAdicionalPorHoraExtra() {
		return porcentajeAdicionalPorHoraExtra;
	}
	public void setPorcentajeAdicionalPorHoraExtra(double porcentajeAdicionalPorHoraExtra) {
		this.porcentajeAdicionalPorHoraExtra = porcentajeAdicionalPorHoraExtra;
	}
}
