//  Think of package as a directory, we can import packages for reuse
package org.gh;

// extends Parent means we inherit from Parent
// This gives Student the ability to use Parent methods and attributes
// implements Printable means we must override the methods in that interface
public class Food extends Person implements Printable{

    // attribute to store students grade 
    // NOTE: it's private, so we provide a getter and setter
    private String recipe;
    
    // set recipe
    public void setRecipe(String recipe){
        this.recipe = recipe;
    }
    // get recipe
    public String getRecipe(){
        return this.recipe;
    }
    
    // constructor called to create a new food object
    //  See it's usage in RunMe
    public Food(String food, String recipe){
        super(recipe);
        this.setRecipe(recipe);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        // For a student, I want the name and grade to print
        return "Student details from PrintMe() - " + this.getName()+ " - "+this.getRecipe();
    }
}
