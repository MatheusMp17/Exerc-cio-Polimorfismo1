public class Main {
    public static void main (String[] args){
        Pokemon p1 = new PokemonNormal("Ratata", "Normal", 1, 1.1f, 1.1f, "", 1);
        Pokemon p2 = new PokemonFogo("Charmander", "Fogo", 2, 1.1f, 1.1f, "", 1);
        Pokemon p3 = new PokemonAgua("Mudkip", "Agua", 3, 1.1f, 1.1f, "", 1);
        Pokemon p4 = new PokemonPlanta("Treecko", "Planta", 4, 1.1f, 1.1f, "", 1);
        p2.atacar(p4, 1);
    }
}
