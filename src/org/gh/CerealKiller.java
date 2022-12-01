package org.gh;

public class CerealKiller extends Person implements Printable{

  private string KD;
  
  public void setKD(String KD){
    this.grade = grade;
   
  }
  
  public String getKD(){
    return this.KD;
  }
  
  public CerealKiller(String name, String KD){
    super(name);
    this.setKD(KD);
  }
  
  public String printMe(){
    return "CerealKiller details from PrintMe() - " + this.getName()+ " - "+this.getKD();
  }
  
}
