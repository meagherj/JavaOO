package org.gh;

public class Cerealkiller extends Person implements Printable{

  private String kd;
  
  public void setKd(String kd){
    this.Kd = kd;
   
  }
  
  public String getKk(){
    return this.kd;
  }
  
  public Cerealkiller(String name, String kd){
    super(name);
    this.setKd(kd);
  }
  
  public String printMe(){
    return "Cerealkiller details from PrintMe() - " + this.getName()+ " - "+this.getKd();
  }
  
}
