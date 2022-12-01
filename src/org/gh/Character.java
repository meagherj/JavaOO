//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Character extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String action;
    
    
    // set grade
    public void setAction(String action){
        this.action = action;
    }
    // get grade
    public String getAction(){
        return this.action;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public Character(String Character, String action){
        super(action);
        this.setAction(action);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Character details from PrintMe() - " + this.getName()+ " - "+this.getAction();
    }
}
