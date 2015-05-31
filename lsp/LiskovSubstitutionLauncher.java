public class LiskovSubstitutionLauncher{
  public static void main(String args[]){
    DuckImpl duck = new DuckImpl();
    ElectronicDuck cyborgDuck = new ElectronicDuck();
    duck.swim();
    cyborgDuck.swim(); 
  }
}
