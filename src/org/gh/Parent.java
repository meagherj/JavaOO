package org.gh;

public class Parent extends Person implements Printable{
  private String child;
  public Parent(String name, String child){
    super(name);
    
    this.setChild(child); 
  }
      
  public String getChild(){
    return this.child;
  }
  
  public void setChild(String child){
    this.child = child; 
  }
  
  public String printMe(){
    return "Parent info from printMe() = " + this.getName()+ " - "+ this.getChild();
  }
}

