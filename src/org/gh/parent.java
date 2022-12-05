
package org.gh;


public class parent extends Person implements Printable{


    private String kids;

    public parent(String name, String kids){
 
        super (name);


        this.setKids(kids);
    }

    // get Class
    public String getKids(){
        return this.kids;
    }

    // Set class
    public void setKids(String kids){
        this.kids = kids;
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        return "Parent details from printMe() = " + this.getName()+ " - "+this.getKids();
    }
}
