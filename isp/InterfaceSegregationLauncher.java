public class InterfaceSegregationLauncher{
  public static void main(String args []){
    Animal laica = new Perro();
    laica.alimentar();
    laica.acariciar();
    
    Animal escorpion = new Escorpion();
    escorpion.alimentar();
    escorpion.acariciar();
  }
}
