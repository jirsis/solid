import java.util.List;
import java.util.ArrayList;

public class OpenClosedLauncher {
   public static void main(String args[]){
     List<Empleado> empleados = createEmpleados();
     EmpleadoServicio servicio = new EmpleadoServicio(empleados);
     servicio.calcularBonos();
   }

   private static List<Empleado> createEmpleados(){
     List<Empleado> empleados = new ArrayList<Empleado>();
     empleados.add(new Programador("Guillermo"));
     empleados.add(new Gerente("David"));
     empleados.add(new Programador("Jacinto"));
     empleados.add(new Gerente("Maria"));
     empleados.add(new Programador("Laura"));
     return empleados;
   }
}
