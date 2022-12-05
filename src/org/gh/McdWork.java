//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class McdWork extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String pay;
    
    // set grade
    public void setPay(String pay){
        this.pay = pay;
    }
    // get grade
    public String getPay(){
        return this.pay;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public McdWork(String name, String grade){
        super(name);
        this.setPay(pay);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "McdWork details from PrintMe() - " + this.getName()+ " - "+this.getPay();
    }
}
//1
