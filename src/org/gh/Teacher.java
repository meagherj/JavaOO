//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Advisor the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Advisor extends Person implements Printable{

    // attribute to store advisor's class
    private String folder;

    // Constructor of tacher taking a name and class as input
    public Adivsor(String name, String folder){
        // Call superclass constructor (in this case Person)
        super (name);

        // Set the class for this advisor
        this.setFolder(folder);
    }

    // get Class
    public String getFolder(){
        return this.folder;
    }

    // Set class
    public void setFolder(String folder){
        this.folder = folder;
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        return "Advisor details from printMe() = " + this.getName()+ " - "+this.getFolder();
    }
}
