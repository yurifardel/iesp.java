package auth.controllers.helpers;

import auth.controllers.RegisterController;

public class CNPJVoluntarioController extends RegisterController{
  private String CNPJ;

  public CNPJVoluntarioController(String cnpj, String name, int age, String address){
    super(name, age, address);
    this.CNPJ = cnpj;
  }

  public String getCNPJ(){
    if(this.CNPJ == ""){
      return "** Informe seu CPF **";
    }
    return CNPJ;
  }

  public void setCNPJ(String cnpj){
    this.CNPJ = cnpj;
  }

  @Override
  public String toString(){
    return(
      "Nome da empresa: " + getName() + "\n" +
      "Endereço da empresa: " + getAddress() + "\n" +
      "CNPJ da empresa: " + getCNPJ() + "\n" 
    );
  }
}
