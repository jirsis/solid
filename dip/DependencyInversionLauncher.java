public class DependencyInversionLauncher{
  public static void main(String args[]){
    Volvo car = new Volvo(new B18());
    car.drive();

    car = new Volvo(new B20());
    car.drive();
  }
}
