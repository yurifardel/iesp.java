package app;

import controllers.*;

class App {
  public static RegisterController register = new RegisterController("yuri regis nascimento", 24, "cabedelo");

  public static void main(String[] args){

    
    System.out.println(register);
    
  }
}