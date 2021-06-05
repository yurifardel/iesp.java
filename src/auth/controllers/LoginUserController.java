package auth.controllers;

public class LoginUserController {
  private String user;
  private String password;

  public LoginUserController(String user, String password){
    this.user = user;
    this.password = password;
  }

  public String getUser(){
    return user;
  }
  public void setUser(String user){
    this.user = user;
  }

  public String getPassword(){
    return password;
  }
  public void setPassword(String password){
    this.password = password;
  }

  @Override
  public String toString(){
    return "Usuario " + getUser() + " logado";
  }
  
}
