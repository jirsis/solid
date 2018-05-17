public class Volvo{
  private B20 engine;

  public Volvo(){
    engine = new B20();
  }

  public void drive(){
    System.out.println("Coduzco mi Volvo con motor "+engine);
  }
}
