package controllers;

public class CPFVoluntarioController extends RegisterController {
  
  private String cpf;

  public CPFVoluntarioController(String cpf, String name, int age, String address){
    super(name, age, address);
    this.cpf = cpf;

    if(this.cpf == ""){
      return;
    }

    if(this.cpf.length() != 11){
      return;
    }

  }

  public String getCPF(){
    return cpf;
  }

  public void setCPF(String cpf){
    this.cpf = cpf;
  }
  
  @Override
  public String toString(){
    return (
      "Nome do voluntario: " + getName() + "\n" + 
      "Idade do voluntario: " + getAge() + "\n" +
      "CPF do voluntario: " + getCPF() + "\n" +
      "Endereço do voluntario: " + getAddress()
    );
  }
  
}
