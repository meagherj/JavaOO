//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Friend extends Person implements Printable{

    // attribute to store students age 
    // NOTE: it's private, so we provide a getter and setter
    private String age;
    
    // set age
    public void setAge(String age){
        this.age = age;
    }
    // get age
    public String getAge(){
        return this.age;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public Friend(String Friend, String age){
        super(age);
        this.setAge(age);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and age to print
        return "Friend details from PrintMe() - " + this.getName()+ " - "+this.getAge();
    }
}
