public class Gerente extends Empleado{
  public Gerente(String nombre){
    super(nombre, 200);
  }

  public void calcularBono(){
    super.setBono(getSueldo() * 15);
  }
}
