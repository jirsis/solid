public abstract class Empleado{
  private String nombre;
  private int sueldo;
  private int bono;

  public Empleado(String nombre, int sueldo){
    this.nombre = nombre;
    this.sueldo = sueldo;
  }

  public void setBono(int bono){
    this.bono = bono;
  }

  public int getBono(){
    return bono;
  }

  public int getSueldo(){
    return sueldo;
  }
  
  public String toString(){
    return String.format("Empleado: %s [%d+%d]", nombre, sueldo, bono);
  }

  abstract void calcularBono();
}
