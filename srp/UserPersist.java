public class UserPersist{
  private DataBase database;

  public UserPersist(){
    database = new DataBase();
  }

  public void persist(User user){
    database.save(user);
  }
}
