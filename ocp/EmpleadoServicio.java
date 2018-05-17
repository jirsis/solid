import java.util.List;

public class EmpleadoServicio {

  private List<Empleado> empleados;

  public EmpleadoServicio(List<Empleado> empleados){
    this.empleados = empleados;
  }

  public void calcularBonos(){
    for(Empleado empleado : empleados){
      empleado.calcularBono();
      System.out.println(empleado);
    }
  }
}
