import java.util.List;

public class EmpleadoServicio{

  private List<Empleado> empleados;

  public EmpleadoServicio(List<Empleado> empleados){
    this.empleados = empleados;
  }

  public void calcularBonos(){
    for(Empleado empleado : empleados){
      int bono = 0;
      switch(empleado.getTipo()){
        case PROGRAMADOR:
          bono = empleado.getSueldo()*2;
          break;
        case GERENTE:
          bono = empleado.getSueldo()*10;
          break;
      }
      empleado.setBono(bono);
    }
  }
}
