public class LiskovSubstitutionLauncher{
  public static void main(String args[]){
    DuckImpl duck = new DuckImpl();
    ElectronicDuck cyborgDuck = new ElectronicDuck();
    duck.swim();

    if(!cyborgDuck.swim()){
      System.out.println("My cyborgDuck is off");
      cyborgDuck.enableTurnedOn();
      cyborgDuck.swim();
    }
  }
}
