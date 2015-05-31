public class Empleado{
  private String nombre;
  private int sueldo;
  private int bono;
  private TipoEmpleado tipo;

  public Empleado(TipoEmpleado tipo, String nombre){
    this.tipo = tipo;
    this.nombre = nombre;
    if(tipo == TipoEmpleado.PROGRAMADOR){
      sueldo = 100;
    }else{
      sueldo = 150;
    }
  }

  public TipoEmpleado getTipo(){
    return tipo;
  }

  public int getSueldo(){
    return sueldo;
  }

  public int getBono(){
    return bono;
  }

  public void setBono(int bono){
    this.bono = bono;
  }

  public String toString(){
    return String.format("Empleado: %s [%d+%d]", nombre, sueldo, bono);
  }
}
