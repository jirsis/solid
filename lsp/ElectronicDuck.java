public class ElectronicDuck implements Duck{
  private boolean isTurnedOn = false;

  public void enableTurnedOn(){
    isTurnedOn = true;
  }
  public boolean swim(){
      if (!isTurnedOn)
        return false;
      System.out.println("My electronic duck is swimming");
      return true;
  }
}
