public class UserService{

  private DataBase _database;
  private SmtpClient _smtpClient;

  public UserService(){
    _database = new DataBase();
    _smtpClient = new SmtpClient();
  }

  public void register(String email, String password){
    if (!email.contains("@"))
      throw new ValidationException("Email is not an email!");
    User user = new User(email, password);
    _database.save(user);
    MailMessage msg = new MailMessage("mysite@nowhere.com", email);
    _smtpClient.send(msg);
   }
}
