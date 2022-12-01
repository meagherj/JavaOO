//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Student extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String grade;
    
    // set grade
    public void setGrade(String grade){
        this.grade = grade;
    }
    // get grade
    public String getGrade(){
        return this.grade;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public Student(String name, String grade){
        super(name);
        this.setGrade(grade);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Student details from PrintMe() - " + this.getName()+ " - "+this.getGrade();
    }
}
