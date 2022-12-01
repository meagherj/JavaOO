// Think of package as a directory, we can import packages for reuse
package org.gh;

// Create new public class called "Parent"
public class Parent extends Person implements Printable{

    // Attribute to store parent's class
    private String parentChild;

    // Constructor of taking name and parent's child as input
    public Teacher(String name, String parentChild){
        // Call superclass constructor (in this case Person)
        super (name);

        // Set the class for this parent
        this.setClasses(parentChild);
    }

    // Get parent child
    public String getParentChild(){
        return this.parentChild;
    }

    // Set parent child
    public void setParentChild(String parentChild){
        this.parentChild = parentChild;
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        return "Parent details from printMe() = " + this.getName()+ " - "+this.getParentChild();
    }
}
