public class B20 implements Engine{
  private String cc;
  public B20(){
    cc="1986cc";
  }

  public String getCC(){
    return cc;
  }
  
  public String toString(){
    return getCC();
  }
}
