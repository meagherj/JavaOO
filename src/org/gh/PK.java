package org.gh;

public class PK extends Person implements Printable{

    private String pokemonCaught;
    private String isTen;
    
    public void setPokemonCaught(String pokemonCaught){
        this.pokemonCaught = pokemonCaught;
    }

    public String getpokemonCaught(){
        return this.pokemonCaught;
    }
    
    public String isHeTen(){
        return this.isTen;   
    }

    public PK(String name, String pokemonCaught, String isTen){
        super(name);
        this.setPokemonCaught(pokemonCaught);
        this.isTen = isTen;
    }
    
    public String printMe(){
        return "Pokemon Caught - " + this.getName()+ ", "+this.getpokemonCaught()+ ", Is he ten?"+this.isHeTen() ;
    }

}
