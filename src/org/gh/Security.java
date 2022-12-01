package org.gh;

public class Security extends Person implements Printable{

    private String shifts;
   
    public Teacher(String name, String shifts){
        super (name);

        this.setShifts(shifts);
    }

    public String getShifts(){
        return this.shifts;
    }

    public void setShifts(String shifts){
        this.shifts = shifts;
    }

    public String printMe(){
        return " Security details from printMe() = " + this.getName()+ " - "+this.getShifts();
    }
}
