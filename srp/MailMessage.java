public class MailMessage{
  private String from;
  private String to;

  public MailMessage(String from, String to){
    this.from=from;
    this.to=to;
  }

  public String toString(){
    return from+"->"+to;
  }
}
