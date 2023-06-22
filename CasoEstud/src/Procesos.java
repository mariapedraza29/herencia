import javax.swing.JOptionPane;

import clases.ModeloDatos;
import clases.Paciente;

public class Procesos {
	ModeloDatos miModeloDatos;

	public Procesos() {
		miModeloDatos = new ModeloDatos();
		presentarMenuOpciones();
	}

	private void presentarMenuOpciones() {
		String menu = "MENU HOSPITAL\n\n";
		menu += "1. Registrar Paciente\n";
		menu += "2. Registrar Empleado";
		menu += "3. Registrar Cita Medica\n";
		menu += "4. Imprimir Informacion\n";
		menu += "5. Salir\n";
		menu += "Ingrese una opcion\n";

		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcion) {
			case 1: {
				registrarPaciente();
				break;
			}
			case 2: {
				registrarEmpleado();
				break;
			}
			case 3: {
				registrarCitaMedica();
				break;
			}
			case 4: {
				registrarInformacion();
				break;
			}
			case 5: {
				System.out.println("El sistema ha terminado!");
				break;
			}
			default:
				System.out.println("No existe el codigo, verifique nuevamente");
				break;
			}
		} while (opcion != 5);
	}

	private void registrarInformacion() {
		// TODO Auto-generated method stub

	}

	private void registrarCitaMedica() {
		// TODO Auto-generated method stub

	}

	private void registrarEmpleado() {
		// TODO Auto-generated method stub

	}

	private void registrarPaciente() {
		Paciente miPaciente = new Paciente();
		miPaciente.registrarDatos();

		miModeloDatos.registrarPersona(miPaciente);
		
	}
	public void registrarEmpleado() {
		
	}
}
