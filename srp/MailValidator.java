public class MailValidator{

  public void validate(String email){
    if (!email.contains("@"))
      throw new ValidationException("Email is not an email!");
  }
}
