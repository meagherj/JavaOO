package org.gh;

public class Senior extends Person implements Printable{

  private String gpa;
  
  public void setGpa(String gpa){
    this.gpa = gpa;
   
  }
  
  public String getGpa(){
    return this.gpa;
  }
  
  public Senior(String name, String gpa){
    super(name);
    this.setGpa(gpa);
  }
  
  public String printMe(){
    return "Senior details from PrintMe() - " + this.getName()+ " - "+this.getGpa();
  }
}
