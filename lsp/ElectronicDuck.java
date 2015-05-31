public class ElectronicDuck implements Duck{
  private boolean isTurnedOn = false;
  public void swim(){
      if (!isTurnedOn)
        return;
      System.out.println("My electronic duck is swimming");
  }
}
