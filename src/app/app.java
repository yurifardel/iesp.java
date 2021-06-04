package app;

import controllers.*;

class App {
  public static RegisterController register = new RegisterController("yuri regis nascimento", 24, "cabedelo");
  public static LoginUserController login = new LoginUserController("yurifardel", "123456");
  public static FuncionarioController funcionario = new FuncionarioController("Yuri Regis", "Cabedelo", 24, 3500);
  public static CPFVoluntarioController cpf = new CPFVoluntarioController("404.504.302-23", "Yuri", 24, "Cabedelo");
  public static CNPJVoluntarioController cnpj =  new CNPJVoluntarioController("404.504.302-23", "AppTech", 0, "Joao pessoa");
  public static DonationController donation = new DonationController("em maos", 2000, "1323232323", "");
  public static void main(String[] args){
    try {
      // System.out.println(register);
      // System.out.println(login);
      // System.out.println(funcionario);
      // System.out.println(cpf);
      // System.out.println(cnpj);
      System.out.println(donation);

      


    } catch (Exception err) {
      System.out.println(err);
    }
  }
}