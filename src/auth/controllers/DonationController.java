package auth.controllers;

import java.util.Date;


public class DonationController {
  // private Object data; 

  private String entrega;
  private double valor;
  
  private String cpf;
  private String cnpj;


  public DonationController( String entrega, double valor, String cpf, String cnpj){
    this.entrega = entrega;
    this.valor = valor;
    this.cpf = cpf;
    this.cnpj = cnpj;
  }
  public Object getData(){
    Date d = new Date();

    return d;
  }

  public String getEntrega(){
    return entrega;
  }

  public void setEntrega(String entrega){
    this.entrega = entrega;
  }

  
  public double getValor(){
    return valor;
  }

  public void setValor(double valor){
    this.valor = valor;
  }

  
  public String getCPF(){
    return cpf;
  }

  
  public void setCPF (String cpf){
    this.cpf = cpf;
  }

  public String cnpj(){
    return cnpj;
  }

  
  public void setCNPJ (String cnpj){
    this.cnpj = cnpj;
  }

  @Override
  public String toString(){

    if(this.cpf != ""){
      return "CreatedAt: " + getData();
    
    }else{
        return "CreatedAt: " + getData();
    }
  }

}
