public class InterfaceSegregationLauncher{
  public static void main(String args []){
    Perro laica = new Perro();
    laica.alimentar();
    laica.acariciar();

    Escorpion escorpion = new Escorpion();
    escorpion.alimentar();
  }
}
