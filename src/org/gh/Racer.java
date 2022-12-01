//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Racer extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String time;
    
    // set grade
    public void setTime(String time){
        this.time = time;
    }
    // get grade
    public String getTime(){
        return this.time;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public Racer(String name, String time){
        super(name);
        this.setTime(time);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Racer details from PrintMe() - " + this.getName()+ " - "+this.getTime();
    }
}
