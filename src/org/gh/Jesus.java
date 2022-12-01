//  Think of package as a directory, we can import packages for reuse
package org.gh;


public class Jesus extends Person implements Printable{


    private String books;
 
    public void setFavbook(String books){
        this.books = books;
    }

    public String getFavbook(){
        return this.books;
    }
    
 
    public Jesus(String name, String book){
        super(name);
        this.setFavbook(books);
    }


    public String printMe(){

        return "Student details from PrintMe() - " + this.getName()+ " - "+this.getFavbook();
    }
}

