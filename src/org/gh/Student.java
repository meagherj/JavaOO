//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Student extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String grade;
    private String gpa;
    
    // set grade
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setgpa(String gpa){
        this.gpa = gpa;
    }
    // get grade
    public String getGrade(){
        return this.grade;
    }
    public String getGpa(){
        return this.gpa;
    }
    
    // constructor called to create a new student object
    //  See it's usage in RunMe
    public Student(String name, String grade){
        super(name);
        this.setGrade(grade);
    }
    public Senior(String name, String gpa){
        super(name);
        this.setGpa(gpa);
    }


    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Student details from PrintMe() - " + this.getName()+ " - "+this.getGrade();
    }
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Senior details from PrintMe() - " + this.getName()+ " - "+this.getGpa();
    }
}
