public class UserService{

  private UserPersist persistance;
  private SmtpClient smtpClient;
  private MailValidator mailValidator;

  public UserService(){
    persistance = new UserPersist();
    smtpClient = new SmtpClient();
    mailValidator = new MailValidator();
  }

  public void register(String email, String password){
    mailValidator.validate(email);
    User user = new User(email, password);

    persistance.persist(user);
    notificate(email);
  }

  private void notificate(String email){
    MailMessage msg = new MailMessage("mysite@nowhere.com", email);
    smtpClient.send(msg);
  }
}
