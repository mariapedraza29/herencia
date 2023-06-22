package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Paciente extends Persona{
	private int numeroHistoriaClinica;
	private String sexo;
	private String grupoSanguineo;
	private ArrayList<String> listaMedicamentosAlergico;
	
	@Override
	public void registrarDatos() {
		super.registrarDatos();
		
		listaMedicamentosAlergico =new ArrayList<String>();
		numeroHistoriaClinica=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la historia clinica: "));
		sexo=JOptionPane.showInputDialog("ingrese el sexo");
		grupoSanguineo=JOptionPane.showInputDialog("Ingrese el grupo sanguineo");
		
		String pregunta=JOptionPane.showInputDialog("¿es alergico a algunmedicamento? ingrese si o no");
		
		if(pregunta.equalsIgnoreCase("si")) {
			String medicamento="";
			String continuar="";
			do {
				medicamento=JOptionPane.showInputDialog("Ingrese el nombre del medicamento al que es alergico");
				listaMedicamentosAlergico.add(medicamento);
				
				continuar=JOptionPane.showInputDialog("Ingrese si, si desea continuar");
			} while (continuar.equalsIgnoreCase("si"));
		}
	}
	
	
	public int getNumeroHistoriaClinica() {
		return numeroHistoriaClinica;
	}
	public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
		this.numeroHistoriaClinica = numeroHistoriaClinica;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public ArrayList<String> getListaMedicamentoAlergico() {
		return listaMedicamentosAlergico;
	}
	public void setListaMedicamentoAlergico(ArrayList<String> lisMedAlerg) {
		this.listaMedicamentosAlergico = lisMedAlerg;
	}
}


