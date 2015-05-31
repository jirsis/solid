public class ElectronicDuck implements Duck{
  private boolean isTurnedOn = false;
  public void swim(){
      if (!isTurnedOn){
        enableTurnedOn();
        swim();
      }else{
        System.out.println("My electronic duck is swimming");
      }
  }

  private void enableTurnedOn(){
    isTurnedOn = true;
  }
}
