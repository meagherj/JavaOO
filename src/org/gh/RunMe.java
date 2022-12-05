//  Think of package as a directory, we can import packages for reuse
package org.gh;

import java.io.ObjectOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

// Generic class to contain a main method for testing our structures
public class RunMe{

    // This is the "Start" of your program.  Java always starts at the "main" method
    public static void main(String args[]){
        // Create a new student, set a name and a grade
        // NOTE: since Student inherits from Person we also get person methods
        // see getName() and toString() below which are defined in Person
        System.out.println("Creating a new student and Teacher and Sophmore");
        Student objStudent = new Student("Student 1", "GradeA");
        Teacher objTeacher = new Teacher("Teacher 1", "Class#1, Class#2");
        Sophmore  objSophmore = new Sophmore("Sophmore 1", "Chemistry, Algebra 2");


        // Print details of a student we created above (name - grade)
        System.out.println("Print with name (from person) and grade (from student)");
        System.out.println(objStudent.getName() + " - " + objStudent.getGrade());


        // Print details of a Teacher we created above (name - classes)
        System.out.println("Print with name (from person) and Classes (from Teacher)");
        System.out.println(objTeacher.getName() + " - " + objTeacher.getClasses());
        
        System.out.println("Print with name (from person) and Classes (from Sophmore)");
        System.out.println(objSophmore.getName() + " - " + objSophmore.getkd());

        // This uses the polymorphism to call printMe and see different results
        System.out.println("Print the Student, teacher, and sophmore using the printMe method from Printable");
        System.out.println(objStudent.printMe());
        System.out.println(objTeacher.printMe());
        System.out.println(objSophmore.printMe());


        // Use the toString method of Student (not overriden from the Parent definition)
        System.out.println("Use the toString method in person since it's not overridden in the subclasses");
        System.out.println(objStudent);
        System.out.println(objTeacher);
        System.out.println(objSophmore);


        // Create a new object and print it 
        // This is to see what it looks like if you do not override the toString method
        Object obj = new Object();
        System.out.println("This will use the Object toString printing the class and memory location");
        System.out.println(obj);

        try{
            File f = new File("obj.out");
            f.createNewFile();
            FileOutputStream fOut = new FileOutputStream(f);
            ObjectOutputStream oOut = new ObjectOutputStream(fOut);
            oOut.writeObject(objStudent);
            oOut.writeObject(objTeacher);
            oOut.writeObject(objSophmore);
            oOut.close();
            fOut.close();
            System.out.println("Wrote the file, now reading it");

            FileInputStream fileIn = new FileInputStream("obj.out");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student readStudent = (Student) in.readObject();
            Teacher readTeacher = (Teacher) in.readObject();
            Sophmore readSophmore = (Sophmore) in.readObject();
            in.close();
            fileIn.close();
            System.out.println(readStudent.printMe());
            System.out.println(readTeacher.printMe());
            System.out.println(readSophmore.printMe());
            System.out.println("See above for results after read");
        }catch (Exception e){
            System.err.println("Caught:"+e.getMessage());
        }
    }
}
