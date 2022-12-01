package org.gh;

public class PK extends Person implements Printable{

    private String pokemonCaught;
    
    public void setPokemonCaught(String pokemonCaught){
        this.pokemonCaught = pokemonCaught;
    }

    public String getpokemonCaught(){
        return this.pokemonCaught;
    }

    public PK(String name, String pokemonCaught){
        super(name);
        this.setPokemonCaught(pokemonCaught);
    }
    
    public String printMe(){
        return "Pokemon Caught - " + this.getName()+ ", "+this.getpokemonCaught();
    }

}
