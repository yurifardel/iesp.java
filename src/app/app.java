package app;

import controllers.*;

class App {
  public static RegisterController register = new RegisterController("yuri regis nascimento", 24, "cabedelo");
  public static LoginUserController login = new LoginUserController("yurifardel", "123456");
  public static FuncionarioController funcionario = new FuncionarioController("Yuri Regis", "Cabedelo", 24, 3500);
  public static void main(String[] args){
    System.out.println(register);
    System.out.println(login);
    System.out.println(funcionario);    
  }
}