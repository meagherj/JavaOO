package org.gh;

public class Parent extends Person implements Printable{

    private String children;

    public Teacher(String name, String children){
        super (name);

        this.setChildren(children);
    }

    public String getChildren(){
        return this.children;
    }

    public void setChildren(String children){
        this.children = children;
    }

    public String printMe(){
        return "Parent details from printMe() = " + this.getName()+ " - "+this.getChildren();
    }
}
