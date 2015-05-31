public class B18 implements Engine{
  private String cc;
  public B18(){
    cc="1778cc";
  }

  public String getCC(){
    return cc;
  }

  public String toString(){
    return getCC();
  }
}
