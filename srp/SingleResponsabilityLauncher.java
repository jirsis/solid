public class SingleResponsabilityLauncher{
  public static void main(String args []){
    UserService service = new UserService();
    service.register("mi@correo.es", "superSecretPassword");
  }

}
