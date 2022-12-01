//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Teacher the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Teach extends Person implements Printable{

    // attribute to store teacher's class
    private String classes;

    // Constructor of tacher taking a name and class as input
    public Teach(String name, String classes){
        // Call superclass constructor (in this case Person)
        super (name);

        // Set the class for this teacher
        this.setClasses(classes);
    }

    // get Class
    public String getClasses(){
        return this.classes;
    }

    // Set class
    public void setClasses(String classes){
        this.classes = classes;
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        return "Teacher details from printMe() = " + this.getName()+ " - "+this.getClasses();
    }
}
