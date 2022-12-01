package org.gh;

// extends Student means we inherit from Student
// This gives Senior the ability to use Student methods and attributes
// implements Printable means we must override the methods in that interface
public class Senior extends Student implements Printable{

    // attribute to store a seniors gpa 
    // NOTE: it's private, so we provide a getter and setter
    private String gpa;
    
    // set grade
    public void setGpa(String gpa){
        this.gpa = gpa;
    }
    // get gpa
    public String getgpa(){
        return this.gpa;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public Senior(String Senior, String gpa){
        super(gpa);
        this.setGpa(gpa);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Senior details from PrintMe() - " + this.getName()+ " - "+this.getGpa();
    }
}


