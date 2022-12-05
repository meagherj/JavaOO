//  Think of package as a directory, we can import packages for reuse
package org.gh;

public class Principal extends Person implements Printable{

    private String StudentsAttended;
    private String facultyMeeting;
    
    public void StudentsAttended(String StudentsAttended){
        this.StudentsAttended = StudentsAttended;
    }

    public String StudentsAttended(){
        return this.StudentsAttended;
    }
    
    public String isHeTen(){
        if (this.facultyMeeting == "Yes") {
            return "Remember to stay after school";
        }else{
            return "No meetings!";
            }
    }

    public Principal(String name, String StudentsAttended, String facultyMeeting){
        super(name);
        this.StudentsAttendedt(StudentsAttended);
        this.facultyMeeting = facultyMeeting;
    }
    
    public String printMe(){
        return "Students Attended - " + this.getName()+ ", "+this.StudentsAttended()+ ", Are you busy? "+this.facultyMeeting() ;
    }

}
