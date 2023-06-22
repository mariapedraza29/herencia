package clases;

import java.util.HashMap;

import clases.empleados.EmpleadoEventual;
import clases.empleados.EmpleadoPlanilla;
import clases.empleados.Medico;

public class ModeloDatos {
	HashMap<String, Paciente> pacientesMap;
	HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap;
	HashMap<String, EmpleadoEventual> empleadoEventualMap;
	HashMap<String, Medico> medicosMap;
}
