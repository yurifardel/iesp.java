package auth.controllers;

import java.util.Date;

public class EventoController {
  private String codigo;
  private String evento;
  private double custosEvento;

  public EventoController(String codigo, String evento, double custosEvento){
    this.codigo = codigo;
    this.evento = evento;
    this.custosEvento = custosEvento;
  }

  public Object getCreatedAt(){
    Date d = new Date();
    return d;
  }

  public String getCodigo(){
    return codigo;
  }

  public void setCodigo(String codigo){
    this.codigo = codigo;
  }

  public String getEvento(){
    return evento;
  }

  public void setEvento(String evento){
    this.evento = evento;
  }

  public double getCustosEvento(){
    return custosEvento;
  }

  public void setCustosEvento(double custosEvento){
    this.custosEvento = custosEvento;
  }

  @Override
  public String toString(){
    return(
      "Codigo do evento: " + getCodigo() + "\n" +
      "Nome do evento: " + getEvento() +  "\n" +
      "Custos do evento: " + getCustosEvento()
    );
  }
}
