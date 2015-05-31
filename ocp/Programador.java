public class Programador extends Empleado{
  public Programador(String nombre){
    super(nombre, 100);
  }

  public void calcularBono(){
    setBono(getSueldo()*2);
  }

}
