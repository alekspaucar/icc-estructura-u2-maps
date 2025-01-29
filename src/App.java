
import controllers.EmpleadoController;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
       // runEjerccios();
    }
    private static void runEmpleadoExample() {
        EmpleadoController empleadoController = new EmpleadoController(); 

        boolean resultado = empleadoController.addEmpleado(new Empleado(1, "alex", "senior"));  
        System.out.println("Ingreso de Alex: " + resultado);
        
        resultado = empleadoController.addEmpleado(new Empleado(2, "alex", "junior"));  
        System.out.println("Ingreso de Pedro: " + resultado);

        empleadoController.displayEmpleados();  
        empleadoController.displayEmpleadoSinEntry();
        empleadoController.displayEmpleadosSoloNombres();
        empleadoController.displayLlaver();
    }


    private static void runMapExamlpe() {
        new Mapa();
        
    }
    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
