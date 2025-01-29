package controllers;

import java.util.HashMap;
import java.util.Map;
import models.Empleado;

public class EmpleadoController {

    private Map<Integer, Empleado> empleados;

    public EmpleadoController() {
        empleados = new HashMap<>();
    }

    public boolean addEmpleado(Empleado empleado) {
        if (empleados.containsKey(empleado.getId())) {
            return false;
        }
        empleados.put(empleado.getId(), empleado);
        return true;
    }

    public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }

    public void displayEmpleados() {
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres() {
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado.getName());
        }
    }

    public void displayLlaver() {
        for (Integer clave : empleados.keySet()) {
            System.out.println(clave);
        }
    }

    public void displayEmpleadoSinEntry() {
        for (Integer clave : empleados.keySet()) {
            Empleado empleado = empleados.get(clave);
            System.out.println(clave + " - " + empleado);
        }
    }
}
