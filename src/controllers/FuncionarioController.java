package controllers;


public class FuncionarioController extends RegisterController{
  private double salary;

  public FuncionarioController(String name, String address, int age, double salary){
    super(name, age, address);
    this.salary = salary;
  };
  
  public double getSalary(){
    return salary;
  }

  public void setSalary(double salary){
    this.salary = salary;
  }
  

  @Override
  public String toString(){
    return (
      "Nome do funcionario: " + getName() 
      + '\n' + "Saldo do salario: " + getSalary() + "\n"
    );
  }

}
