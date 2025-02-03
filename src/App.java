
import controllers.Ejercicios;
import controllers.EmpleadoController;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        //runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();



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
        Ejercicios ejercicios = new Ejercicios();

        System.out.println("¿Son anagramas? " + Ejercicios.areAnagrams("listen", "silent")); // true
        System.out.println("¿Son anagramas? " + Ejercicios.areAnagrams("hello", "bello")); // false
        System.out.println("¿Son anagramas? " + Ejercicios.areAnagrams("triangle", "integral")); // true

        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);

        if (resultado != null) {
            System.out.println("Índices encontrados: [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontraron índices.");
        }
    }
}