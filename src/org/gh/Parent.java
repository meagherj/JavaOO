package org.gh;

public class Teacher extends Person implements Printable{

    private String classes;

    public Teacher(String name, String students){
        super (name);

        this.setStudents(students);
    }

    public String getStudents(){
        return this.students;
    }

    public void setStudents(String students){
        this.classes = students;
    }

    public String printMe(){
        return "Teacher details from printMe() = " + this.getName()+ " - "+this.getClasses();
    }
}
