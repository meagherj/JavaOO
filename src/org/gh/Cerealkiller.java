package org.gh;

public class Cerealkiller extends Person implements Printable{

  private String kd;
  
  public void setKd(String kd){
    this.kd = kd;
   
  }
  
  public String getKd(){
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
