import java.util.List;
import java.util.ArrayList;

public class OpenClosedLauncher{
  public static void main (String args[]){
    List<Empleado> empleados = createEmpleados();
    EmpleadoServicio servicio = new EmpleadoServicio(empleados);
    System.out.println("Antes de bonus");
    printEmpleados(empleados);
    System.out.println("Despues de bonus");
    servicio.calcularBonos();
    printEmpleados(empleados);
  }

  private static void printEmpleados(List<Empleado> empleados){
    for(Empleado empleado: empleados){
      System.out.println(empleado);
    }
  }

  private static List<Empleado> createEmpleados(){
    List<Empleado> empleados = new ArrayList<Empleado>();
    empleados.add(new Empleado(TipoEmpleado.PROGRAMADOR, "Guillermo"));
    empleados.add(new Empleado(TipoEmpleado.GERENTE, "David"));
    empleados.add(new Empleado(TipoEmpleado.PROGRAMADOR, "Jacinto"));
    empleados.add(new Empleado(TipoEmpleado.GERENTE, "Maria"));
    empleados.add(new Empleado(TipoEmpleado.PROGRAMADOR, "Laura"));
    return empleados;
  }
}
